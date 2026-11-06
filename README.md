Descripción

Mundo Animal es un proyecto desarrollado en Java que permite representar diferentes tipos de animales mediante programación orientada a objetos.

El objetivo es aplicar conceptos fundamentales de Java como clases abstractas, herencia, encapsulamiento, sobrescritura de métodos, interfaces y polimorfismo.

El programa muestra el nombre, edad, sonido y forma de desplazamiento de diferentes animales.

Tecnologías utilizadas

Java

IntelliJ IDEA

Git

GitHub

Estructura del proyecto
## Estructura del proyecto

```text
MundoAnimal/
│
├── src/
│   └── mx/
│       └── com/
│           └── animales/
│               ├── Animal.java
│               ├── Perro.java
│               ├── Gato.java
│               ├── Vaca.java
│               ├── Movible.java
│               └── Main.java
│
├── .gitignore
└── README.md
```

Conceptos aplicados

1. Clase abstracta

Se creó la clase Animal, que contiene los atributos privados nombre y edad, un constructor, el método mostrarInformacion() y el método abstracto hacerSonido().

2. Herencia

Las clases Perro, Gato y Vaca heredan de la clase Animal mediante la palabra reservada extends.

3. Encapsulamiento

Los atributos nombre y edad son privados para proteger la información de cada animal.

4. Sobrescritura

Cada clase hija implementa su propia versión del método hacerSonido() utilizando @Override.

5. Interfaz

Se creó la interfaz Movible, que contiene el método moverse(). Las clases Perro, Gato y Vaca implementan esta interfaz mediante implements.

6. Polimorfismo

Se utiliza un arreglo de tipo Animal[] para almacenar diferentes tipos de animales y ejecutar sus propios comportamientos mediante un mismo ciclo.