package com.t3h.demo;

import com.t3h.demo.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private UserProfile userProfile;

    @GetMapping(value = "/test")
    public Object test(){
        Student student = new Student();
        student.setName("linh");
        student.setAge(22);
        return student;
    }

    @GetMapping(value = "/getAllUer")
    public Object getAllUer(){
        return 0;
    }
}
