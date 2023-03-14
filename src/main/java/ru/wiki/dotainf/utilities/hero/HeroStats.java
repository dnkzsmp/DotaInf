package ru.wiki.dotainf.utilities.hero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HeroStats {
    private Integer id;
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