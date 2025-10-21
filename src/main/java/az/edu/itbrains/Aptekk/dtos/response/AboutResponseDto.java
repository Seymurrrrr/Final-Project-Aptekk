package az.edu.itbrains.Aptekk.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AboutResponseDto {
    private Long id;
    private String title;
    private String description;
}
