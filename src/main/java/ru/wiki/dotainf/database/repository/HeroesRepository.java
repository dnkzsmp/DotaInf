package ru.wiki.dotainf.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.wiki.dotainf.database.tables.Heroes;

public interface HeroesRepository extends JpaRepository<Heroes, Long> {
}
