package admin.mapper;

import admin.model.Role;

import java.util.List;

public interface RoleMapper {
    Role getRole(Integer id);
    List<Role> getRoles();
    Integer deleteRole(Integer id);
    Integer updateRole(Role role);
    Integer insertRole(Role role);
}
