package ru.wiki.dotainf.utilities;

import java.util.ArrayList;
import java.util.List;

public class HeroStats {
    private Long id;
    private String name;
    private String localized_name;
    private String primary_attr;
    private String attack_type;
    private List<String> roles;
    private String img;
    private String icon;
    private Integer base_health;
    private Float base_health_regen;
    private Integer base_mana;
    private Float base_mana_regen;
    private Integer base_armor;
    private Integer base_mr;
    private Integer base_attack_min;
    private Integer base_attack_max;
    private Integer base_str;
    private Integer base_agi;
    private Integer base_int;
    private Float str_gain;
    private Float agi_gain;
    private Float int_gain;
    private Integer attack_range;
    private Integer projectile_speed;
    private Float attack_rate;
    private Integer move_speed;
    private Float turn_rate;
    private Boolean cm_enabled;
    private Byte legs;
    private Long hero_id;
    private Long turbo_picks;
    private Long turbo_wins;
    private Integer pro_ban;
    private Integer pro_win;
    private Integer pro_pick;
    private Integer first_pick;
    private Integer first_win;
    private Integer second_pick;
    private Integer second_win;
    private Integer third_pick;
    private Integer third_win;
    private Integer fourth_pick;
    private Integer fourth_win;
    private Integer fifth_pick;
    private Integer fifth_win;
    private Integer sixth_pick;
    private Integer sixth_win;
    private Integer seventh_pick;
    private Integer seventh_win;
    private Integer eighth_pick;
    private Integer eighth_win;
    private Integer null_pick;
    private Integer null_win;

    public HeroStats() {
    }

    public HeroStats(
            Long id,
            String name,
            String localized_name,
            String primary_attr,
            String attack_type,
            List<String> roles,
            String img,
            String icon,
            Integer base_health,
            Float base_health_regen,
            Integer base_mana,
            Float base_mana_regen,
            Integer base_armor,
            Integer base_mr,
            Integer base_attack_min,
            Integer base_attack_max,
            Integer base_str,
            Integer base_agi,
            Integer base_int,
            Float str_gain,
            Float agi_gain,
            Float int_gain,
            Integer attack_range,
            Integer projectile_speed,
            Float attack_rate,
            Integer move_speed,
            Float turn_rate,
            Boolean cm_enabled,
            Byte legs,
            Long hero_id,
            Long turbo_picks,
            Long turbo_wins,
            Integer pro_ban,
            Integer pro_win,
            Integer pro_pick,
            Integer first_pick,
            Integer first_win,
            Integer second_pick,
            Integer second_win,
            Integer third_pick,
            Integer third_win,
            Integer fourth_pick,
            Integer fourth_win,
            Integer fifth_pick,
            Integer fifth_win,
            Integer sixth_pick,
            Integer sixth_win,
            Integer seventh_pick,
            Integer seventh_win,
            Integer eighth_pick,
            Integer eighth_win,
            Integer null_pick,
            Integer null_win
    ) {
        this.id = id;
        this.name = name;
        this.localized_name = localized_name;
        this.primary_attr = primary_attr;
        this.attack_type = attack_type;
        this.roles = roles;
        this.img = img;
        this.icon = icon;
        this.base_health = base_health;
        this.base_health_regen = base_health_regen;
        this.base_mana = base_mana;
        this.base_mana_regen = base_mana_regen;
        this.base_armor = base_armor;
        this.base_mr = base_mr;
        this.base_attack_min = base_attack_min;
        this.base_attack_max = base_attack_max;
        this.base_str = base_str;
        this.base_agi = base_agi;
        this.base_int = base_int;
        this.str_gain = str_gain;
        this.agi_gain = agi_gain;
        this.int_gain = int_gain;
        this.attack_range = attack_range;
        this.projectile_speed = projectile_speed;
        this.attack_rate = attack_rate;
        this.move_speed = move_speed;
        this.turn_rate = turn_rate;
        this.cm_enabled = cm_enabled;
        this.legs = legs;
        this.hero_id = hero_id;
        this.turbo_picks = turbo_picks;
        this.turbo_wins = turbo_wins;
        this.pro_ban = pro_ban;
        this.pro_win = pro_win;
        this.pro_pick = pro_pick;
        this.first_pick = first_pick;
        this.first_win = first_win;
        this.second_pick = second_pick;
        this.second_win = second_win;
        this.third_pick = third_pick;
        this.third_win = third_win;
        this.fourth_pick = fourth_pick;
        this.fourth_win = fourth_win;
        this.fifth_pick = fifth_pick;
        this.fifth_win = fifth_win;
        this.sixth_pick = sixth_pick;
        this.sixth_win = sixth_win;
        this.seventh_pick = seventh_pick;
        this.seventh_win = seventh_win;
        this.eighth_pick = eighth_pick;
        this.eighth_win = eighth_win;
        this.null_pick = null_pick;
        this.null_win = null_win;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocalized_name() {
        return localized_name;
    }

    public void setLocalized_name(String localized_name) {
        this.localized_name = localized_name;
    }

    public String getPrimary_attr() {
        return primary_attr;
    }

    public void setPrimary_attr(String primary_attr) {
        this.primary_attr = primary_attr;
    }

    public String getAttack_type() {
        return attack_type;
    }

    public void setAttack_type(String attack_type) {
        this.attack_type = attack_type;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getBase_health() {
        return base_health;
    }

    public void setBase_health(Integer base_health) {
        this.base_health = base_health;
    }

    public Float getBase_health_regen() {
        return base_health_regen;
    }

    public void setBase_health_regen(Float base_health_regen) {
        this.base_health_regen = base_health_regen;
    }

    public Integer getBase_mana() {
        return base_mana;
    }

    public void setBase_mana(Integer base_mana) {
        this.base_mana = base_mana;
    }

    public Float getBase_mana_regen() {
        return base_mana_regen;
    }

    public void setBase_mana_regen(Float base_mana_regen) {
        this.base_mana_regen = base_mana_regen;
    }

    public Integer getBase_armor() {
        return base_armor;
    }

    public void setBase_armor(Integer base_armor) {
        this.base_armor = base_armor;
    }

    public Integer getBase_mr() {
        return base_mr;
    }

    public void setBase_mr(Integer base_mr) {
        this.base_mr = base_mr;
    }

    public Integer getBase_attack_min() {
        return base_attack_min;
    }

    public void setBase_attack_min(Integer base_attack_min) {
        this.base_attack_min = base_attack_min;
    }

    public Integer getBase_attack_max() {
        return base_attack_max;
    }

    public void setBase_attack_max(Integer base_attack_max) {
        this.base_attack_max = base_attack_max;
    }

    public Integer getBase_str() {
        return base_str;
    }

    public void setBase_str(Integer base_str) {
        this.base_str = base_str;
    }

    public Integer getBase_agi() {
        return base_agi;
    }

    public void setBase_agi(Integer base_agi) {
        this.base_agi = base_agi;
    }

    public Integer getBase_int() {
        return base_int;
    }

    public void setBase_int(Integer base_int) {
        this.base_int = base_int;
    }

    public Float getStr_gain() {
        return str_gain;
    }

    public void setStr_gain(Float str_gain) {
        this.str_gain = str_gain;
    }

    public Float getAgi_gain() {
        return agi_gain;
    }

    public void setAgi_gain(Float agi_gain) {
        this.agi_gain = agi_gain;
    }

    public Float getInt_gain() {
        return int_gain;
    }

    public void setInt_gain(Float int_gain) {
        this.int_gain = int_gain;
    }

    public Integer getAttack_range() {
        return attack_range;
    }

    public void setAttack_range(Integer attack_range) {
        this.attack_range = attack_range;
    }

    public Integer getProjectile_speed() {
        return projectile_speed;
    }

    public void setProjectile_speed(Integer projectile_speed) {
        this.projectile_speed = projectile_speed;
    }

    public Float getAttack_rate() {
        return attack_rate;
    }

    public void setAttack_rate(Float attack_rate) {
        this.attack_rate = attack_rate;
    }

    public Integer getMove_speed() {
        return move_speed;
    }

    public void setMove_speed(Integer move_speed) {
        this.move_speed = move_speed;
    }

    public Float getTurn_rate() {
        return turn_rate;
    }

    public void setTurn_rate(Float turn_rate) {
        this.turn_rate = turn_rate;
    }

    public Boolean getCm_enabled() {
        return cm_enabled;
    }

    public void setCm_enabled(Boolean cm_enabled) {
        this.cm_enabled = cm_enabled;
    }

    public Byte getLegs() {
        return legs;
    }

    public void setLegs(Byte legs) {
        this.legs = legs;
    }

    public Long getHero_id() {
        return hero_id;
    }

    public void setHero_id(Long hero_id) {
        this.hero_id = hero_id;
    }

    public Long getTurbo_picks() {
        return turbo_picks;
    }

    public void setTurbo_picks(Long turbo_picks) {
        this.turbo_picks = turbo_picks;
    }

    public Long getTurbo_wins() {
        return turbo_wins;
    }

    public void setTurbo_wins(Long turbo_wins) {
        this.turbo_wins = turbo_wins;
    }

    public Integer getPro_ban() {
        return pro_ban;
    }

    public void setPro_ban(Integer pro_ban) {
        this.pro_ban = pro_ban;
    }

    public Integer getPro_win() {
        return pro_win;
    }

    public void setPro_win(Integer pro_win) {
        this.pro_win = pro_win;
    }

    public Integer getPro_pick() {
        return pro_pick;
    }

    public void setPro_pick(Integer pro_pick) {
        this.pro_pick = pro_pick;
    }

    public Integer getFirst_pick() {
        return first_pick;
    }

    public void setFirst_pick(Integer first_pick) {
        this.first_pick = first_pick;
    }

    public Integer getFirst_win() {
        return first_win;
    }

    public void setFirst_win(Integer first_win) {
        this.first_win = first_win;
    }

    public Integer getSecond_pick() {
        return second_pick;
    }

    public void setSecond_pick(Integer second_pick) {
        this.second_pick = second_pick;
    }

    public Integer getSecond_win() {
        return second_win;
    }

    public void setSecond_win(Integer second_win) {
        this.second_win = second_win;
    }

    public Integer getThird_pick() {
        return third_pick;
    }

    public void setThird_pick(Integer third_pick) {
        this.third_pick = third_pick;
    }

    public Integer getThird_win() {
        return third_win;
    }

    public void setThird_win(Integer third_win) {
        this.third_win = third_win;
    }

    public Integer getFourth_pick() {
        return fourth_pick;
    }

    public void setFourth_pick(Integer fourth_pick) {
        this.fourth_pick = fourth_pick;
    }

    public Integer getFourth_win() {
        return fourth_win;
    }

    public void setFourth_win(Integer fourth_win) {
        this.fourth_win = fourth_win;
    }

    public Integer getFifth_pick() {
        return fifth_pick;
    }

    public void setFifth_pick(Integer fifth_pick) {
        this.fifth_pick = fifth_pick;
    }

    public Integer getFifth_win() {
        return fifth_win;
    }

    public void setFifth_win(Integer fifth_win) {
        this.fifth_win = fifth_win;
    }

    public Integer getSixth_pick() {
        return sixth_pick;
    }

    public void setSixth_pick(Integer sixth_pick) {
        this.sixth_pick = sixth_pick;
    }

    public Integer getSixth_win() {
        return sixth_win;
    }

    public void setSixth_win(Integer sixth_win) {
        this.sixth_win = sixth_win;
    }

    public Integer getSeventh_pick() {
        return seventh_pick;
    }

    public void setSeventh_pick(Integer seventh_pick) {
        this.seventh_pick = seventh_pick;
    }

    public Integer getSeventh_win() {
        return seventh_win;
    }

    public void setSeventh_win(Integer seventh_win) {
        this.seventh_win = seventh_win;
    }

    public Integer getEighth_pick() {
        return eighth_pick;
    }

    public void setEighth_pick(Integer eighth_pick) {
        this.eighth_pick = eighth_pick;
    }

    public Integer getEighth_win() {
        return eighth_win;
    }

    public void setEighth_win(Integer eighth_win) {
        this.eighth_win = eighth_win;
    }

    public Integer getNull_pick() {
        return null_pick;
    }

    public void setNull_pick(Integer null_pick) {
        this.null_pick = null_pick;
    }

    public Integer getNull_win() {
        return null_win;
    }

    public void setNull_win(Integer null_win) {
        this.null_win = null_win;
    }

    public List<String> getWinRates() {
        List<String> winRates = new ArrayList<>();
        winRates.add(String.format("%.2f", (double) first_win / (double) first_pick * 100));
        winRates.add(String.format("%.2f", (double) second_win / (double) second_pick * 100));
        winRates.add(String.format("%.2f", (double) third_win / (double) third_pick * 100));
        winRates.add(String.format("%.2f", (double) fourth_win / (double) fourth_pick * 100));
        winRates.add(String.format("%.2f", (double) fifth_win / (double) fifth_pick * 100));
        winRates.add(String.format("%.2f", (double) sixth_win / (double) sixth_pick * 100));
        winRates.add(String.format("%.2f", (double) seventh_win / (double) seventh_pick * 100));
        winRates.add(String.format("%.2f", (double) eighth_win / (double) eighth_pick * 100));
        return winRates;
    }

    @Override
    public String toString() {
        return "Hero [" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", localized_name='" + localized_name + '\'' +
                ", primary_attr='" + primary_attr + '\'' +
                ", attack_type='" + attack_type + '\'' +
                ", roles=" + roles +
                ", img='" + img + '\'' +
                ", icon='" + icon + '\'' +
                ", base_health=" + base_health +
                ", base_health_regen=" + base_health_regen +
                ", base_mana=" + base_mana +
                ", base_mana_regen=" + base_mana_regen +
                ", base_armor=" + base_armor +
                ", base_mr=" + base_mr +
                ", base_attack_min=" + base_attack_min +
                ", base_attack_max=" + base_attack_max +
                ", base_str=" + base_str +
                ", base_agi=" + base_agi +
                ", base_int=" + base_int +
                ", str_gain=" + str_gain +
                ", agi_gain=" + agi_gain +
                ", int_gain=" + int_gain +
                ", attack_range=" + attack_range +
                ", projectile_speed=" + projectile_speed +
                ", attack_rate=" + attack_rate +
                ", move_speed=" + move_speed +
                ", turn_rate=" + turn_rate +
                ", cm_enabled=" + cm_enabled +
                ", legs=" + legs +
                ", hero_id=" + hero_id +
                ", turbo_picks=" + turbo_picks +
                ", turbo_wins=" + turbo_wins +
                ", pro_ban=" + pro_ban +
                ", pro_win=" + pro_win +
                ", pro_pick=" + pro_pick +
                ", first_pick=" + first_pick +
                ", first_win=" + first_win +
                ", second_pick=" + second_pick +
                ", second_win=" + second_win +
                ", third_pick=" + third_pick +
                ", third_win=" + third_win +
                ", fourth_pick=" + fourth_pick +
                ", fourth_win=" + fourth_win +
                ", fifth_pick=" + fifth_pick +
                ", fifth_win=" + fifth_win +
                ", sixth_pick=" + sixth_pick +
                ", sixth_win=" + sixth_win +
                ", seventh_pick=" + seventh_pick +
                ", seventh_win=" + seventh_win +
                ", eighth_pick=" + eighth_pick +
                ", eighth_win=" + eighth_win +
                ", null_pick=" + null_pick +
                ", null_win=" + null_win +
                ']';
    }
}
