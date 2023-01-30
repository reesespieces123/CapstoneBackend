package net.javaguides.i9section2.repository;

import net.javaguides.i9section2.model.ERole;
import net.javaguides.i9section2.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}