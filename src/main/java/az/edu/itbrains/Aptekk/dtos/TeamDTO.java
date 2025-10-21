package az.edu.itbrains.Aptekk.dtos;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TeamDTO {
    private Long id;
    private String name;
    private String position;
    private String description;
    private String imageUrl;
}