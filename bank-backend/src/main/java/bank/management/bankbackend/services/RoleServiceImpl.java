package bank.management.bankbackend.services;

import bank.management.bankbackend.dao.RoleDao;
import bank.management.bankbackend.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements IRoleService{
    @Autowired
    private RoleDao roleDao;

    @Override
    public Role save(Role role) {
        return roleDao.save(role);
    }

    @Override
    public Optional<Role> findById(Long id) {
        return roleDao.findById(id);
    }

    @Override
    public List<Role> findAll() {
        return roleDao.findAll() ;
    }

    @Override
    public Optional<Role> findByCode(String code) {
        return roleDao.findByCode(code);
    }
}
