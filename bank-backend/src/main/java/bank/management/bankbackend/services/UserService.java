package bank.management.bankbackend.services;

import bank.management.bankbackend.dao.UserDao;
import bank.management.bankbackend.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService{
    @Autowired
    private UserDao userDao;
    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userDao.findById(id);
    }

    /*@Override
    public List<User> findByRoleCode(String code) {
        return userDao.findByRoleCode(code);
    }*/

    @Override
    public Optional<User> findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return userDao.findAll();
    }
}
