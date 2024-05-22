package lecture.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HelloController {

    // localhost:8080/hi
    @GetMapping("/hi")
    public String hello(Model model){
        model.addAttribute("msg","hi~~");
        model.addAttribute("msg2","<strong>안녕?</string>");
        model.addAttribute("age",17);
        model.addAttribute("userType","Admin"); // Admin, User, 그외..

        String[] fruits = {"apple", "banana", "cherry"};
        model.addAttribute("fruits",fruits); //배열 넘기기

        model.addAttribute("url","https://google.co.kr");

        Hello hello = new Hello();
        model.addAttribute("hello",hello); // 객체 넘기기

        return "hi";
    }

    class Hello{
        private String msg = "hi";
        public String getMsg(){
            return msg;
        }
    }//Hello class

}//class
