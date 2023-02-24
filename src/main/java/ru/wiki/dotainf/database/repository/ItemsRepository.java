package ru.wiki.dotainf.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.wiki.dotainf.database.tables.Items;

public interface ItemsRepository extends JpaRepository<Items, Integer> {
    Items findItemsById(Integer id);
    Items findItemsByNodeName(String nodeName);
}
