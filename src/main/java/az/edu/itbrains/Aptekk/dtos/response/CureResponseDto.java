package az.edu.itbrains.Aptekk.dtos.response;

import jakarta.persistence.Column;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CureResponseDto {
    private Long id;
    private String name;
    private String title;
    private String description;
    private double price;
    private String orderingInformation;
    private String Specifications;
    private String imageUrl;


}
