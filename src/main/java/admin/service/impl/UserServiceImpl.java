package admin.service.impl;

import admin.mapper.UserMapper;
import admin.model.User;
import admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询一个用户
     *
     * @param  id 用户id
     * @return User
     */
    public User getUser(Integer id)  throws Exception {
        return userMapper.getUser(id);
    }

    /**
     * 新增用戶
     * @param user
     * @return
     * @throws Exception
     */
    public int insertUser(User user) throws Exception {
        return userMapper.insertUser(user);
    }

    /**
     * 修改用戶
     * @param user
     * @param id
     * @return
     * @throws Exception
     */
    public int updateUser(User user) throws Exception {
        return userMapper.updateUser(user);
    }

    /**
     * 刪除用戶
     * @param id
     * @return
     * @throws Exception
     */
    public int deleteUser(Integer id) throws Exception {
        return userMapper.deleteUser(id);
    }

    /**
     * 查询所有的用户信息
     * @return null
     * @throws Exception a
     */
    public List<User> getUsers() throws Exception {
        return userMapper.getUsers();
    }

    public Integer login(String name, String psw) {
        return userMapper.login(name, psw);
    }
}

