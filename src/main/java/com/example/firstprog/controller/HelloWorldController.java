package com.example.firstprog.controller;

import com.example.firstprog.Model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/","/hello"})
public class HelloWorldController {

    @GetMapping("/message")
    public String message(){
        return  " Hello Everyone!!!!";
    }

    @GetMapping("/findName/{name}")
    public String find(@PathVariable String name){
        return  " Hello " + name + "!!";
    }

    @PostMapping("/insert")
    public String insert(@RequestBody User user){
        return  " Hello " + user.getFirstName() + " " + user.getLastName() ;
    }

    @PutMapping("/edit/{firstName}")
    public String edit(@PathVariable String firstName,@RequestParam(value = "lastName")String lastName){
        return " Hello " + firstName + " " + lastName + " !!";
    }
}