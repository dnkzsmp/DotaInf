package ru.wiki.dotainf.utilities.hero;

public class HeroMatchups {
    private Integer hero_id;
    private Integer games_played;
    private Integer wins;

    public HeroMatchups() {}

    public HeroMatchups(Integer hero_id, Integer games_played, Integer wins) {
        this.hero_id = hero_id;
        this.games_played = games_played;
        this.wins = wins;
    }

    public Integer getHero_id() {
        return hero_id;
    }

    public void setHero_id(Integer hero_id) {
        this.hero_id = hero_id;
    }

    public Integer getGames_played() {
        return games_played;
    }

    public void setGames_played(Integer games_played) {
        this.games_played = games_played;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    @Override
    public String toString() {
        return "HeroMatchups [" +
                "hero_id=" + hero_id +
                ", games_played=" + games_played +
                ", wins=" + wins +
                ']';
    }
}
