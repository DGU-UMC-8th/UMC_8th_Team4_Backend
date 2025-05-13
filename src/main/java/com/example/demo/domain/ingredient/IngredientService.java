package com.example.demo.domain.ingredient;



import com.example.demo.domain.ingredient.entity.Ingredient;
import com.example.demo.domain.ingredient.repository.IngredientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public Ingredient getIngredientById(Integer id) {
        return ingredientRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 성분이 존재하지 않습니다. ID: " + id));
    }


}