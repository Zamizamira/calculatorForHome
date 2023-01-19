package com.calculator.calculatorforhome.domain.buildmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

/**
 * Крыша
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roofs")
public class Roof {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(mappedBy = "roofs", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Building> buildings;
}
