package com.magadiflo.solid.baeldung.DependencyInversion;

/**
 * Ahora nuestras clases están desacopladas y se comunican a través de la abstracción del teclado. Si queremos,
 * podemos cambiar fácilmente el tipo de teclado en nuestra máquina con una implementación diferente de la interfaz.
 * Podemos seguir el mismo principio para la clase Monitor.
 * <p>
 * ¡Excelente! Hemos desacoplado las dependencias y somos libres de probar nuestro Windows98Machine con el marco de
 * prueba que elijamos.
 */
public class Windows98Machine {
    private final IKeyboard keyboard;
    private final IMonitor monitor;

    public Windows98Machine(IKeyboard keyboard, IMonitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
