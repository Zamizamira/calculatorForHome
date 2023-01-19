package com.calculator.calculatorforhome.domain.buildmodel;

import com.calculator.calculatorforhome.domain.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Расчеты
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "calculations")
public class Calculation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "calculations_buildings",
            joinColumns = @JoinColumn(name = "calculation_id"),
            inverseJoinColumns = @JoinColumn(name = "buildings_id"))
    private List<Building> buildings;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "calculations_renovations",
            joinColumns = @JoinColumn(name = "calculation_id"),
            inverseJoinColumns = @JoinColumn(name = "renovations_id"))
    private List<Renovation> renovations;
}
