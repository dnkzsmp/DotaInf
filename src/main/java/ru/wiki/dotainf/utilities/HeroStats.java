package ru.wiki.dotainf.utilities;

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
    private Long first_pick;
    private Long first_win;
    private Long second_pick;
    private Long second_win;
    private Long third_pick;
    private Long third_win;
    private Long fourth_pick;
    private Long fourth_win;
    private Long fifth_pick;
    private Long fifth_win;
    private Long sixth_pick;
    private Long sixth_win;
    private Long seventh_pick;
    private Long seventh_win;
    private Long eighth_pick;
    private Long eighth_win;
    private Long null_pick;
    private Long null_win;

    public HeroStats() {}

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
            Long first_pick,
            Long first_win,
            Long second_pick,
            Long second_win,
            Long third_pick,
            Long third_win,
            Long fourth_pick,
            Long fourth_win,
            Long fifth_pick,
            Long fifth_win,
            Long sixth_pick,
            Long sixth_win,
            Long seventh_pick,
            Long seventh_win,
            Long eighth_pick,
            Long eighth_win,
            Long null_pick,
            Long null_win
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
