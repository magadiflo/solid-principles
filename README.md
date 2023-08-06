# Principios SOLID

En este proyecto tomaré ejemplos de varios artículos en la web que hablen sobre este principio.

---

## [Baeldung](https://www.baeldung.com/solid-principles)

Los principios SOLID fueron introducidos por Robert C. Martin en su artículo de 2000 "Design Principles and Design
Patterns". Estos conceptos fueron construidos más tarde por Michael Feathers, quien nos presentó el acrónimo SOLID. Y en
los últimos 20 años, estos cinco principios han revolucionado el mundo de la programación orientada a objetos, cambiando
la forma en que escribimos software.

Entonces, ¿qué es SOLID y cómo nos ayuda a escribir mejor código? En pocas palabras, los principios de diseño de Martin
y Feathers **nos animan a crear un software más fácil de mantener, comprensible y flexible.** En consecuencia, **a
medida que nuestras aplicaciones crecen en tamaño, podemos reducir su complejidad** y ahorrarnos muchos dolores de
cabeza más adelante.

Los siguientes cinco conceptos conforman nuestros principios SOLID:

1. **S**ingle Responsibility
   > El principio de responsabilidad única establece que **una clase solo debe tener una responsabilidad. Además, solo
   debería tener una razón para cambiar**.

2. **O**pen/Closed
   > El principio de abierto/cerrado establece que **las clases deben estar abiertas para la extensión pero cerradas
   para la modificación**. Al hacerlo, nos detenemos de modificar el código existente y causar nuevos errores
   potenciales en una aplicación feliz. Por supuesto, **la única excepción a la regla es cuando se corrigen errores en
   el código existente.**

3. **L**iskov Substitution
   > Esto significa que **cada subclase o clase derivada debe ser sustituible por su clase base o padre.** En pocas
   palabras, **si la clase A es un subtipo de clase B, deberíamos poder reemplazar B con A sin interrumpir el
   comportamiento de nuestro programa.**

   **Veamos la violación de este principio:**

![baeldung-violacion-liskov.png](./assets/baeldung-violacion-liskov.png)

Al incluir un automóvil sin motor en la mezcla, estamos cambiando inherentemente el comportamiento de nuestro programa.
**Esta es una violación flagrante de la sustitución de Liskov y es un poco más difícil de arreglar que nuestros dos
principios anteriores.**

Una posible solución sería volver a trabajar nuestro modelo en interfaces que tengan en cuenta el estado sin motor de
nuestro automóvil.

4. **I**nterface Segregation
   > Significa que **las interfaces más grandes deben dividirse en otras más pequeñas. Al hacerlo, podemos asegurarnos
   de que las clases de implementación solo deben preocuparse por los métodos que les interesan.**

5. **D**ependency Inversion
   > **Los componentes deben depender de abstracciones, no de concreciones.** Se refiere al desacoplamiento de los
   módulos de software. De esta manera, en lugar de módulos de alto nivel dependiendo de módulos de bajo nivel, ambos
   dependerán de abstracciones.

---

## [Libro: Clean Architecture - Robert C. Martin](https://github.com/sdcuike/Clean-Code-Collection-Books/blob/master/Clean.Architecture.2017.9.pdf)

## Principios de Diseño SOLID

**Resumen:**

- **SRP:** The Single Responsibility Principle  
  Cada módulo de software tiene una, y solo una, razón para cambiar.


- **OCP:** The Open-Closed Principle  
  Los sistemas de software deben estar diseñados para permitir que el comportamiento de esos sistemas cambie agregando
  código nuevo, en lugar de cambiar el código existente.


- **LSP:** The Liskov Substitution Principle  
  Este principio dice que para construir sistemas de software a partir de partes intercambiables, esas partes deben
  adherirse a un contrato que permite que esas partes se sustituyan entre sí.


- **ISP:** The Interface Segregation Principle  
  Este principio aconseja a los diseñadores de software que eviten depender de cosas que no usan.


- **DIP:** The Dependency Inversion Principle  
  El código que implementa la política de alto nivel no debe depender del código que implementa los detalles de bajo
  nivel. Más bien, los detalles deberían depender de las políticas.

