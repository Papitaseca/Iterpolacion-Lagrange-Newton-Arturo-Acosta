# Interpolación: Lagrange y Diferencias Divididas de Newton

Proyecto de Java para calcular el valor de un polinomio interpolador mediante dos métodos numéricos:

- **Lagrange:** construye la interpolación usando los polinomios base \(L_i(x)\).
- **Newton:** calcula la tabla de diferencias divididas y evalúa el polinomio con sus coeficientes.

## Requisitos

- Java JDK 8 o superior.
- Un IDE compatible con Java (por ejemplo, IntelliJ IDEA, Eclipse, NetBeans o Visual Studio Code con Extension Pack for Java), o una terminal con `javac` y `java`.

## Estructura del proyecto

```text
Interpolación/
├── README.md
└── src/
    └── Interpolación/
        ├── Main.java
        ├── InterpolacionLagrange.java
        └── InterpolacionNewton.java
```

Los archivos declaran el paquete `Interpolación`. Si se compilan desde la carpeta que contiene ese directorio, conserva la carpeta y el nombre del paquete tal como aparecen.

## Compilar y ejecutar desde la terminal

Desde la carpeta raíz del proyecto, ejecuta:

```bash
javac -encoding UTF-8 -d out src/Interpolación/*.java
java -cp out Interpolación.Main
```

En algunos entornos puede ser necesario que la codificación de la terminal sea UTF-8. También puedes abrir la carpeta del proyecto en un IDE, marcarla como raíz de fuentes y ejecutar la clase `Main`.

## Datos de prueba

El programa utiliza los puntos:

| x | f(x) |
|---:|---:|
| 1.0 | 2.0 |
| 2.0 | 3.0 |
| 4.0 | 10.0 |

Evalúa ambos polinomios en `x = 3.0`, imprime la tabla de diferencias divididas de Newton y muestra los resultados para compararlos.

Resultado esperado, con pequeñas variaciones posibles por precisión decimal:

```text
Lagrange: P(3.00) = 5.666667
Newton:   P(3.00) = 5.666667
Diferencia absoluta: 0.000000000000
```

## Validaciones

Los métodos verifican que los arreglos no sean nulos ni estén vacíos, que tengan la misma longitud y que no existan nodos `x` repetidos. En caso de incumplimiento se lanza `IllegalArgumentException`.

## Descripción de las clases

- `InterpolacionLagrange.java`: implementa la evaluación del polinomio de Lagrange. La productoria de cada base se calcula con `(xEval - x[j]) / (x[i] - x[j])` para cada `j` distinto de `i`.
- `InterpolacionNewton.java`: genera la tabla de diferencias divididas, evalúa el polinomio de Newton e imprime la tabla.
- `Main.java`: define los datos de prueba, ejecuta ambos métodos y compara sus resultados.

## Autoría

Completa este apartado con tu nombre, grupo y datos académicos antes de publicar el repositorio.
