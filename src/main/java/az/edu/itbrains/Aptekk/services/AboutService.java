package az.edu.itbrains.Aptekk.services;

import az.edu.itbrains.Aptekk.dtos.response.AboutResponseDto;

import java.util.List;

public interface AboutService {
    List<AboutResponseDto> getAboutsList();
}
