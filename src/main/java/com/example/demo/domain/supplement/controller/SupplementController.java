package com.example.demo.domain.supplement.controller;

import com.example.demo.domain.ingredient.entity.Ingredient;
import com.example.demo.domain.supplement.entity.Supplement;
import com.example.demo.domain.supplement.service.SupplementService;
import com.example.demo.global.common.SuccessResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/supplements")
public class SupplementController {

    private final SupplementService supplementService;

    @GetMapping("{query}")
    public ResponseEntity<SuccessResponse<?>> getSupplementListByQuery(@PathVariable String query) {
        return SuccessResponse.ok(supplementService.getSupplementListByQuery(query));
    }


    @GetMapping("/detail")
    public ResponseEntity<SuccessResponse<?>> getSupplementsByIngredientName(
            @RequestParam String ingredientName) {
        return SuccessResponse.ok(supplementService.getSupplementListByName(ingredientName));
    }





}
