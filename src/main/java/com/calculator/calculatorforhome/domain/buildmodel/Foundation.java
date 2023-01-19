package com.calculator.calculatorforhome.domain.buildmodel;

import com.example.testbuild101122.domain.entity.User;
import com.example.testbuild101122.domain.enums.FoundationEnum;
import com.example.testbuild101122.domain.enums.MaterialEnum;
import com.example.testbuild101122.domain.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Фундамент
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "foundations")
public class Foundation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private User user;

    @ManyToMany(mappedBy = "foundations", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Building> buildings;

    @Enumerated(EnumType.STRING)
    private FoundationEnum foundationEnum;

    @Enumerated(EnumType.STRING)
    private MaterialEnum materialEnum;

    @Enumerated(EnumType.STRING)
    private Size size;
}
