package ru.wiki.dotainf.database.tables;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
}
