package com.example.BasicDependencyInjection.models;

public class Car {
	private Engine engine;
	private Wheel wheel;
	
	public Car() {
		this.engine = new Engine("Engine name");
		this.wheel = new Wheel("Wheel name");
	}

	public Engine getEngine() {
		return engine;
	}

	public Wheel getWheel() {
		return wheel;
	}
}
