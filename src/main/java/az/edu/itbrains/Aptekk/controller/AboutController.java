package az.edu.itbrains.Aptekk.controller;

import az.edu.itbrains.Aptekk.dtos.response.AboutResponseDto;
import az.edu.itbrains.Aptekk.services.AboutService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor

public class AboutController {
    private final AboutService aboutService;

    @GetMapping("/about") // localhost:8080/about
    public String about (Model model)  {
        List<AboutResponseDto> aboutResponseDtoList = aboutService.getAboutsList();
        model.addAttribute("abouts", aboutResponseDtoList);



        return "about";

    }

}
