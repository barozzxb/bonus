package vn.bonus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class AuthController {

    @GetMapping("/login")
    public String index() {
        return "loginpage"; // Tên view (loginpage.html)
    }
    
    @PostMapping("/login")
    public String indexPost() {
        return "redirect:/user/profile"; // Tên view (loginpage.html)
    }

    @GetMapping("/user/profile")
    public String profile() {
        return "profile"; // Tên view (profile.html)
    }
}
