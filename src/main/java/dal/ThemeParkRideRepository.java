package dal;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.ThemeParkRide;

@Repository
public interface ThemeParkRideRepository extends CrudRepository<ThemeParkRide, Long> {
	
	List<ThemeParkRide> findByName(String name);

}
