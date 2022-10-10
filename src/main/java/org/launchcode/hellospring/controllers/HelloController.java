package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("form")
    @ResponseBody
    public String form(){
        return "<html>" +
                "<body>" +
                "<form action='hello'>" +
                "<input name='name' type='text' placeholder='name'>" +
                "<select name='language'>" +
                "<option value='Hola '>" +
                "Spanish" +
                "</option>" +
                "<option value='Hello '>" +
                "English" +
                "</option>" +
                "<option value='Bonjour '>" +
                "French" +
                "</option>" +
                "</select>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }
//    @GetMapping("goodbye")
//    public String goodbye(){
//        return "Goodbye, Spring!";
//    }
//
    @GetMapping("hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name, @RequestParam String language){
        return language + name;
    }

//    @GetMapping("hello/{name}")
//    public String helloWithPathParam(@PathVariable String name){
//        return "Hello, " + name + "!";
//    }
//
//    @GetMapping("form")
//    public String helloForm(){
//        return "<html>" +
//                "<body>" +
//                "<form action='hello' method='post'>" +
//                "<input type='text' name='name'>" +
//                "<input type='submit' value='Greet me!'>" +
//                "</form>" +
//                "</body>" +
//                "</html>";
//    }
}
