package ru.wiki.dotainf.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.wiki.dotainf.database.tables.Attributes;

import java.util.List;

public interface AttributesRepository extends JpaRepository<Attributes, Integer> {
    List<Attributes> findAllByItemid(Integer id);
}
