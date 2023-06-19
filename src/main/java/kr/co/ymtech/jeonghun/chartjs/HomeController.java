package kr.co.ymtech.jeonghun.chartjs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public ModelAndView showBoard() {
        return new ModelAndView("main");
    }
}
