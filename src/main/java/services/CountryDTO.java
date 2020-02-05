package services;

import java.util.Set;

public class CountryDTO {

    private Long id;
    private String Name;
    private String ISOCode;
    private Set<CityDTO> cities;
}
