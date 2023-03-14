package ru.wiki.dotainf.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.wiki.dotainf.database.repository.HeroesRepository;
import ru.wiki.dotainf.database.tables.Heroes;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/admin/heroes")
public class HeroesAdminApiController {
    @Autowired
    HeroesRepository heroesRepository;

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteHeroById(@RequestParam(name = "id") Long id) {
        Heroes heroes = heroesRepository.findHeroById(id);
        if (heroes == null) {
            return new ResponseEntity<>(
                    "Герой с ID = " + id.toString() + " отсутствует в базе",
                    HttpStatus.NOT_FOUND
            );
        }
        try {
            heroesRepository.deleteById(id);
            String msg = "Герой с ID = " + id + " был удален из базы heroes\n" + heroes;
            heroesRepository.flush();
            return new ResponseEntity<>(
                    msg,
                    HttpStatus.OK
            );
        } catch (Exception e) {
            return new ResponseEntity<>(e.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<String> addHero(
            @RequestParam(name = "id") Long id,
            @RequestParam(name = "hname") String name,
            @RequestParam(name = "hattr") String attr,
            @RequestParam(name = "hrole") String role
    ) {
        if (heroesRepository.findHeroById(id) != null) {
            return new ResponseEntity<>(
              "Герой с ID = " + id.toString() + " уже существует в базе\n" +
                      heroesRepository.findHeroById(id).toString(),
              HttpStatus.FOUND
            );
        }

        if (heroesRepository.findHeroByHeroName(name) != null) {
            return new ResponseEntity<>(
                    "Герой с именем '" + name + "' уже существует в базе" +
                            heroesRepository.findHeroByHeroName(name).toString(),
                    HttpStatus.FOUND
            );
        }

        try {
            Heroes newHero = new Heroes();
            newHero.setId(id);
            newHero.setHeroName(name);
            newHero.setHeroAttribute(attr);
            newHero.setHeroRole(role);
            heroesRepository.saveAndFlush(newHero);
            return new ResponseEntity<>(
                    "Новый герой успешно добавлен в базу\n" +
                            heroesRepository.findHeroById(id).toString(),
                    HttpStatus.OK
            );
        } catch (Exception e) {
            return new ResponseEntity<>(e.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/updateNameById")
    public ResponseEntity<String> updateNameById(
            @RequestParam(name = "id") Long id,
            @RequestParam(name = "newName") String newName
    ) {
        Heroes hero = heroesRepository.findHeroById(id);
        if (hero == null) {
            return new ResponseEntity<>(
                    "Герой с ID = " + id.toString() + " отсутствует в базе",
                    HttpStatus.NOT_FOUND
            );
        }
        if (hero.getHeroName().equals(newName)) {
            return new ResponseEntity<>(
                    "Изначальное имя героя (ID = " + id + ") соответствует новому значению\n" +
                            hero,
                    HttpStatus.NOT_MODIFIED
            );
        }
        try {
            hero.setHeroName(newName);
            heroesRepository.saveAndFlush(hero);
            return new ResponseEntity<>(
                    "Имя героя (ID = " + id + ") успешно обновлено\n" + hero,
                    HttpStatus.OK
            );
        } catch (Exception e) {
            return new ResponseEntity<>(e.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
