package ru.wiki.dotainf.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.wiki.dotainf.reader.JsonReader;
import ru.wiki.dotainf.database.tables.Heroes;
import ru.wiki.dotainf.database.repository.HeroesRepository;
import ru.wiki.dotainf.utilities.hero.HeroMatches;
import ru.wiki.dotainf.utilities.hero.HeroMatchups;
import ru.wiki.dotainf.utilities.hero.HeroStats;

import java.net.URL;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/heroes")
public class HeroesApiController {

    @Autowired
    HeroesRepository heroesRepository;

    @GetMapping
    public ResponseEntity<List<Heroes>> getAllHeroes() {
        try {
            List<Heroes> heroes = heroesRepository.findAll();
            if (heroes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(heroes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/hero-stats/{id}")
    public ResponseEntity<HeroStats> getHeroStatsById(@PathVariable(value = "id") Integer id) {
        try {
            if (id == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            HeroStats heroStats = JsonReader.getHeroStatsFromApiJson(
                    id,
                    new URL("https://api.opendota.com/api/heroStats")
            );
            if (heroStats == null) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(heroStats, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/hero-matches/leagues/{id}")
    public ResponseEntity<List<HeroMatches>> getHeroLeagueMatchesById(@PathVariable(value = "id") Integer id)  {
        try {
            if (id == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            List<HeroMatches> heroMatches = JsonReader.getHeroMatchesFromApi(
                    new URL("https://api.opendota.com/api/heroes/" + id + "/matches")
            );
            if (heroMatches.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(heroMatches, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/hero-matches/matchups/{id}")
    public ResponseEntity<List<HeroMatchups>> getHeroMatchupsById(@PathVariable(value = "id") Integer id) {
        try {
            if (id == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            List<HeroMatchups> heroMatchups = JsonReader.getHeroMatchupsFromApi(
                    new URL("https://api.opendota.com/api/heroes/" + id + "/matchups")
            );
            if (heroMatchups.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(heroMatchups, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
