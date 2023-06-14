package com.home.crudspring.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Courses implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    private String name;
    private String caterogy;

}
