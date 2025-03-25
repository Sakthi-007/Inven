package com.inventory.management.Inven.Controller;

import com.inventory.management.Inven.Model.User;
import com.inventory.management.Inven.Roles.UserRole;
import com.inventory.management.Inven.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create")
    public User createUSer(
            @RequestBody User user){
        User temp=new User();
        temp.setId(user.getId());
        temp.setEmail(user.getEmail());
        temp.setPassword(user.getPassword());
        temp.setRole(String.valueOf(UserRole.USER));


        return userService.createUSer(temp);
    }

    @GetMapping("/get/{id}")
    public User getUser(
            @PathVariable Long id){
        return userService.getUser(id);
    }

    @GetMapping("/get")
    public List<User> getUsers(){
        List<User> users=userService.getUsers();
        return users;
    }
    @PostMapping("/update/{id}")
    public User updateUser(
            @RequestBody User user,
            @PathVariable Long id){
        User temp=userService.getUser(id);
        temp=user;
        return userService.updateUser(temp);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(
            @PathVariable Long id){
        userService.deleteUser(id);
    }

}
