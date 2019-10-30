package admin.service;

import admin.model.Role;

import java.util.List;

public interface RoleService {
    Role getRole(Integer id);
    List<Role> getRoles();
    Integer insertRole(Role role);
    Integer updateRole(Role role);
    Integer deleteRole(Integer id);
}
