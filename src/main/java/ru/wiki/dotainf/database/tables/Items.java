package ru.wiki.dotainf.database.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "items")
public class Items {
    @Column(name = "nodename")
    private String nodeName;

    @Column(name = "hint")
    private String hint;

    @Id
    private Integer id;

    @Column(name = "img")
    private String img;

    @Column(name = "dname")
    private String dname;

    @Column(name = "qual")
    private String qual;

    @Column(name = "cost")
    private Integer cost;

    @Column(name = "notes")
    private String notes;

    @Column(name = "mc")
    private Integer mc;

    @Column(name = "cd")
    private Integer cd;

    @Column(name = "lore")
    private String lore;

    @Column(name = "created")
    private Integer created;

    @Column(name = "charges")
    private Integer charges;

    public Items() {}

    public Items(String nodeName, String hint, Integer id, String img, String dname, String qual, Integer cost, String notes, Integer mc, Integer cd, String lore, Integer created, Integer charges) {
        this.nodeName = nodeName;
        this.hint = hint;
        this.id = id;
        this.img = img;
        this.dname = dname;
        this.qual = qual;
        this.cost = cost;
        this.notes = notes;
        this.mc = mc;
        this.cd = cd;
        this.lore = lore;
        this.created = created;
        this.charges = charges;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getQual() {
        return qual;
    }

    public void setQual(String qual) {
        this.qual = qual;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getMc() {
        return mc;
    }

    public void setMc(Integer mc) {
        this.mc = mc;
    }

    public Integer getCd() {
        return cd;
    }

    public void setCd(Integer cd) {
        this.cd = cd;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Integer getCharges() {
        return charges;
    }

    public void setCharges(Integer charges) {
        this.charges = charges;
    }
}
