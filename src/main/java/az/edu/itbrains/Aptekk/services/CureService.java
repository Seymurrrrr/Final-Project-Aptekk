package az.edu.itbrains.Aptekk.services;

import az.edu.itbrains.Aptekk.dtos.response.CureResponseDto;
import az.edu.itbrains.Aptekk.repository.CureRepository;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface CureService {
    Object getAllCures();

    CureResponseDto getCureById(Long id);


    List<CureResponseDto> getCuresList();
}
