package com.example.demo.domain.supplement.dto;

import com.example.demo.domain.supplement.entity.Supplement;
import lombok.Builder;

@Builder
public record SupplementResponse(
        Long id,
        String name,
        Integer price,
        String company
) {
    public static SupplementResponse from(Supplement supplement) {
        return SupplementResponse.builder()
                .id(supplement.getId())
                .name(supplement.getName())
                .price(supplement.getPrice())
                .company(supplement.getCompany())
                .build();
    }
}
