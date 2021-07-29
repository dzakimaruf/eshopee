package com.codeid.eshopee.controllers;

import java.util.ArrayList;
import java.util.List;

import com.codeid.eshopee.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @GetMapping("/hello")
    public ResponseEntity <String> sayHello(){
        return new ResponseEntity <> ("HelloJAVA", HttpStatus.OK);
    }
    @GetMapping("/hi")
    public ResponseEntity <String> sayHi(){
        return new ResponseEntity <> ("Semoga jago java", HttpStatus.OK);
    }
    // @GetMapping("/ho")
    // public ResponseEntity <?> sayWho(@RequestParam ("name") String name){
    //     return new ResponseEntity <> ("my name : " + name);
    // }
    @GetMapping("/listUser")
    public ResponseEntity<?> listUser(){
        List<User> userList = new ArrayList<>();

        User user = new User();
        user.setUserName("Dzaki");
        user.setEmail("dzakimaruf@gmail.com");

        User user1 = new User("Dzaki", "dzakimaruf@gmail.com");
       
        userList.add(user);
        userList.add(user1);
        userList.add(new User("Dani", "Dani@code.id"));
        userList.add(new User("Dzaki", "Dzaki@code.id"));
        userList.add(new User("Reynald", "Reynald@code.id"));

        return ResponseEntity.ok().body(userList);
    }

}
