package ru.wiki.dotainf.controller.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.wiki.dotainf.database.repository.AttributesRepository;
import ru.wiki.dotainf.database.repository.ComponentsRepository;
import ru.wiki.dotainf.database.repository.HeroesRepository;
import ru.wiki.dotainf.database.repository.ItemsRepository;
import ru.wiki.dotainf.database.tables.Attributes;
import ru.wiki.dotainf.database.tables.Components;
import ru.wiki.dotainf.database.tables.Items;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping("/items")
class ItemsController {
    @Autowired
    AttributesRepository attributesRepository;
    @Autowired
    ComponentsRepository componentsRepository;
    @Autowired
    ItemsRepository itemsRepository;

    @GetMapping
    public String items(Model model) {
        List<Items> items = itemsRepository.findAll();
        items.sort(Comparator.comparing(Items::getId));
        items.removeIf(item -> (item.getNodeName().startsWith("recipe_")));
        items.removeIf(item -> (item.getDname() == null));
        items.removeIf(item -> (item.getDname().isEmpty()));
        model.addAttribute("items", items);
        return "entities/items";
    }

    @GetMapping("/{id}")
    public String item(@PathVariable("id") Integer id, Model model) {
        Items item = itemsRepository.findItemsById(id);
        List<Attributes> attributes = attributesRepository.findAllByItemid(id);
        List<Components> components = componentsRepository.findAllByItemid(id);
        for (Items i : itemsRepository.findAll()) {
            if (i.getNodeName().startsWith("recipe_") && i.getNodeName().endsWith(item.getNodeName())) {
                components.add(new Components(
                        components.size(),
                        i.getId(),
                        i.getNodeName()
                ));
                break;
            }
        }
        model.addAttribute("item", item);
        model.addAttribute("itemsRepo", itemsRepository);
        model.addAttribute("attr", attributes);
        model.addAttribute("comp", components);
        return "entities/item";
    }

}
