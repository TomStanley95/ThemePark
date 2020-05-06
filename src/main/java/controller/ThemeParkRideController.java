package controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import dal.ThemeParkRideRepository;
import model.ThemeParkRide;

@RestController
public class ThemeParkRideController {
	
	@Autowired
	ThemeParkRideRepository themeParkRideRepository;
	
	@GetMapping(value = "/ride", produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<ThemeParkRide> getRides(){
		return themeParkRideRepository.findAll();
		
	}
	
	@GetMapping(value = "/ride/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ThemeParkRide getRide(@PathVariable long id){
		Optional<ThemeParkRide> optionalOfRide = themeParkRideRepository.findById(id);
		if (optionalOfRide.isPresent()) {
			return optionalOfRide.get();
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Invalid ride id %s", id));
		}
       
    }
	
    @PostMapping(value = "/ride", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ThemeParkRide createRide(@Valid @RequestBody ThemeParkRide themeParkRide) {
        return themeParkRideRepository.save(themeParkRide);
    }
	
}
