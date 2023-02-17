package ru.wiki.dotainf.database.tables;

import jakarta.persistence.*;

@Entity
@Table(name = "heroes")
public class Heroes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "hname")
    private String heroName;

    @Column(name = "hattr")
    private String heroAttribute;

    @Column(name = "hrole")
    private String heroRole;

    public Heroes() {}

    public Heroes(String heroName, String heroAttribute, String heroRole) {
        this.heroName = heroName;
        this.heroAttribute = heroAttribute;
        this.heroRole = heroRole;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroAttribute() {
        return heroAttribute;
    }

    public void setHeroAttribute(String heroAttribute) {
        this.heroAttribute = heroAttribute;
    }

    public String getHeroRole() {
        return heroRole;
    }

    public void setHeroRole(String heroRole) {
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
