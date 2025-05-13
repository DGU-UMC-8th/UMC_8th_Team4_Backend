package com.example.demo.domain.supplement.controller;

import com.example.demo.domain.supplement.service.SupplementService;
import com.example.demo.global.common.SuccessResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/supplements")
public class SupplementController {

    private final SupplementService supplementService;

    @GetMapping("{query}")
    public ResponseEntity<SuccessResponse<?>> getSupplementListByQuery(@PathVariable String query) {
        return SuccessResponse.ok(supplementService.getSupplementListByQuery(query));
    }
}
