package admin.controller;

import admin.model.User;
import admin.service.UserService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/user", method = {RequestMethod.GET, RequestMethod.POST})
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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Integer login(@RequestBody Map<String, String> userMap) {
        System.out.println(userMap.get("username") + userMap.get("password") );
        String username = userMap.get("username");
        String password = userMap.get("password");
        return userService.login(username, password);
    }


}
