package models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity
public class Country {

    @Id
    private Long id;
    private String Name;
    private String ISOCode;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Set<City> cities;
}
