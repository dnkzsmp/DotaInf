package ru.wiki.dotainf.controller.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.wiki.dotainf.database.repository.AttributesRepository;
import ru.wiki.dotainf.database.repository.ComponentsRepository;
import ru.wiki.dotainf.database.repository.HeroesRepository;
import ru.wiki.dotainf.database.repository.ItemsRepository;

@Controller
@RequestMapping("/items")
class ItemsController {
    @Autowired
    AttributesRepository attributesRepository;
    @Autowired
    ComponentsRepository componentsRepository;
    @Autowired
    ItemsRepository itemsRepository;
    @Autowired
    HeroesRepository heroesRepository;

    @GetMapping
    public String ex() {
        return "header/about";
    }

    // Метод для парсинга предметов из json в БД
//    private void readJson() throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        JsonNode jsonTree = mapper.readTree(new File("C:\\Users\\Danil\\Desktop\\УЧЕБА\\dotainf\\src\\main\\resources\\json\\items.json"));
//        Iterator<JsonNode> itemNodes = jsonTree.elements();
//
//        List<Items> items = new ArrayList<>();
//        List<String> nodeNames = new ArrayList<>();
//
//        for (Iterator<String> it = jsonTree.fieldNames(); it.hasNext(); ) {
//            String nodeName = it.next();
//            nodeNames.add(nodeName);
//        }
//
//        int items_i = 1;
//        int attr_i = 1;
//        int comp_i = 1;
//        while (itemNodes.hasNext()) {
//            JsonNode itemNode = itemNodes.next();
//
//            String hint = null;
//            if (itemNode.hasNonNull("hint"))
//                hint = itemNode.get("hint").get(0).asText();
//
//            Integer id = itemNode.get("id").asInt();
//
//            String img = null;
//            if (itemNode.hasNonNull("img"))
//                img = itemNode.get("img").asText();
//
//            String dname = null;
//            if (itemNode.hasNonNull("dname"))
//                dname = itemNode.get("dname").asText();
//
//            String qual = null;
//            if (itemNode.hasNonNull("qual"))
//                qual = itemNode.get("qual").asText();
//
//            Integer cost = itemNode.get("cost").asInt();
//
//            String notes = itemNode.get("notes").asText();
//            if (notes.isEmpty())
//                notes = "Отсутствуют";
//
//            List<Attributes> attributes = new ArrayList<>();
//            if (itemNode.hasNonNull("attrib")) {
//                JsonNode attribs = itemNode.get("attrib");
//                if (!attribs.isNull()) {
//                    int index = 0;
//                    while (attribs.has(index)) {
//                        JsonNode attribNode = attribs.get(index);
//
//                        String footer = "";
//                        if (attribNode.hasNonNull("footer"))
//                            footer = attribNode.get("footer").asText();
//
//                        attributes.add(new Attributes(
//                                attr_i,
//                                id,
//                                attribNode.get("key").asText(),
//                                attribNode.get("header").asText(),
//                                attribNode.get("value").asText(),
//                                footer
//                        ));
//                        index++;
//                        attr_i++;
//                    }
//                }
//            }
//            if (!attributes.isEmpty()) {
//                attributesRepository.saveAll(attributes);
//            }
//
//            Integer mc = null;
//            if (!itemNode.get("mc").asBoolean())
//                mc = -1;
//            else
//                mc = itemNode.get("mc").asInt();
//
//            Integer cd = null;
//            if (!itemNode.get("cd").asBoolean())
//                cd = -1;
//            else
//                cd = itemNode.get("cd").asInt();
//
//            String lore = itemNode.get("lore").asText();
//            if (lore.isEmpty())
//                lore = "Отсутствуют";
//
//            List<Components> components = new ArrayList<>();
//            if (itemNode.hasNonNull("components")) {
//                JsonNode comps = itemNode.get("components");
//                if (!comps.isNull()) {
//                    int index = 0;
//                    while (comps.has(index)) {
//                        components.add(new Components(
//                                comp_i,
//                                id,
//                                comps.get(index).asText())
//                        );
//                        index++;
//                        comp_i++;
//                    }
//                }
//            }
//            if (!components.isEmpty()) {
//                componentsRepository.saveAll(components);
//            }
//
//            Integer created = null;
//            if (itemNode.hasNonNull("created")) {
//                if (!itemNode.get("created").asBoolean())
//                    created = -1;
//                else
//                    created = itemNode.get("created").asInt();
//            }
//
//            Integer charges = null;
//            if (itemNode.hasNonNull("charges"))
//                charges = itemNode.get("charges").asInt();
//
//            items.add(new Items(
//                    nodeNames.get(items_i - 1),
//                    hint,
//                    id,
//                    img,
//                    dname,
//                    qual,
//                    cost,
//                    notes,
//                    mc,
//                    cd,
//                    lore,
//                    created,
//                    charges
//            ));
//            items_i++;
//        }
//        itemsRepository.saveAll(items);
//    }
}
