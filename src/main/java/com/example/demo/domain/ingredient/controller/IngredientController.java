package com.example.demo.domain.ingredient.controller;


import com.example.demo.domain.ingredient.IngredientService;
import com.example.demo.global.common.SuccessResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class IngredientController {

    private final IngredientService ingredientService;


    @GetMapping("/ingredient/{id}")
    public ResponseEntity<SuccessResponse<?>> getIngredientById(@PathVariable int id) {
        return SuccessResponse.ok(ingredientService.getIngredientById(id));
    }

}
