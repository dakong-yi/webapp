package admin.service;

import admin.model.Menu;

import java.util.List;

public interface MenuService {

    List<Menu> getMenus();
    Integer updateMenu(Menu menu);
    Integer deleteMenu(Integer id);
    Integer insertMenu(Menu menu);
}
