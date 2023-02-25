package ru.wiki.dotainf.database.tables;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "components")
public class Components {
    @Id
    private Integer id;

    @Column(name = "itemid")
    private Integer itemid;

    @Column(name = "name")
    private String name;

    public Components() {}

    public Components(Integer id, Integer itemid, String name) {
        this.id = id;
        this.itemid = itemid;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
