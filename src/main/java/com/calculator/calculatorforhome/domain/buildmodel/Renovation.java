package com.calculator.calculatorforhome.domain.buildmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Ремонт
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "renovations")
public class Renovation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(mappedBy = "renovations", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Calculation> calculations;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "renovations_apartments",
            joinColumns = @JoinColumn(name = "renovations_id"),
            inverseJoinColumns = @JoinColumn(name = "apartments_id"))
    private List<Apartment> apartments;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "renovations_rooms",
            joinColumns = @JoinColumn(name = "renovations_id"),
            inverseJoinColumns = @JoinColumn(name = "roomss_id"))
    private List<Room> rooms;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "renovations_newbuildings",
            joinColumns = @JoinColumn(name = "renovations_id"),
            inverseJoinColumns = @JoinColumn(name = "newbuildings_id"))
    private List<NewBuilding> newbuildings;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "renovations_corridors",
            joinColumns = @JoinColumn(name = "renovations_id"),
            inverseJoinColumns = @JoinColumn(name = "corridors_id"))
    private List<Corridor> corridors;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "renovations_kitchens",
            joinColumns = @JoinColumn(name = "renovations_id"),
            inverseJoinColumns = @JoinColumn(name = "kitchens_id"))
    private List<Kitchen> kitchens;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "renovations_bathrooms",
            joinColumns = @JoinColumn(name = "renovations_id"),
            inverseJoinColumns = @JoinColumn(name = "bathrooms_id"))
    private List<Bathroom> bathrooms;
}
