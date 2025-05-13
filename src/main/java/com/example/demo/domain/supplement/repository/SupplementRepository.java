package com.example.demo.domain.supplement.repository;

import com.example.demo.domain.supplement.entity.Supplement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplementRepository extends JpaRepository<Supplement, Long> {

    List<Supplement> findAllByNameContaining(String name);
}
