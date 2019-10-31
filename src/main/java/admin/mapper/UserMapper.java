package admin.mapper;

import admin.model.User ;

import java.util.List;

public interface UserMapper {
    /**
     * 查询一个用户
     *
     * @param  id 用户id
     * @return User
     */
    User getUser(Integer id) throws Exception;

    /**
     * 新增用戶
     * @param user
     * @return
     * @throws Exception
     */
    int insertUser(User user) throws Exception;

    /**
     * 修改用戶
     * @param user
     * @param id
     * @return
     * @throws Exception
     */
    int updateUser(User user) throws Exception;

    /**
     * 刪除用戶
     * @param id
     * @return
     * @throws Exception
     */
    int deleteUser(Integer id) throws Exception;

    /**
     * 查询所有的用户信息
     * @return
     * @throws Exception
     */
    List<User> getUsers() throws Exception;

    Integer login(String name, String psw);
}
