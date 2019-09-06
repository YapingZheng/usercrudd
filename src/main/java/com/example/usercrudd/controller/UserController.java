package com.example.usercrudd.controller;

import com.example.usercrudd.dao.UserRepository;
import com.example.usercrudd.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository = null;

    @RequestMapping("/select")
    public Optional<User> select(@RequestParam("id") Integer id){
        return userRepository.findById(id);
    }
    @RequestMapping("/all")
    public List<User> all(){
        return userRepository.findAll();
    }
    @RequestMapping("/delete")
    public void delete(@RequestParam("id") Integer id){
        userRepository.deleteById(id);
    }
    @RequestMapping("/deleteall")
    public void deteleAll(){
        userRepository.deleteAll();
    }
    @RequestMapping("/save")
    public User save(User user){
        return userRepository.save(user);
    }

    @RequestMapping("/update")
//    public void update(@RequestParam("id") Integer id,
//                       @RequestParam("name") String name,
//                       @RequestParam("sex") String sex){
//        userRepository.update(id,name,sex);
//    }
//    public User update(User user){
//        return userRepository.save(user);
//    }
    public void update(@RequestParam("name")String name,
                       @RequestParam("sex")String sex,
                       @RequestParam("id")Integer id){
        userRepository.update(name, sex, id);
    }

}
