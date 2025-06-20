package com.practice.springcrud.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.springcrud.Entity.EmployeeRoleName;
import com.practice.springcrud.Entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(EmployeeRoleName roleName);

    boolean existsByRoleName(EmployeeRoleName roleName);
}
