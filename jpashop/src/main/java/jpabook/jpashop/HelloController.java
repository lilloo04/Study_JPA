package jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    //hello.hello라는 url이 오면 이 컨트롤러가 호출 됨
    public String hello(Model model){
        model.addAttribute("data", "hello!");
        return "hello"; //템플릿 화면 이름
    }
}
