package com.example.mybootapp_3;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
/**
* Hello world!
*/
@Controller
public class HelloController
{
    @RequestMapping("/")
    public String index(Model model) {
    model.addAttribute("msg", "this is a setting message");
    return "index";
    }

    @RequestMapping(value="/post", method=RequestMethod.POST)
    public ModelAndView postForm(@RequestParam("text1") String text1) {
    ModelAndView mv = new ModelAndView("index");
    mv.addObject("msg", "you write '" + text1 + "' !!!");
    return mv;
    }
}