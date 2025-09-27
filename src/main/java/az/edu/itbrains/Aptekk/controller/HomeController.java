package az.edu.itbrains.Aptekk.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor

public class HomeController {
        @GetMapping("/")
        public String index(Model model){
            return "index.html";

    }

}
