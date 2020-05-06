package setup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import dal.ThemeParkRideRepository;

import model.ThemeParkRide;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	ThemeParkRideRepository themeParkRideRepository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Loading products into database...");

		themeParkRideRepository.save(new ThemeParkRide("Rollercoaster", "Train ride that speeds you along", 5, 3));
		
		themeParkRideRepository.save(new ThemeParkRide("Log Flume", "Boat ride with plenty of splashes", 3, 2));
		
		themeParkRideRepository.save(new ThemeParkRide("Teacups", "Spinning ride in a giant tea-cup", 2, 4));

	}

}
