package com.example.demo;

import java.util.Map;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;




@RestController
public class TimexController {
    
    @ResponseBody
    @GetMapping("/")
    public Map<String, String> Roar() {
        Map<String,String> rep = new HashMap<>();
        rep.put("msg","Hola Soy Dora!");
        return rep;
    }
    @GetMapping("/ricks")
    public RedirectView redirectToRickRoll() {
    RedirectView redirectView = new RedirectView();
    redirectView.setUrl("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    return redirectView;
    }
  
    @PostMapping("/GOAT")
    @ResponseBody
    public Map<String,String> goats(@RequestBody Map<String,String> reqs) {

        Map<String,String> res = new HashMap<>();
        res.put("msg",reqs.get("name") + " is a goat");
        return res;
    }
}

