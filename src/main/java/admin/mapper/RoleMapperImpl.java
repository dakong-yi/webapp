package admin.mapper;

import admin.model.Role;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoleMapperImpl extends BaseDao implements RoleMapper {

    @Override
    public Role getRole(Integer id) {
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.selectOne("RoleMapper.getRole", id);
    }

    @Override
    public List<Role> getRoles() {
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.selectList("RoleMapper.getRoles");
    }

    @Override
    public Integer deleteRole(Integer id) {
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.delete("RoleMapper.deleteRole", id);
    }

    @Override
    public Integer updateRole(Role role) {
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.update("RoleMapper.updateRole", role);
    }

    @Override
    public Integer insertRole(Role role) {
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.insert("RoleMapper.insertRole", role);
    }
}
