
package com.example.demomodelattribute.Controller;



import com.example.demomodelattribute.model.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
    public class mycontroller {


        @GetMapping("/signup")
        public String signup(Model model)
        {
            //model.addAttribute("titte","signup page");
           model.addAttribute("object", new user());
            return "signup";

        }
        @GetMapping("/process")
        public String process( @ModelAttribute user user )
        {

            return "process";

        }
    }






