package com.example.BasicDependencyInjection.models;

public class Engine {
	private String engineName;

	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	public Engine(String engineName) {
		super();
		this.engineName = engineName;
	}
	
	
}
