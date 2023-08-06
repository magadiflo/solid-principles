package com.magadiflo.solid.baeldung.LiskovSubstitution;

public class ElectricCar implements ICar {

    @Override
    public void turnOnEngine() {
        throw new AssertionError("[Eléctrico] Yo no tengo un motor");
    }

    @Override
    public void accelerate() {
        System.out.println("[Eléctrico] Acelerando...");
    }
}
