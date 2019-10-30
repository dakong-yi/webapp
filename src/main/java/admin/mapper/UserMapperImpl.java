package admin.mapper;

import admin.model.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserMapperImpl extends BaseDao implements UserMapper {

    @Override
    public User getUser(Integer id) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        User user = sqlSession.selectOne("UserMapper.getUser", id);
        return user;
    }

    @Override
    public List<User> getUsers() throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.selectList("UserMapper.getUsers");
    }

    @Override
    public int deleteUser(Integer id) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.delete("UserMapper.deleteUser", id);
    }

    @Override
    public int insertUser(User user) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.insert("UserMapper.insertUser", user);
    }

    @Override
    public int updateUser(User user) throws Exception {
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.update("UserMapper.updateUser", user);
    }

}
