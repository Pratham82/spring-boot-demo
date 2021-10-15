package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.userDetails;

import java.lang.reflect.Array;

@RestController
public class usersController {

    @GetMapping("/users/getUsers")
    public String getUsers(){
        return "All users yay!!";
    }


    @PostMapping("/users/addUsers")
    public String addUserInfo(@RequestBody userDetails detailsObj){
        System.out.println(detailsObj.getUserName());
        return detailsObj.getUserName();
    }
}
