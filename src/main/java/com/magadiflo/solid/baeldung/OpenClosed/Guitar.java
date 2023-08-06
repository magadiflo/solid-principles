package com.magadiflo.solid.baeldung.OpenClosed;

/**
 * Lanzamos la aplicación, y a todos les encanta. Pero después de unos meses, decidimos que la guitarra es un poco
 * aburrida y le vendría bien un patrón de llama genial para que se vea más rock and roll.
 * <p>
 * En este punto, podría ser tentador simplemente abrir la clase Guitar y agregar un patrón de llama, pero quién sabe
 * qué errores podrían generarse en nuestra aplicación.
 * <p>
 * En su lugar, sigamos el principio abierto-cerrado y simplemente extendamos nuestra clase de guitarra a una clase
 * SuperCoolGuitarWithFlames.
 */

public class Guitar {
    private String make;
    private String model;
    private int volume;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
