package com.calculator.calculatorforhome.domain.repository.build;

import com.calculator.calculatorforhome.domain.buildmodel.NewBuilding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewBuildingRepository extends JpaRepository<NewBuilding, Integer> {
}
