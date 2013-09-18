// Exercise 8.11: TrafficLightTest.java
// Test the enum TrafficLight
package com.deitel.chapter08.exercises;

public class TrafficLightTest {

	public static void main(String args[]) {
		
		System.out.println("Light\tDuration");
		
		// print all the lights and their duration
		for (TrafficLight light: TrafficLight.values())
			System.out.printf("%s\t%d\n", light, 
					light.getDuration());
		
	} // end main
	
} // end class TrafficLightTest
