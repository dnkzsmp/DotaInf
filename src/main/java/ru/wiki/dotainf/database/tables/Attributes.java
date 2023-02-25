package ru.wiki.dotainf.database.tables;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "attribs")
public class Attributes {
    @JsonIgnore
    @Id
    private Integer id;
    @Column(name = "itemid")
    private Integer itemid;

    @Column(name = "key")
    private String key;

    @Column(name = "header")
    private String header;

    @Column(name = "value")
    private String value;

    @Column(name = "footer")
    private String footer;

    public Attributes() {}

    public Attributes(Integer id, Integer itemid, String key, String header, String value, String footer) {
        this.id = id;
        this.itemid = itemid;
        this.key = key;
        this.header = header;
        this.value = value;
        this.footer = footer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }
}
