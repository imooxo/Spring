package lecture.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// localhost:8080/api/~~~~~
@Controller
@RequestMapping("/api") //중간경로 지정
public class ApiController {

    // GET localhost:8080/api
    @GetMapping("")
    public String get() {
        return "api"; //템플릿파일 하나 지정해서 리턴할 예정
    }

    // GET localhost:8080/api/res1?name={name}&age={age}  // queryString
//    @GetMapping("/res1")
//    public String getRes1(@RequestParam String name, @RequestParam int age, Model model) {
//        model.addAttribute("name", name);
//        model.addAttribute("age", age);
//        return "res";
//    }

    // GET localhost:8080/api/res1?name={name}&age={age}  // queryString
    @GetMapping("/res1")
    public String getRes1(
            @RequestParam(value = "name") String nickname,
            @RequestParam(required = false) Integer age, // required = false / null값 허용
            Model model) {
        model.addAttribute("name", nickname);
        model.addAttribute("age", age);
        return "res";
    }


    // GET localhost:8080/api/res2/{name}/{age}
//    @GetMapping("/res2/")
//    public String getRes2() {
//        return "";
//    }

}//class
