package com.somemart.somemart.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.ui.Model;

@Controller
public class LoginController {
    
    @GetMapping("/login")
    public String loginPage(Map<String, Object> model) {
        model.put("message", "Hello, World!");
        return "login";
    }

}
