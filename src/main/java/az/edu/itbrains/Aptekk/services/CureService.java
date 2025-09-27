package az.edu.itbrains.Aptekk.services;

import az.edu.itbrains.Aptekk.dtos.response.CureResponseDto;

import java.util.List;

public interface CureService {




    List<CureResponseDto> getCuresList(Long id);
}
