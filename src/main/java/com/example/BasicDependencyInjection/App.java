package com.example.BasicDependencyInjection;

import com.example.BasicDependencyInjection.models.Car;
import com.example.BasicDependencyInjection.models.CarDI;
import com.example.BasicDependencyInjection.models.Engine;
import com.example.BasicDependencyInjection.models.Wheel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        
        CarDI carDI = new CarDI(new Engine("Engine name"), new Wheel("wheel name"));
    }
}
