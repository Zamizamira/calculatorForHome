package com.calculator.calculatorforhome.domain.repository.build;

import com.calculator.calculatorforhome.domain.buildmodel.Calculation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculationRepository extends JpaRepository<Calculation, Integer> {
}
