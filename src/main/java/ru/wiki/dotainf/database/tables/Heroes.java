package ru.wiki.dotainf.database.tables;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "heroes")
public class Heroes {

    @Id
    private Long id;

    @Column(name = "hname")
    private String heroName;

    @Column(name = "hattr")
    private String heroAttribute;

    @Column(name = "hrole")
    private String heroRole;

    public Heroes(String heroName, String heroAttribute, String heroRole) {
        this.heroName = heroName;
        this.heroAttribute = heroAttribute;
        this.heroRole = heroRole;
    }

    @Override
    public String toString() {
        return "Heroes {" +
                "id=" + id +
                ", heroName='" + heroName + '\'' +
                ", heroAttribute='" + heroAttribute + '\'' +
                ", heroRole='" + heroRole + '\'' +
                '}';
    }
}
