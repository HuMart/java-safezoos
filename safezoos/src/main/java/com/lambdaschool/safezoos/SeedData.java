package com.lambdaschool.safezoos;

import com.lambdaschool.safezoos.model.Role;
import com.lambdaschool.safezoos.model.User;
import com.lambdaschool.safezoos.model.UserRoles;
import com.lambdaschool.safezoos.repository.RoleRepository;
import com.lambdaschool.safezoos.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Transactional
@Component
public class SeedData implements CommandLineRunner
{
    RoleRepository rolerepos;
    UserRepository userrepos;

    public SeedData(RoleRepository rolerepos, UserRepository userrepos)
    {
        this.rolerepos = rolerepos;
        this.userrepos = userrepos;
    }

    @Override
    public void run(String[] args) throws Exception
    {
        Role r1 = new Role("admin");
        Role r2 = new Role("user");

        ArrayList<UserRoles> admins = new ArrayList<>();
        admins.add(new UserRoles(new User(), r1));
        admins.add(new UserRoles(new User(), r2));

        ArrayList<UserRoles> users = new ArrayList<>();
        users.add(new UserRoles(new User(), r2));

        rolerepos.save(r1);
        rolerepos.save(r2);
        User u1 = new User("user", "ILuvM4th!", users);
        User u2 = new User("admin", "password", admins);

        userrepos.save(u1);
        userrepos.save(u2);
    }
}
