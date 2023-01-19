package com.calculator.calculatorforhome.domain.repository.build;

import com.calculator.calculatorforhome.domain.buildmodel.Kitchen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitchenRepository extends JpaRepository<Kitchen, Integer> {
}
