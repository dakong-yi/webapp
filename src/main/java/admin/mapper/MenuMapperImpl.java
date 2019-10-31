package admin.mapper;

import admin.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MenuMapperImpl extends BaseDao implements MenuMapper {
    @Override
    public List<Menu> getMenus() {
        return this.getSqlSession().selectList("MenuMapper.getMenus");
    }

    @Override
    public Integer insertMenu(Menu menu) {
        return this.getSqlSession().insert("MenuMapper.insertMenu", menu);
    }

    @Override
    public Integer updateMenu(Menu menu) {
        return this.getSqlSession().update("MenuMapper.updateMenu", menu);
    }

    @Override
    public Integer deleteMenu(Integer id) {
        return this.getSqlSession().delete("MenuMapper.deleteMenu", id);
    }
}
