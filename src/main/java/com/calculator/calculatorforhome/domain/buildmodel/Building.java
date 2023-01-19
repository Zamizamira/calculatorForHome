package com.calculator.calculatorforhome.domain.buildmodel;

import com.calculator.calculatorforhome.domain.entityhouse.House;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

/**
 * Стройка
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "buildings")
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(mappedBy = "buildings")
    private List<Calculation> calculations;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "buildings_houses",
            joinColumns = @JoinColumn(name = "building_id"),
            inverseJoinColumns = @JoinColumn(name = "houses_id"))
    private List<House> houses;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "buildings_garages",
            joinColumns = @JoinColumn(name = "building_id"),
            inverseJoinColumns = @JoinColumn(name = "garages_id"))
    private List<Garage> garages;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "buildings_fences",
            joinColumns = @JoinColumn(name = "building_id"),
            inverseJoinColumns = @JoinColumn(name = "fences_id"))
    private List<Fence> fences;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "buildings_canopies",
            joinColumns = @JoinColumn(name = "building_id"),
            inverseJoinColumns = @JoinColumn(name = "canopies_id"))
    private List<Canopy> canopies;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "buildings_bathhouses",
            joinColumns = @JoinColumn(name = "building_id"),
            inverseJoinColumns = @JoinColumn(name = "bathhouses_id"))
    private List<Bathhouse> bathhouses;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "buildings_warehouses",
            joinColumns = @JoinColumn(name = "building_id"),
            inverseJoinColumns = @JoinColumn(name = "warehouses_id"))
    private List<Warehouse> warehouses;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "buildings_walls",
            joinColumns = @JoinColumn(name = "building_id"),
            inverseJoinColumns = @JoinColumn(name = "walls_id"))
    private List<Wall> walls;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "buildings_foundations",
            joinColumns = @JoinColumn(name = "building_id"),
            inverseJoinColumns = @JoinColumn(name = "foundations_id"))
    private List<Foundation> foundations;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "buildings_roofs",
            joinColumns = @JoinColumn(name = "building_id"),
            inverseJoinColumns = @JoinColumn(name = "roofs_id"))
    private List<Roof> roofs;
}
