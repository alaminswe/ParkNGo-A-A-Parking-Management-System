package com.parking.parkngo.controller;

import com.parking.parkngo.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@Tag(name="users")
public class UserController {

    @Autowired
    private UserService userService;


}
