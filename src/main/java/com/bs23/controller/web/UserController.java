package com.bs23.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Khairul Islam Azam
 * @since 1.0.0
 */
@Controller
public class UserController {

    @GetMapping("/users")
    public String user(){
        return "user";
    }
}
