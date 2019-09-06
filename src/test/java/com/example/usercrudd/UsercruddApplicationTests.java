package com.example.usercrudd;

import com.example.usercrudd.dao.UserRepository;
import com.example.usercrudd.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsercruddApplicationTests {

    @Resource
    private UserRepository userRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testUser(){
        List<User> list = userRepository.findAll();
//        System.out.println(list.size());
        for(User user:list){
            System.out.println(user);
        }
    }

}
