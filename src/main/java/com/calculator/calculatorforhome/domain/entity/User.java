package com.calculator.calculatorforhome.domain.entity;

import com.calculator.calculatorforhome.domain.buildmodel.Calculation;
import com.calculator.calculatorforhome.domain.buildmodel.Foundation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String firstName;
    private String lastName;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(unique = true)
    private Long phoneNumber;
    private boolean enabled;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id") }
    )
    private List<Role> roles = new ArrayList<>();

    @OneToMany(mappedBy ="user" ,fetch = FetchType.LAZY)
    private List<Calculation> calculations;

    @OneToMany(mappedBy ="user" ,fetch = FetchType.LAZY)
    private List<Foundation> foundationList;
}
