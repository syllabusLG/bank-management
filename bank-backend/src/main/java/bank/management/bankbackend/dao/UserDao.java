package bank.management.bankbackend.dao;

import bank.management.bankbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
    //List<User> findByRoleCode(String code);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
