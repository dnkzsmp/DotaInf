package ru.wiki.dotainf.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.wiki.dotainf.database.repository.ItemsRepository;
import ru.wiki.dotainf.database.tables.Items;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/admin/items")
public class ItemsAdminApiController {
    @Autowired
    ItemsRepository itemsRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addItem(
            @RequestParam(name = "id") Integer id,
            @RequestParam(name = "nodename") String nodename,
            @RequestParam(name = "hint") String hint,
            @RequestParam(name = "img", required = false) String img,
            @RequestParam(name = "dname") String dname,
            @RequestParam(name = "qual") String qual,
            @RequestParam(name = "cost") Integer cost,
            @RequestParam(name = "notes") String notes,
            @RequestParam(name = "mc") Integer mc,
            @RequestParam(name = "cd") Integer cd,
            @RequestParam(name = "lore") String lore,
            @RequestParam(name = "created") Integer created,
            @RequestParam(name = "charges") Integer charges
            ) {
        Items item = itemsRepository.findItemsById(id);
        if (item != null) {
            return new ResponseEntity<>(
                    "Предмет с ID = " + id.toString() + " уже существует в базе\n" +
                            item,
                    HttpStatus.FOUND
            );
        }

        try {
            Items newItem = new Items();
            newItem.setId(id);
            newItem.setNodeName(nodename);
            newItem.setHint(hint);
            newItem.setImg(img);
            newItem.setDname(dname);
            newItem.setQual(qual);
            newItem.setCost(cost);
            newItem.setNotes(notes);
            newItem.setMc(mc);
            newItem.setCd(cd);
            newItem.setLore(lore);
            newItem.setCreated(created);
            newItem.setCharges(charges);
            itemsRepository.saveAndFlush(newItem);
            return new ResponseEntity<>(
                    "Новый предмет успешно добавлен в базу\n" + newItem,
                    HttpStatus.OK
            );
        } catch (Exception e) {
            return new ResponseEntity<>(e.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteItemById(@RequestParam(name = "id") Integer id) {
        Items item = itemsRepository.findItemsById(id);
        if (item == null) {
            return new ResponseEntity<>(
                    "Предмет с ID = " + id.toString() + " отсутствует в базе",
                    HttpStatus.NOT_FOUND
            );
        }
        try {
            itemsRepository.deleteById(id);
            String msg = "Предмет с ID = " + id + " был удален из базы heroes\n" + item;
            itemsRepository.flush();
            return new ResponseEntity<>(
                    msg,
                    HttpStatus.OK
            );
        } catch (Exception e) {
            return new ResponseEntity<>(e.toString(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
