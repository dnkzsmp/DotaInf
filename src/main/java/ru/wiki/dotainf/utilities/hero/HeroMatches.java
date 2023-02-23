package ru.wiki.dotainf.utilities.hero;

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

    public HeroMatches() {}

    public HeroMatches(
            Long match_id,
            Integer start_time,
            Integer duration,
            Boolean radiant_win,
            Integer leagueId,
            String league_name,
            Boolean radiant,
            Integer player_slot,
            Integer account_id,
            Integer kills,
            Integer deaths,
            Integer assists
    ) {
        this.match_id = match_id;
        this.start_time = start_time;
        this.duration = duration;
        this.radiant_win = radiant_win;
        this.leagueId = leagueId;
        this.league_name = league_name;
        this.radiant = radiant;
        this.player_slot = player_slot;
        this.account_id = account_id;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
    }

    public Long getMatch_id() {
        return match_id;
    }

    public void setMatch_id(Long match_id) {
        this.match_id = match_id;
    }

    public Integer getStart_time() {
        return start_time;
    }

    public void setStart_time(Integer start_time) {
        this.start_time = start_time;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Boolean getRadiant_win() {
        return radiant_win;
    }

    public void setRadiant_win(Boolean radiant_win) {
        this.radiant_win = radiant_win;
    }

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeague_name() {
        return league_name;
    }

    public void setLeague_name(String league_name) {
        this.league_name = league_name;
    }

    public Boolean getRadiant() {
        return radiant;
    }

    public void setRadiant(Boolean radiant) {
        this.radiant = radiant;
    }

    public Integer getPlayer_slot() {
        return player_slot;
    }

    public void setPlayer_slot(Integer player_slot) {
        this.player_slot = player_slot;
    }

    public Integer getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

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
