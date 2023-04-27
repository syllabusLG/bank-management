/*
package bank.management.bankbackend.initializer;

import bank.management.bankbackend.entities.Role;
import bank.management.bankbackend.entities.User;
import bank.management.bankbackend.services.IRoleService;
import bank.management.bankbackend.services.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
@Order(2)
public class UserInitializer implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserInitializer.class);
    @Autowired
    private IUserService userService;
    @Autowired
    private IRoleService roleService;

    @Override
    public void run(String... args) throws Exception {
        Optional<User> adminUser = userService.findByLogin("admin");
        if (!adminUser.isPresent()){
            Optional<Role> roleAdmin = roleService.findByCode("ADMIN");
            if (roleAdmin.isPresent()){
                User user = new User();
                user.setFirstName("Syllabus");
                user.setLastName("Ndiaye");
                user.setEmail("syllabus@gmail.com");
                user.setLogin("syllabus");
                user.setRole(roleAdmin.get());
                userService.save(user);
            }

        }
        Optional<User> userOptional = userService.findByLogin("user");
        if (!userOptional.isPresent()){
            Optional<Role> roleOptional = roleService.findByCode("USER");
            if (roleOptional.isPresent()){
                User user = new User();
                user.setFirstName("Aida");
                user.setLastName("LO");
                user.setLogin("boulo");
                user.setEmail("aida@gmail.com");
                user.setRole(roleOptional.get());
                userService.save(user);
            }


        }

        roleService.findAll()
                .stream()
                .forEach(role -> {LOGGER.info(" Role: "+ role.getId() + ", "+ role.getCode()+", "+role.getLabel());});

        userService.findAllUsers()
                .stream()
                .forEach(user -> {LOGGER.info("User : "+user.getFirstName()+" "+user.getLastName());});

    }
}
*/
