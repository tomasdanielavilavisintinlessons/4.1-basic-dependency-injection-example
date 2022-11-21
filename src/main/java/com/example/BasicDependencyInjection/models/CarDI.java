package com.example.BasicDependencyInjection.models;

public class CarDI {
	private Engine engine;
	private Wheel wheel;
	
	public CarDI(Engine engine, Wheel wheel) {
		this.engine = engine;
		this.wheel = wheel;
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
}
