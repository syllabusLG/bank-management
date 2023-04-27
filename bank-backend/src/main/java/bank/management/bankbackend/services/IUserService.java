package bank.management.bankbackend.services;

import bank.management.bankbackend.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User save(User user);
    Optional<User> findById(Long id);
    //List<User> findByRoleCode(String code);
    Optional<User> findByUsername(String username);
    List<User> findAllUsers();
}
