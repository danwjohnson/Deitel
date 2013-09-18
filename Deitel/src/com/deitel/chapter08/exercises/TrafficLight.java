// Exercise 8.11: TrafficLight.java
// This enum represents a traffic light and the 3 signal colors
package com.deitel.chapter08.exercises;

public enum TrafficLight {

	RED(50),
	YELLOW(5),
	GREEN(40);
	
	private final int duration;
	
	// constructor
	TrafficLight( int dura) {
		
		duration = dura;
		
	} // end constructor
	
	
	public int getDuration() {
		
		return duration;
		
	} // end method getDuration
	
	
	
} // end enum TrafficLigt
