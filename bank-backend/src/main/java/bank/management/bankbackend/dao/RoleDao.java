package bank.management.bankbackend.dao;

import bank.management.bankbackend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
    Optional<Role> findByCode(String code);
}
