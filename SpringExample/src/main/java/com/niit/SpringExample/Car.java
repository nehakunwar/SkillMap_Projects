package com.niit.SpringExample;

public class Car {
	int carId;
	Engine engine;
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	String carName;
	Car()
	{
		
	}
	/*public Car(int carId, String carName) {
		super();
		this.carId = carId;
		
		this.carName = carName;
	}*/
	public void display()
	{
		System.out.println("Car id is"+carId);
		System.out.println("Car NAme"+carName);
		System.out.println("model name is"+engine.getEngineName());
	}
	

}