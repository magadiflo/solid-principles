package com.magadiflo.solid.baeldung.DependencyInversion.bad;

/**
 * Este código funcionará y podremos usar StandardKeyboard y Monitor libremente dentro de nuestra clase
 * Windows98Computer.
 * <p>
 * ¿Problema resuelto? Casi. Al declarar StandardKeyboard y Monitor con la palabra clave new, hemos acoplado
 * estrechamente estas tres clases.
 * <p>
 * Esto no solo hace que nuestra computadora con Windows98 sea difícil de probar, sino que también hemos perdido
 * la capacidad de cambiar nuestra clase StandardKeyboard por una diferente en caso de necesidad. Y también
 * estamos atascados con nuestra clase de monitor.
 */
public class Windows98Machine {
    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine() {
        this.keyboard = new StandardKeyboard();
        this.monitor = new Monitor();
    }
}
