package com.example.demo.domain.supplement.entity;

import com.example.demo.domain.ingredient.entity.Ingredient;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Supplement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private String company;

    @Column(length = 500)
    private String caution;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "supplement")
    List<Ingredient> ingredientList = new ArrayList<>();
}
