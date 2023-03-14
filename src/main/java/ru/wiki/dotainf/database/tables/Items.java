package ru.wiki.dotainf.database.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    @Override
    public String toString() {
        return "Items\n{" +
                "\n\tnodeName = '" + nodeName + '\'' +
                ",\n\t hint = '" + hint + '\'' +
                ",\n\t id = " + id +
                ",\n\t img = '" + img + '\'' +
                ",\n\t dname = '" + dname + '\'' +
                ",\n\t qual = '" + qual + '\'' +
                ",\n\t cost = " + cost +
                ",\n\t notes = '" + notes + '\'' +
                ",\n\t mc = " + mc +
                ",\n\t cd = " + cd +
                ",\n\t lore = '" + lore + '\'' +
                ",\n\t created = " + created +
                ",\n\t charges = " + charges +
                "\n}";
    }
}
