package az.edu.itbrains.Aptekk.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class cureDto {
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String imageUrl;
}
