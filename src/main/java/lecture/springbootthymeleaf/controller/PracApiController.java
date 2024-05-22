package lecture.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("") //중간경로 지정
public class PracApiController {

    // 실습(3) API-GET
    @GetMapping("/introduce/{name}")
    public String introduce(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "prac3";
    }

    // 실습(4) API-GET
    @GetMapping("/introduce2")
    public String introduce2(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "age") Integer age,
            Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "prac4";
    }

    // 실습(5) API-GET/POST
    @GetMapping("/res5")
    public String introduce3() {
        return "prac5get";
    }

    @PostMapping("/res5")
    public String introduce4(
            @RequestParam String name,
            @RequestParam String gender,
            @RequestParam int year,
            @RequestParam int month,
            @RequestParam int day,
            @RequestParam String favorite,
            Model model) {
        model.addAttribute("name", name);
        model.addAttribute("gender", gender);
        model.addAttribute("birth", year + "-" + month + "-" + day);
        model.addAttribute("favorite", favorite);

        return "prac5post";
    }

}//class
