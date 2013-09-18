package com.dipesh.hfdp.observer;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private float currentPressure = 29.2f;
	private float lastPressure;
	//private float pressure;
	private Subject weatherData;
	
	public ForecastDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if(this.currentPressure > this.lastPressure){
			System.out.println("Improving weather on the way");			
		} else if (this.currentPressure == this.lastPressure){
			System.out.println("More of the same");
		}else {
			System.out.println("Watch out for cooler, rainy weather");
		}

	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.lastPressure=this.currentPressure;
		this.currentPressure = pressure;
		display();
		
	}

}
