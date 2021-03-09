package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("calculator")
public class CalculatorController {
    @GetMapping
    public ModelAndView calculator(@RequestParam int inp1, int inp2, String submit){
        int total = 0;
        switch (submit){
            case "Addtion(+)":
                total = inp1+inp2;
                break;
            case "Subtraction(-)":
                total = inp1-inp2;
                break;
            case "Mutiplication(X)":
                total = inp1*inp2;
                break;
            case "Division(/)":
                total = inp1/inp2;
                break;
        }
        ModelAndView modelAndView = new ModelAndView("calculator","total",total);
        return modelAndView;
    }
}
