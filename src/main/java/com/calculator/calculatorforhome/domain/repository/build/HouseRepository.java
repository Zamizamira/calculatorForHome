package com.calculator.calculatorforhome.domain.repository.build;

import com.calculator.calculatorforhome.domain.entityhouse.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House, Integer> {
}
