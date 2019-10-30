package admin.controller;

import admin.model.Role;
import admin.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Integer insert(@RequestBody Role role) {
        return roleService.insertRole(role);
    }
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public Integer update(@PathVariable Integer id, @RequestBody Role role) {
        role.setId(id);
        return roleService.updateRole(role);
    }

    @RequestMapping(value = "/info/{id}")
    public Role getRole(@PathVariable Integer id) {
        return roleService.getRole(id);
    }

    @RequestMapping(value = "/list")
    public List<Role> getRoles() {
        return roleService.getRoles();
    }
}
