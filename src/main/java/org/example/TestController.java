package org.example;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/test")
    public ResponseEntity<String> register(){
        return ResponseEntity.ok("Hello Spring!");
    }
//    @RequestMapping("/user")
//    public User getUser(){
//        User user = new User();
//        user.setUserName("tim");
//        user.setAge(18);
//        user.setPassword("123456");
//        return user;
//    }
}