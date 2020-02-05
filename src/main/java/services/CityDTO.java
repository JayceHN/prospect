package services;

import lombok.Data;
import models.Road;

import java.util.Set;

@Data
public class CityDTO {
    private Long id;
    private String Name;
    private Set<RoadDTO> roads;
}
