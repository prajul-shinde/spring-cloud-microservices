package com.csi.user.service.controller;

import com.csi.user.service.entity.User;
import com.csi.user.service.service.UserService;
import com.csi.user.service.valueobjects.ResponseTemplateVo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/users")
public class UserController {

    private UserService service;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("inside saveUser method of UserController");
        return service.saveUser(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVo getUserWithDepartment(@PathVariable Long userId){
        log.info("inside getUserWithDepartment of UserController");
      return   service.getUserWithDepartment(userId);
    }
}
