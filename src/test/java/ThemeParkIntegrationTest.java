

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import controller.ThemeParkRideController;
import dal.ThemeParkRideRepository;
import model.ThemeParkRide;




public class ThemeParkIntegrationTest {
	
	@Mock
	ThemeParkRideRepository mockThemeParkRideRepository;

	@InjectMocks
	ThemeParkRideController themeParkRideController = new ThemeParkRideController();
	
	@Mock
	ThemeParkRide mockRide;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void get_rides_returns_list(){		
		List<ThemeParkRide> themeParkRides = (List<ThemeParkRide>) themeParkRideController.getRides();
		Mockito.verify(mockThemeParkRideRepository).findAll();
		
	}
	
	
}
