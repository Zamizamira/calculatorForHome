package com.calculator.calculatorforhome.api;

import com.calculator.calculatorforhome.domain.entity.Role;
import com.calculator.calculatorforhome.domain.entity.User;
import com.calculator.calculatorforhome.domain.repository.UserRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class DemoData implements ApplicationListener<ContextRefreshedEvent> {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public DemoData(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        Role adminRole = new Role("ROLE_ADMIN");
        Role userRole = new Role("ROLE_USER");
        User admin = new User();
        admin.setFirstName("Admin");
        admin.setLastName("Admin");
        admin.setPassword(passwordEncoder.encode("admin"));
        admin.setEmail("admin@gmail.com");
        admin.setRoles(List.of(adminRole));
        admin.setPhoneNumber(899967678909L);
        userRepository.save(admin);

        User user1 = new User();
        user1.setFirstName("User");
        user1.setLastName("User");
        user1.setPassword(passwordEncoder.encode("user"));
        user1.setEmail("user@gmail.com");
        user1.setRoles(List.of(userRole));
        user1.setPhoneNumber(87656789054L);
        userRepository.save(user1);
    }
}
