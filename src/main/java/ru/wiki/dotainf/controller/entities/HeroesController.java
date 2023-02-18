package ru.wiki.dotainf.controller.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.wiki.dotainf.reader.JsonReader;
import ru.wiki.dotainf.database.tables.Heroes;
import ru.wiki.dotainf.database.repository.HeroesRepository;
import ru.wiki.dotainf.utilities.HeroStats;
import ru.wiki.dotainf.utilities.HeroesSearch;

import java.net.URL;
import java.util.List;

@Controller
@RequestMapping("/heroes")
public class HeroesController {
    @Autowired
    HeroesRepository heroesRepository;

    @GetMapping
    public String heroes(Model model) {
        List<Heroes> heroes = heroesRepository.findAll();
        model.addAttribute("heroes", heroes);
        model.addAttribute("heroesSearch", new HeroesSearch());
        return "entities/heroes";
    }

    @PostMapping
    public String heroesSearch(@ModelAttribute HeroesSearch heroesSearch, Model model) {
        List<Heroes> heroes = heroesRepository.findByHeroNameContaining(heroesSearch.getSearchText());
        model.addAttribute("heroes", heroes);
        return "entities/heroes";
    }

    @GetMapping("/hero-stats/{heroName}")
    public String heroStats(@PathVariable("heroName") String heroName, Model model) throws Exception {
        HeroStats heroStats = JsonReader.getHeroStatsFromApiJson(
                heroName,
                new URL("https://api.opendota.com/api/heroStats")
        );
        if (heroStats == null) {
            throw new Exception("Героя под именем " + heroName + " не существует");
        }
        model.addAttribute("heroStats", heroStats);
        model.addAttribute("winRates", heroStats.getWinRates());
        return "entities/hero-stats";
    }
}
