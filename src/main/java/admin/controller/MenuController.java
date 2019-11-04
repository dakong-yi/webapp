package admin.controller;


import admin.model.Menu;
import admin.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Menu> getMenus() {
        return  menuService.getMenus();
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public Integer updateMenu(@RequestBody Menu menu, @PathVariable Integer id) {
        menu.setId(id);
        return menuService.updateMenu(menu);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Integer insertMenu(@RequestBody Menu menu) {
        return  menuService.insertMenu(menu);
    }

    @RequestMapping(value = "/delete/{id}")
    public Integer deleteMenu(@PathVariable Integer id) {
        return  menuService.deleteMenu(id);
    }
}
