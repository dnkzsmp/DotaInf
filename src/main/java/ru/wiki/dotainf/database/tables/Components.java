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
@Table(name = "components")
public class Components {
    @Id
    private Integer id;

    @Column(name = "itemid")
    private Integer itemid;

    @Column(name = "name")
    private String name;
}
