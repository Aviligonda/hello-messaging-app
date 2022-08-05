package com.bridgelabz.hellomessagingapp.controller;

import com.bridgelabz.hellomessagingapp.controller.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloMessagingAppController {
    @GetMapping("/getmessage")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/query")
    public String queryParam(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/adduser")
    public String adduser(@RequestBody User user) {
        return user.toString();
    }

    @PostMapping("adduserwithparams")
    public String addUserWithParams(@RequestParam String firstName, @RequestParam String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user.toString();
    }
}
