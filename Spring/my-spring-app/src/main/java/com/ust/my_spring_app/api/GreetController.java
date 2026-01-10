package com.ust.my_spring_app.api;

import com.ust.my_spring_app.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.time.LocalTime;

@RestController
public class GreetController {

    @GetMapping
    public String sayHello(){
        return "Hello This is Shanjay";
    }

    @GetMapping("/message")
    public Message getMessage(){
        Message msg = new Message("Hello ALL", LocalTime.now(), "Shanjay");
        return  msg;
    }

    @GetMapping("/message/{sender}")
    public Message getMessage(@PathVariable String sender){
        return new Message("Hi Everyone", LocalTime.now(), sender);
    }

    @GetMapping("message/{message}/sender/{sender}")
    public Message getMessage(@PathVariable String message, @PathVariable String sender){
        return new Message(message, LocalTime.now(), sender);
    }

}
