package admin.service.impl;

import admin.mapper.RoleMapper;
import admin.model.Role;
import admin.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role getRole(Integer id) {
        return roleMapper.getRole(id);
    }

    @Override
    public List<Role> getRoles() {
        return roleMapper.getRoles();
    }

    @Override
    public Integer updateRole(Role role) {
        return roleMapper.updateRole(role);
    }

    @Override
    public Integer insertRole(Role role) {
        return roleMapper.insertRole(role);
    }

    @Override
    public Integer deleteRole(Integer id) {
        return roleMapper.deleteRole(id);
    }

}
