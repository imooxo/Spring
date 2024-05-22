package lecture.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    // localhost:8080/hi
    @GetMapping("/hi")
    public String hello(Model model) {
        model.addAttribute("msg", "hi~~");
        model.addAttribute("msg2", "<strong>안녕?</string>");
        model.addAttribute("age", 17);
        model.addAttribute("userType", "Admin"); // Admin, User, 그외..

        String[] fruits = {"apple", "banana", "cherry"};
        model.addAttribute("fruits", fruits); //배열 넘기기

        model.addAttribute("url", "https://google.co.kr");

        Hello hello = new Hello();
        model.addAttribute("hello", hello); // 객체 넘기기

        return "hi";
    }

    // 실습(1)
    @GetMapping("/prac1")
    public String prac01(Model model) {
        model.addAttribute("age", 23);
        return "prac1";
    }

    // 실습(2)
    @GetMapping("/prac2")
    public String prac02(Model model) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("kim", 10));
        persons.add(new Person("lee", 20));
        persons.add(new Person("hong", 30));
        persons.add(new Person("park", 40));
        persons.add(new Person("shin", 50));

        model.addAttribute("persons", persons);
        return "prac2";
    }

    class Hello {
        private String msg = "hi";

        public String getMsg() {
            return msg;
        }
    }//Hello class

    class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }//Person class
}//class
