package com.home.crudspring.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "course_tb")
public class Courses implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id", nullable = false)
    @JsonProperty("_id")
    private UUID id;

    @Column(name = "nome", length = 200, nullable = false)
    private String name;

    @Column(name = "categoria", length = 20, nullable = false)
    private String category;


    public Courses() {
    }

    public Courses(String name, String category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Courses courses)) return false;
        return Objects.equals(getId(), courses.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
