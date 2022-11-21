package com.example.BasicDependencyInjection.models;

public class Wheel {
	private String wheelName;

	public Wheel(String wheelName) {
		super();
		this.wheelName = wheelName;
	}

	public String getWheelName() {
		return wheelName;
	}

	public void setWheelName(String wheelName) {
		this.wheelName = wheelName;
	}
}
