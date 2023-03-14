package ru.wiki.dotainf.utilities.hero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HeroMatches {
    private Long match_id;
    private Integer start_time;
    private Integer duration;
    private Boolean radiant_win;
    private Integer leagueId;
    private String league_name;
    private Boolean radiant;
    private Integer player_slot;
    private Integer account_id;
    private Integer kills;
    private Integer deaths;
    private Integer assists;

    @Override
    public String toString() {
        return "HeroMatch [" +
                "match_id=" + match_id +
                ", start_time=" + start_time +
                ", duration=" + duration +
                ", radiant_win=" + radiant_win +
                ", leagueId=" + leagueId +
                ", league_name='" + league_name + '\'' +
                ", radiant=" + radiant +
                ", player_slot=" + player_slot +
                ", account_id=" + account_id +
                ", kills=" + kills +
                ", deaths=" + deaths +
                ", assists=" + assists +
                ']';
    }
}
