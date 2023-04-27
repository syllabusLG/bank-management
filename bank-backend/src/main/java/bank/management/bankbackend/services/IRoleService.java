package bank.management.bankbackend.services;

import bank.management.bankbackend.entities.ERole;
import bank.management.bankbackend.entities.Role;

import java.util.List;
import java.util.Optional;

public interface IRoleService {
    Role save(Role role);
    Optional<Role> findById(Long id);
    List<Role> findAll();
    Optional<Role> findByName(ERole name);
}
