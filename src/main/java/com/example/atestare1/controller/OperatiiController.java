package com.example.atestare1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OperatiiController {

//    @GetMapping("/add")
//    public String adunarea(Model model, @RequestParam("first") int first, @RequestParam("second") int second){
//        int sum=first+second;
//        model.addAttribute("first",first);
//        model.addAttribute("second",second);
//        model.addAttribute("sum",sum);
//        return "suma";
//    }
    @GetMapping("/add")
    public String adunarea(Model model, @RequestParam("first") String first, @RequestParam("second") int second){
        try {
            int firstNum = Integer.parseInt(first);
            int sum=firstNum+second;
            model.addAttribute("first", firstNum);
            model.addAttribute("second", second);
            model.addAttribute("sum", sum);
            return "suma";
        } catch (NumberFormatException e) {
            model.addAttribute("errorMessage", "first nu este un numar");
            throw new NumberFormatException("first nu este un numar");
        }
    }

    @GetMapping("/multiply")
    public String multiply(Model model, @RequestParam("first") String first, @RequestParam("second") int second){
        try {
            int firstNum = Integer.parseInt(first);
            int multiply=firstNum*second;
            model.addAttribute("first", firstNum);
            model.addAttribute("second", second);
            model.addAttribute("multiply", multiply);
            return "multiply";
        } catch (NumberFormatException e) {
            model.addAttribute("errorMessage", "first nu este un numar");
            throw new NumberFormatException("first nu este un numar");
        }
    }

    @GetMapping("/substract")
    public String scadere(Model model, @RequestParam("first") String first, @RequestParam("second") int second){
        try {
            int firstNum = Integer.parseInt(first);
            int scadere=firstNum-second;
            model.addAttribute("first", firstNum);
            model.addAttribute("second", second);
            model.addAttribute("scadere", scadere);
            return "scadere";
        } catch (NumberFormatException e) {
            model.addAttribute("errorMessage", "first nu este un numar");
            throw new NumberFormatException("first nu este un numar");
        }
    }

    @GetMapping("/divide")
    public String divide(Model model, @RequestParam("first") String first, @RequestParam("second") int second){
        try {
            int firstNum = Integer.parseInt(first);
            int divide=firstNum/second;
            model.addAttribute("first", firstNum);
            model.addAttribute("second", second);
            model.addAttribute("divide", divide);
            return "divide";
        } catch (NumberFormatException e) {
            model.addAttribute("errorMessage", "first nu este un numar");
            throw new NumberFormatException("first nu este un numar");
        }
    }
}
