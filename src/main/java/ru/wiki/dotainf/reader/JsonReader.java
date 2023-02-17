package ru.wiki.dotainf.reader;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;
import ru.wiki.dotainf.utilities.HeroStats;

import java.net.URL;
import java.util.Iterator;

public class JsonReader {

    public static HeroStats getHeroStatsFromApiJson(@NotNull String heroName, @NotNull URL url) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonNode jsonTree = mapper.readTree(url);
        Iterator<JsonNode> heroes = jsonTree.elements();
        JsonNode heroNode = null;

        while (heroes.hasNext()) {
            heroNode = heroes.next();
            if (heroNode.get("localized_name")
                    .asText()
                    .toLowerCase()
                    .replace(' ', '-')
                    .equals(heroName)
            ) {
                break;
            }
        }

        try {
            assert heroNode != null;
            if (heroNode.get("localized_name").asText().equals("Primal Beast") && !heroName.equals("Primal Beast"))
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
            throw new Exception("Ошибка получения героя под именем '" + heroName + "'");
        }
    }

}
