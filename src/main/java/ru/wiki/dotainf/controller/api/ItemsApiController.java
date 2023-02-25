package ru.wiki.dotainf.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.wiki.dotainf.database.repository.AttributesRepository;
import ru.wiki.dotainf.database.repository.ComponentsRepository;
import ru.wiki.dotainf.database.repository.ItemsRepository;
import ru.wiki.dotainf.database.tables.Attributes;
import ru.wiki.dotainf.database.tables.Components;
import ru.wiki.dotainf.database.tables.Items;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/items")
public class ItemsApiController {
    @Autowired
    AttributesRepository attributesRepository;
    @Autowired
    ComponentsRepository componentsRepository;
    @Autowired
    ItemsRepository itemsRepository;

    @GetMapping
    public ResponseEntity<List<Items>> getItems() {
        try {
            List<Items> items = itemsRepository.findAll();
            if (items.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(items, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Items> getItemById(@PathVariable("id") Integer id) {
        try {
            Items item = itemsRepository.findItemsById(id);
            if (item == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(item, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}/components")
    public ResponseEntity<List<Components>> getItemComponentsById(@PathVariable("id") Integer id) {
        try {
            List<Components> components = componentsRepository.findAllByItemid(id);
            if (components == null || components.isEmpty()) {
                return new ResponseEntity<>(new ArrayList<>(), HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(components, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}/attributes")
    public ResponseEntity<List<Attributes>> getItemAttributesById(@PathVariable("id") Integer id) {
        try {
            List<Attributes> attributes = attributesRepository.findAllByItemid(id);
            if (attributes == null || attributes.isEmpty()) {
                return new ResponseEntity<>(new ArrayList<>(), HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(attributes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
