package models;


import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class City {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String Name;

    @OneToMany(cascade = CascadeType.PERSIST)
    private Set<Road> roads;


}
