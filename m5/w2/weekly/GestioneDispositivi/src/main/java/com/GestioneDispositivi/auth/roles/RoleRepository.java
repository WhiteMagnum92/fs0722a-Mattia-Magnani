package com.GestioneDispositivi.auth.roles;

import java.util.Optional;

import javax.management.relation.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByRoleName(ERole name);
}
