package ru.wiki.dotainf.controller.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.wiki.dotainf.database.repository.HeroesRepository;
import ru.wiki.dotainf.database.repository.ItemsRepository;
import ru.wiki.dotainf.database.tables.Heroes;
import ru.wiki.dotainf.reader.JsonReader;
import ru.wiki.dotainf.utilities.hero.HeroMatches;
import ru.wiki.dotainf.utilities.hero.HeroMatchups;
import ru.wiki.dotainf.utilities.hero.HeroStats;
import ru.wiki.dotainf.utilities.hero.HeroesSearch;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/heroes")
public class HeroesController {
    @Autowired
    HeroesRepository heroesRepository;

    @Autowired
    ItemsRepository itemsRepository;


    @GetMapping
    public String heroes(Model model) {
        List<Heroes> heroes = heroesRepository.findAll();
        heroes.sort(Comparator.comparing(Heroes::getHeroName));
        model.addAttribute("heroes", heroes);
        model.addAttribute("heroesSearch", new HeroesSearch());
        return "entities/heroes";
    }

    @PostMapping
    public String heroesSearch(@ModelAttribute HeroesSearch heroesSearch, Model model) {
        List<Heroes> heroes = heroesRepository.findAll();
        heroes.removeIf(hero -> (
                !hero.getHeroName().toLowerCase().contains(heroesSearch.getSearchText().toLowerCase()))
        );
        heroes.sort(Comparator.comparing(Heroes::getHeroName));
        model.addAttribute("heroes", heroes);
        return "entities/heroes";
    }

    @GetMapping("/hero-stats/{id}")
    public String heroStats(@PathVariable("id") Long id, Model model) throws Exception {
        HeroStats heroStats = JsonReader.getHeroStatsFromApiJson(
                id.intValue(),
                new URL("https://api.opendota.com/api/heroStats")
        );
        if (heroStats == null) {
            throw new Exception("Героя под ID = " + id + " не существует");
        }

        String roles = Arrays.toString(heroStats.getRoles().toArray())
                .replace("[", "")
                .replace("]", "")
                .replace(", ", " | ");

        model.addAttribute("roles", roles);
        model.addAttribute("heroStats", heroStats);
        model.addAttribute("winRates", heroStats.getWinRates());
        return "entities/hero-stats";
    }

    @GetMapping("/hero-matches/{id}")
    public String heroMatches(@PathVariable("id") Integer id, Model model) throws Exception {
        List<HeroMatches> heroMatches = JsonReader.getHeroMatchesFromApi(
                new URL("https://api.opendota.com/api/heroes/" + id + "/matches")
        );
        List<HeroMatchups> heroMatchups = JsonReader.getHeroMatchupsFromApi(
                new URL("https://api.opendota.com/api/heroes/" + id + "/matchups")
        );
        String heroName = heroesRepository.findHeroById(id.longValue()).getHeroName();

        model.addAttribute("heroMatches", heroMatches);
        model.addAttribute("heroMatchups", heroMatchups);
        model.addAttribute("heroName", heroName);
        model.addAttribute("heroId", id);
        model.addAttribute("heroes", heroesRepository);
        return "entities/hero-matches";
    }

    @GetMapping("/hero-items/{id}")
    public String heroItems(@PathVariable("id") Integer id, Model model) throws IOException {
        List<HashMap<Integer, Integer>> itemStages = JsonReader.getItemStagesByIdFromApi(id);
        String heroName = heroesRepository.findHeroById(id.longValue()).getHeroName();

        model.addAttribute("id", id);
        model.addAttribute("itemStages", itemStages);
        model.addAttribute("heroName", heroName);
        model.addAttribute("itemsRepository", itemsRepository);
        return "entities/hero-items";
    }

}
