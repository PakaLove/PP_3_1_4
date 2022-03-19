package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.dao.RoleRepository;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleService {
    public void setRoleDao(RoleRepository roleRepository);
    public void addRole(Role role);
    public void updateRole(Role role);
    public void removeRoleById(long id);
    public List<Role> getAllRoles();
    public Role getRoleByName(String name);
}
