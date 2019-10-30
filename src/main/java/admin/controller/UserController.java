package admin.controller;

import admin.mapper.UserMapper;
import admin.model.User;
import admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/User", method = { RequestMethod.GET, RequestMethod.POST })
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 获取用户列表
     *
     * @return List<User>
     * @throws Exception e
     */
    @ResponseBody
    @RequestMapping("/list")
    public List<User> getUsers() throws Exception {
        return userService.getUsers();
    }

    /**
     * 新增用户信息
     *
     * @return int
     * @throws Exception e
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public int insertUser(@RequestBody User user) throws Exception {
        return userService.insertUser(user);
    }

    /**
     * 获取用户信息
     *
     * @param id 用户id
     * @return User
     * @throws Exception e
     */
    @ResponseBody
    @RequestMapping("/info/{id}")
    public User getUser(@PathVariable Integer id) throws Exception {
        return userService.getUser(id);
    }

    /**
     * 修改用户信息
     *
     * @return int
     * @throws Exception e
     */
    @ResponseBody
    @RequestMapping("/edit/{id}")
    public int updateUser(@PathVariable Integer id, @RequestBody User user) throws Exception {
        user.setId(id);
        return userService.updateUser(user);

    }

    /**
     * 删除用户信息
     *
     * @param id 用户id
     * @return int
     * @throws Exception e
     */
    @ResponseBody
    @RequestMapping("/delete/{id}")
    public int deleteUser(@PathVariable Integer id) throws Exception {
        return userService.deleteUser(id);
    }

}
