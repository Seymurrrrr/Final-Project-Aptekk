package az.edu.itbrains.Aptekk.controller;

import az.edu.itbrains.Aptekk.dtos.response.CureResponseDto;
import az.edu.itbrains.Aptekk.services.CureService;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CureController {
    private final CureService cureService;

    @GetMapping("/cure/{id}") // localhost:8080/cure
    public String cure (@PathVariable Long id, Model model)  {
        List<CureResponseDto> cureResponseDtoList = cureService.getCuresList(id);
        model.addAttribute("cures", cureResponseDtoList);
        return "cure";
    }
}
