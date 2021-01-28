/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.mit.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author 38068
 */
@Controller
public class Controller1 {
    
    @GetMapping("/")
    public String doGet(Model model){
        
        model.addAttribute("name","myName");
       
    return "index2";
    }
    
}
