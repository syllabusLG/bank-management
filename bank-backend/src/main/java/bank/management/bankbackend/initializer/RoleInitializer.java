package bank.management.bankbackend.initializer;

import bank.management.bankbackend.entities.Role;
import bank.management.bankbackend.services.IRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class RoleInitializer implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(RoleInitializer.class);
    @Autowired
    private IRoleService roleService;

    @Override
    public void run(String... args) throws Exception {
        if (!roleService.findByCode("ADMIN").isPresent()){
            Role role1 = new Role();
            role1.setCode("ADMIN");
            role1.setLabel("BANK Administrator");
            roleService.save(role1);
        }
        if (!roleService.findByCode("USER").isPresent()){
            Role role2 = new Role();
            role2.setCode("USER");
            role2.setLabel("BANK Client");
            roleService.save(role2);
        }

        roleService.findAll()
                .stream()
                .forEach(role -> {LOGGER.info(" Role: "+ role.getId() + ", "+ role.getCode()+", "+role.getLabel());});

    }
}
