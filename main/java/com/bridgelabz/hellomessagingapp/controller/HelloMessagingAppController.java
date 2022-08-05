package com.bridgelabz.hellomessagingapp.controller;

import com.bridgelabz.hellomessagingapp.controller.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloMessagingAppController {
    // Url : http://localhost:8080/hello/getmessage
    @GetMapping("/getmessage")
    public String hello() {
        return "Hello";
    }

    //Url : http://localhost:8080/hello/query?name=srinivas
    @GetMapping("/query")
    public String queryParam(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    //Url : http://localhost:8080/hello/adduser
    @PostMapping("/adduser")
    public String adduser(@RequestBody User user) {
        return user.toString();
    }

    //Url : http://localhost:8080/hello/adduserwithparams
    @PostMapping("/adduserwithparams")
    public String addUserWithParams(@RequestParam String firstName, @RequestParam String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user.toString();
    }

    // Url : http://localhost:8080/hello/path/Srinivas
    @GetMapping("/path/{name}")
    public String name(@PathVariable String name) {
        return name;
    }

    //Url : http://localhost:8080/hello/updated?firstName=Sai&lastName=Kiran
    @PutMapping("/updated")
    public String update(@RequestParam String firstName, @RequestParam String lastName) {
        User user = new User();
        user.setFirstName("Aviligonda");
        user.setLastName("Srinivas");
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user.toString();
    }
}
