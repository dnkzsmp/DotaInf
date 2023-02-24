package ru.wiki.dotainf.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.wiki.dotainf.database.tables.Components;

import java.util.List;

public interface ComponentsRepository extends JpaRepository<Components, Integer> {
    List<Components> findAllByItemid(Integer id);
}
