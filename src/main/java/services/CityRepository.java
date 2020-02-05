package services;

import models.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CityRepository extends CrudRepository<City,Long> {
    public Set<City> findAll();
    public City getOneById(Long id);
}
