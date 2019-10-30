package admin.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import admin.model.User;

@Controller
@RequestMapping("/home")
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/index")
    public String index() {
        logger.info("the first jsp pages");

        return "index";
    }
    @RequestMapping("/insert")
    public void createUser(User user) {

    }
    @RequestMapping(value = "{name}", method = RequestMethod.GET)
    public @ResponseBody  User getUser(@PathVariable String name) {
        User user = new User();
        user.setName(name);
        return user;
    }

}
