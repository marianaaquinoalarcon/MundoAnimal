# 🐾 Proyecto Mundo Animal — Java POO

![Java Version](https://img.shields.io/badge/Java-17%2B-orange?style=flat-square&logo=java)
![POO](https://img.shields.io/badge/Conceptos-POO%20%7C%20Herencia%20%7C%20Polimorfismo-blue?style=flat-square)

Aplicación Java orientada a objetos que modela el comportamiento de diferentes animales mediante la implementación de **clases abstractas**, **interfaces**, **herencia**, **sobrescritura de métodos** y **polimorfismo**.

---

## 📝 Descripción del Proyecto

El sistema `MundoAnimal` organiza una jerarquía de clases para representar distintas especies de animales, encapsulando sus atributos básicos (nombre y edad) y abstrayendo comportamientos específicos como la emisión de sonidos particulares y formas de desplazamiento autónomas.

### Objetivos Principales:
* Utilizar clases abstractas para definir modelos base incompletos (`Animal`).
* Implementar contratos de comportamiento desacoplados mediante interfaces (`Movible`).
* Aplicar polimorfismo manipulando objetos derivados mediante referencias genéricas y de interfaces.

---

## 📁 Estructura del Proyecto

```text
MundoAnimal/
└── src/
    └── mx/
        └── com/
            └── animales/
                ├── Animal.java      # Clase abstracta base
                ├── Perro.java       # Clase derivada de Animal e implementa Movible
                ├── Gato.java        # Clase derivada de Animal e implementa Movible
                ├── Vaca.java        # Clase derivada de Animal e implementa Movible
                ├── Caballo.java     # Clase extra derivada de Animal e implementa Movible
                ├── Movible.java     # Interfaz de desplazamiento
                └── Main.java        # Clase principal (ejecución y polimorfismo)
```

---

## 🚀 Instrucciones de Ejecución

### Requisitos Previos:
* Java Development Kit (JDK) 17 o superior.
* Un IDE compatible (VS Code, Eclipse, IntelliJ IDEA) o la terminal de comandos.

### Pasos para Ejecutar desde la Terminal:

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/marianaaquinoalarcon/MundoAnimal.git
   cd MundoAnimal/src
   ```

2. **Compilar las clases:**
   ```bash
   javac mx/com/animales/*.java
   ```

3. **Ejecutar la clase Main:**
   ```bash
   java mx.com.animales.Main
   ```

---

## 💻 Ejemplo de Salida Esperada

Al ejecutar la clase `Main`, el programa recorre la colección de animales invocando dinámicamente sus métodos heredados e implementados:

```text
Nombre: Max | Edad: 3 | Sonido: Guau | Movimiento: Corre
Nombre: Luna | Edad: 2 | Sonido: Miau | Movimiento: Camina
Nombre: Lola | Edad: 5 | Sonido: Muuu | Movimiento: Camina
Nombre: Spirit | Edad: 4 | Sonido: Relincho | Movimiento: Galopa
```

---

## 🧠 Preguntas de Reflexión

### 1. ¿Qué se reutiliza al heredar de `Animal`?
Se reutilizan los atributos privados como nombre y edad; asi como el metodo mostrarInformacion() y sonido()

### 2. ¿Qué hace `super(nombre, edad)`?
Llama al constructor de la clase padre Animal desde una clase hija ( Perro, Gato, Vaca, Caballo).

### 3. ¿Para qué sirve `@Override`?
Es la anotacion para indicar que se esta sobreescribiendo un metodo ya declarado en una clase padre. Sirve para indicar al compilador que se utilizara el metodo sobreescrito para la clase indicada, no el metodo padre.

### 4. ¿Por qué el mismo método `hacerSonido()` produce resultados distintos?
Porque se ha sobreescrito el metodo para ser utilizado en cada clase, cada una ha indicado el sonido especifico para cada
objeto de la misma clase. A eso se le llama polimosfismo.

### 5. ¿Cuál es la diferencia entre una clase abstracta y una interfaz?
* **Clase Abstracta (`extends`):** Puede contener atributos de estado (con visibilidad privada/protegida), constructores y una mezcla de métodos concretos con código y métodos abstractos sin implementación. Una clase solo puede heredar de una clase abstracta, es una promesa de uso.
* **Interfaz (`implements`):** Principalmente contiene declaraciones de métodos abstractos para ser implementados por clases. Una clase puede implementar múltiples interfaces.Define un contrato de comportamiento. 