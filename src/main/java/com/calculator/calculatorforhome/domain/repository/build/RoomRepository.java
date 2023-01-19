package com.calculator.calculatorforhome.domain.repository.build;

import com.calculator.calculatorforhome.domain.buildmodel.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
}
