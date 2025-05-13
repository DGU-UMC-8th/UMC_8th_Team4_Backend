package com.example.demo.domain.supplement.service;

import com.example.demo.domain.supplement.dto.SupplementResponse;
import com.example.demo.domain.supplement.entity.Supplement;
import com.example.demo.domain.supplement.repository.SupplementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class SupplementService {

    private final SupplementRepository supplementRepository;

    public List<SupplementResponse> getSupplementListByQuery(String query) {
        List<Supplement> supplementList = supplementRepository.findAllByNameContaining(query);
        return supplementList.stream()
                .map(SupplementResponse::from)
                .collect(Collectors.toList());
    }
}
