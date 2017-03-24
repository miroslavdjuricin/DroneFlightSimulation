package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import drone.Drone;

public class DroneBasicTest {
	
	private int[] boundaries = {50,50,50};
	private int[] startCoordinates = {30,0,30};
	Drone drone;
	
	@Test
	public void testInitialMoveUp()
	{
		//drone = new Drone(boundaries, startCoordinates);
		
		
		
		
		String expectedCoordinates =  "Drone position: ("+30+","+0+","+30+")";
		assertEquals(expectedCoordinates, drone.moveUp());
		
	}

}