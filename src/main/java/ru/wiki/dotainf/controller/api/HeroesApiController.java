package ru.wiki.dotainf.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.wiki.dotainf.controller.api.reader.JsonReader;
import ru.wiki.dotainf.database.tables.Heroes;
import ru.wiki.dotainf.database.repository.HeroesRepository;
import ru.wiki.dotainf.utilities.HeroStats;

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

    @GetMapping("/hero-stats/{heroName}")
    public ResponseEntity<HeroStats> getHeroStatsById(@PathVariable(value = "heroName") String heroName) {
        try {
            if (heroName == null) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            HeroStats heroStats = JsonReader.getHeroFromApiJson(
                    heroName,
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

}
