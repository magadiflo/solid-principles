package com.magadiflo.solid.baeldung.InterfaceSegregation.bad;

// Bear Keeper: Guardián del oso
// Algunas clases que quisieran implementar esta interfaz no usarán todos los métodos, así que
// arreglemos esto dividiendo nuestra interfaz grande en tres separadas.
public interface IBearKeeper {
    void washTheBear();

    void feedTheBear();

    void petTheBear();
}
