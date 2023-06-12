package org.example;

import ch.qos.logback.core.model.Model;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.example.user.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/boot")
public class SpringController {
    @Resource
    private UserService userService;
    @RequestMapping("/user")
    @ResponseBody
    public User getUser(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        return user;
    }
}
