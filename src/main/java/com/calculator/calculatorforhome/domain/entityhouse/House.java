package com.calculator.calculatorforhome.domain.entityhouse;

import com.calculator.calculatorforhome.domain.buildmodel.Building;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Дом
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "houses")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(mappedBy = "houses", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Building> buildings;
}
