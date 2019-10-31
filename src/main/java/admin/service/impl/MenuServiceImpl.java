package admin.service.impl;

import admin.mapper.MenuMapper;
import admin.model.Menu;
import admin.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getMenus() {
        return menuMapper.getMenus();
    }

    @Override
    public Integer insertMenu(Menu menu) {
        return menuMapper.insertMenu(menu);
    }

    @Override
    public Integer updateMenu(Menu menu) {
        return menuMapper.updateMenu(menu);
    }

    @Override
    public Integer deleteMenu(Integer id) {
        return menuMapper.deleteMenu(id);
    }
}
