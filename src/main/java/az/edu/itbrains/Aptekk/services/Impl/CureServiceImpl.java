package az.edu.itbrains.Aptekk.services.Impl;

import az.edu.itbrains.Aptekk.dtos.response.CureResponseDto;
import az.edu.itbrains.Aptekk.repository.CureRepository;
import az.edu.itbrains.Aptekk.services.CureService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CureServiceImpl implements CureService {
    private final CureRepository cureRepository;
    private final ModelMapper modelMapper;

    @Override
    public Object getAllCures() {
        return null;
    }

    @Override
    public CureResponseDto getCureById(Long id) {
        return null;
    }

    @Override
    public List<CureResponseDto> getCuresList() {
        return List.of();
    }
}
