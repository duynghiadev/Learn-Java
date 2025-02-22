package com.agu.findthewayjpa.DataSeeder;

import com.agu.findthewayjpa.entities.Role;
import com.agu.findthewayjpa.entities.User;
import com.agu.findthewayjpa.repositories.RoleRepository;
import com.agu.findthewayjpa.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@AllArgsConstructor
@Component
public class DataSeeder implements CommandLineRunner {
    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if(userRepository.count() == 0){
            User user1 = new User("hoainam10th",
                    "hoainam10th",
                    passwordEncoder.encode("123456"),
                    Instant.now());

            User user2 = new User("Ubuntu Nguyen",
                    "ubuntu",
                    passwordEncoder.encode("123456"),
                    Instant.now());

            User user3 = new User("Datnguyen",
                    "datnguyen",
                    passwordEncoder.encode("123456"),
                    Instant.now());

            Role role = new Role("ROLE_ADMIN");
            Role role1 = new Role("ROLE_USER");

            roleRepository.saveAll(List.of(role, role1));

            var returnUser1 = userRepository.save(user1);
            var returnUser2 = userRepository.save(user2);
            var returnUser3 = userRepository.save(user3);

            Role returnRoleUser = roleRepository.findByName("ROLE_USER");
            Role returnRoleAdmin = roleRepository.findByName("ROLE_ADMIN");

            Set<Role> rolesAdmin = new HashSet<>();
            rolesAdmin.add(returnRoleAdmin);

            Set<Role> rolesUser = new HashSet<>();
            rolesUser.add(returnRoleUser);


            returnUser3.setRoles(rolesUser);
            returnUser2.setRoles(rolesUser);
            returnUser1.setRoles(rolesAdmin);

            userRepository.saveAll(List.of(returnUser3, returnUser1, returnUser2));
        }
    }
}
