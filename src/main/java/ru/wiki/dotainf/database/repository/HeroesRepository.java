package ru.wiki.dotainf.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.wiki.dotainf.database.tables.Heroes;

import java.util.List;

public interface HeroesRepository extends JpaRepository<Heroes, Long> {
    List<Heroes> findByHeroNameContaining(String infix);
    Heroes findHeroById(Long id);
}
