package com.magadiflo.solid.baeldung.LiskovSubstitution;

public class MotorCar implements ICar {
    @Override
    public void turnOnEngine() {
        System.out.println("[Motor] Encendiendo el motor...");
    }

    @Override
    public void accelerate() {
        System.out.println("[Motor] Acelerando...");
    }
}
