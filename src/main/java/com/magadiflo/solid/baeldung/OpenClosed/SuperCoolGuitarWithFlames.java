package com.magadiflo.solid.baeldung.OpenClosed;

public class SuperCoolGuitarWithFlames extends Guitar {
    private String flameColor;

    public String getFlameColor() {
        return flameColor;
    }

    public void setFlameColor(String flameColor) {
        this.flameColor = flameColor;
    }
}
/**
 * Al extender la clase Guitar, podemos estar seguros de que nuestra aplicación existente no se verá afectada.
 */