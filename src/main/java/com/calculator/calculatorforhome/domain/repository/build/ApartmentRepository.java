package com.calculator.calculatorforhome.domain.repository.build;

import com.calculator.calculatorforhome.domain.buildmodel.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {

}
