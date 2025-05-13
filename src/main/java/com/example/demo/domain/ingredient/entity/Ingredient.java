package com.example.demo.domain.ingredient.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplement_id", nullable = false)
    private Supplement supplement;

    @Column(nullable = false)
    private String suggestedUse;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String efficacy;

    @Column(nullable = false)
    private String sideEffect;
}
