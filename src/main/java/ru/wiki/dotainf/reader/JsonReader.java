package ru.wiki.dotainf.reader;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;
import ru.wiki.dotainf.database.tables.Heroes;
import ru.wiki.dotainf.database.tables.Items;
import ru.wiki.dotainf.utilities.hero.HeroMatches;
import ru.wiki.dotainf.utilities.hero.HeroMatchups;
import ru.wiki.dotainf.utilities.hero.HeroStats;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class JsonReader {

    public static HeroStats getHeroStatsFromApiJson(@NotNull Integer id, @NotNull URL url) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonNode jsonTree = mapper.readTree(url);
        Iterator<JsonNode> heroes = jsonTree.elements();
        JsonNode heroNode = null;
        boolean isFounded = false;

        while (heroes.hasNext()) {
            heroNode = heroes.next();
            if (heroNode.get("id").asInt() == id) {
                isFounded = true;
                break;
            }
        }

        try {
            assert heroNode != null;
            if (!isFounded)
                return null;
            HeroStats heroStats = mapper.readValue(mapper.treeAsTokens(heroNode), HeroStats.class);

            heroStats.setFirst_pick(heroNode.get("1_pick").asInt());
            heroStats.setFirst_win(heroNode.get("1_win").asInt());

            heroStats.setSecond_pick(heroNode.get("2_pick").asInt());
            heroStats.setSecond_win(heroNode.get("2_win").asInt());

            heroStats.setThird_pick(heroNode.get("3_pick").asInt());
            heroStats.setThird_win(heroNode.get("3_win").asInt());

            heroStats.setFourth_pick(heroNode.get("4_pick").asInt());
            heroStats.setFourth_win(heroNode.get("4_win").asInt());

            heroStats.setFifth_pick(heroNode.get("5_pick").asInt());
            heroStats.setFifth_win(heroNode.get("5_win").asInt());

            heroStats.setSixth_pick(heroNode.get("6_pick").asInt());
            heroStats.setSixth_win(heroNode.get("6_win").asInt());

            heroStats.setSeventh_pick(heroNode.get("7_pick").asInt());
            heroStats.setSeventh_win(heroNode.get("7_win").asInt());

            heroStats.setEighth_pick(heroNode.get("8_pick").asInt());
            heroStats.setEighth_win(heroNode.get("8_win").asInt());

            heroStats.setNull_pick(heroNode.get("null_pick").asInt());
            heroStats.setNull_win(heroNode.get("null_win").asInt());

            return heroStats;
        } catch (Exception e) {
            throw new Exception("Ошибка получения героя под ID = " + id);
        }
    }

    public static List<HeroMatches> getHeroMatchesFromApi(@NotNull URL url) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonNode jsonTree = mapper.readTree(url);
        Iterator<JsonNode> heroMatchesNodes = jsonTree.elements();
        List<HeroMatches> heroMatches = new ArrayList<>();
        for (int i = 0; i < 20; ++i) {
            if (heroMatchesNodes.hasNext()) {
                heroMatches.add(mapper.readValue(mapper.treeAsTokens(heroMatchesNodes.next()), HeroMatches.class));
            }
        }
        return heroMatches;
    }

    public static List<HeroMatchups> getHeroMatchupsFromApi(@NotNull URL url) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonNode jsonTree = mapper.readTree(url);
        Iterator<JsonNode> heroMatchupsNodes = jsonTree.elements();
        List<HeroMatchups> heroMatchups = new ArrayList<>();
        while (heroMatchupsNodes.hasNext()) {
            heroMatchups.add(mapper.readValue(mapper.treeAsTokens(heroMatchupsNodes.next()), HeroMatchups.class));
        }
        return heroMatchups;
    }

    public static List<Heroes> getHeroesFromApi() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonNode jsonTree = mapper.readTree(new URL("https://api.opendota.com/api/heroStats"));
        Iterator<JsonNode> heroesNodes = jsonTree.elements();
        List<Heroes> heroes = new ArrayList<>();
        while (heroesNodes.hasNext()) {
            JsonNode heroNode = heroesNodes.next();
            String attr = null, role = null;
            Long id;

            switch (heroNode.get("primary_attr").asText()) {
                case "str" -> attr = "Сила";
                case "agi" -> attr = "Ловкость";
                case "int" -> attr = "Интеллект";
            }

            switch (heroNode.get("roles").get(0).asText()) {
                case "Carry" -> role = "Кэрри";
                case "Support" -> role = "Саппорт";
                case "Nuker" -> role = "Нюкер";
                case "Disabler" -> role = "Дизейблер";
                case "Durable" -> role = "Прочный";
                case "Escape" -> role = "Эскейпер";
                case "Pusher" -> role = "Пушер";
                case "Initiator" -> role = "Инициатор";
                case "Ganker" -> role = "Ганкер";
                case "Roamer" -> role = "Роумер";
                case "Offlaner" -> role = "Оффлейнер";
            }

            id = heroNode.get("id").asLong();

            if (attr == null || role == null) {
                throw new Exception("Аттрибут имеет значение null");
            }

            Heroes hero = new Heroes(
                    heroNode.get("localized_name").asText(),
                    attr,
                    role
            );
            hero.setId(id);
            heroes.add(hero);
        }
        return heroes;
    }

    public static List<Items> getItemsFromApi() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonNode jsonTree = mapper.readTree(new File("C:\\Users\\Danil\\Desktop\\УЧЕБА\\dotainf\\src\\main\\resources\\json\\items.json"));
        Iterator<JsonNode> itemsNodes = jsonTree.elements();
        List<Items> items = new ArrayList<>();

        while (itemsNodes.hasNext()) {
            JsonNode itemNode = itemsNodes.next();

            Items item = new Items(
                    itemNode.get("id").asLong(),
                    itemNode.get("name").asText(),
                    itemNode.get("cost").asInt(),
                    itemNode.get("secret_shop").asInt(),
                    itemNode.get("side_shop").asInt(),
                    itemNode.get("recipe").asInt(),
                    itemNode.get("localized_name").asText()
            );
            items.add(item);
        }

        return items;
    }

    public static HashMap<Integer, Integer> getHeroItemStagesFromApi(@NotNull Integer id) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonNode jsonTree = mapper.readTree(
                new URL("https://api.opendota.com/api/heroes/" + id + "/itemPopularity")
        );
        Iterator<JsonNode> itemStagesNodes = jsonTree.elements();
        List<HashMap<Integer, Integer>> stages = new ArrayList<>();
        while (itemStagesNodes.hasNext()) {
            JsonNode itemStagesNode = itemStagesNodes.next();
            itemStagesNode.fieldNames();
        }

        return null;
    }
}
