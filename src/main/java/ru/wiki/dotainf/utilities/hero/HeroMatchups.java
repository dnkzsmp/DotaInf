package ru.wiki.dotainf.utilities.hero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HeroMatchups {
    private Integer hero_id;
    private Integer games_played;
    private Integer wins;

    @Override
    public String toString() {
        return "HeroMatchups [" +
                "hero_id=" + hero_id +
                ", games_played=" + games_played +
                ", wins=" + wins +
                ']';
    }
}
