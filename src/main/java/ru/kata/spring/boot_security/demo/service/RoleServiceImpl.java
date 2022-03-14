package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.dao.RoleRepository;
import ru.kata.spring.boot_security.demo.model.Role;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public void createRole(Role role) {roleRepository.save(role);}

    public void deleteRole(Long id) {roleRepository.deleteById(id);}

    public Role getRoleByName(String name) {
        return roleRepository.findByname(name);
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
