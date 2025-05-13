package com.example.demo.domain.supplement;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Supplement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private String company;

    @Column(length = 500)
    private String caution;

    @OneToMany(mappedBy = "supplement")
    List<Ingredient> ingredientList = new ArrayList<>();
}
