package com.example.endPoints;

import org.springframework.web.bind.annotation.*;

@RestController
public class Control1 {

    // GET
    // http://localhost:8080/user/Manuel
    @GetMapping("/user/{name}")
    public String getUser(@PathVariable String name){
        return "Hola " + name;
    }

    //POST
    //http://localhost:8080/useradd
    /*
    * {
        "name": "Manuel",
        "edad": "34",
        "ciudad": "Madrid"
    }
    * */
    @PostMapping("/useradd")
    public User setUser(@RequestBody User user){
        user.setEdad(user.getEdad() + 1);
        return user;
    }
}
