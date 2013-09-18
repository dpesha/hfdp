package com.dipesh.hfdp.observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
	
	private ArrayList observers;
	private float temperature;
	private float humidity;
	public float pressure;
	
	public WeatherData(){
		observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public float getTemperature(){
		return 0;
		
	}
	
	public float getHumidity(){
		return 0;
	}
	
	public float getPressure(){
		return 0;
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}

	

	@Override
	public void removeObserver(Observer o) {
		int i=observers.indexOf(o);
		if(i>=0){
			observers.remove(i);
		}
		
	}

	@Override
	public void notifyObservers() {
		for (int i=0;i<observers.size(); i++){
			Observer observer=(Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
		
	}
	
	public void setMeasurement(float temperature, float humidity, float pressure){
		this.temperature=temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
