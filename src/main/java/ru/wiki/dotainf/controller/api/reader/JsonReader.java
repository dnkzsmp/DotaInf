package ru.wiki.dotainf.controller.api.reader;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;
import ru.wiki.dotainf.utilities.HeroStats;

import java.net.URL;
import java.util.Iterator;

public class JsonReader {

    public static HeroStats getHeroFromApiJson(@NotNull String heroName, @NotNull URL url) throws Exception {
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
            return mapper.readValue(mapper.treeAsTokens(heroNode), HeroStats.class);
        } catch (Exception e) {
            throw new Exception("Ошибка получения героя под именем '" + heroName + "'");
        }
    }

}
