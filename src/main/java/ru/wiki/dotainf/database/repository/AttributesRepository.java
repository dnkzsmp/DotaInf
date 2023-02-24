package ru.wiki.dotainf.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.wiki.dotainf.database.tables.Attributes;

public interface AttributesRepository extends JpaRepository<Attributes, Integer> {

}
