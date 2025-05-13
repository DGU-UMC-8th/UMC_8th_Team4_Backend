package com.example.demo.domain.supplement.repository;

import com.example.demo.domain.supplement.entity.Supplement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SupplementRepository extends JpaRepository<Supplement, Long> {

    List<Supplement> findAllByNameContaining(String name);


    @Query(
            "select s from Supplement s where s.name = :supplementName"
    )
    List<Supplement> findAllByIngredientName(@Param("supplementName") String supplementName);

}
