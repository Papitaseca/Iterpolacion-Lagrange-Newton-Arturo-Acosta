# Interpolación: Lagrange y Diferencias Divididas de Newton

Proyecto en Java que permite calcular el valor de un polinomio interpolador utilizando dos métodos numéricos:

- **Lagrange:** realiza la interpolación mediante los polinomios base.
- **Newton:** utiliza una tabla de diferencias divididas para construir y evaluar el polinomio.

## Requisitos

- Java JDK 8 o superior.
- Un IDE compatible con Java o una terminal que incluya `javac` y `java`.

## Estructura del proyecto

```text
Interpolacion Lagrange Newton Arturo Acosta/
├── README.md
└── Interpolación/
    ├── Main.java
    ├── InterpolacionLagrange.java
    └── InterpolacionNewton.java
```

Los archivos Java pertenecen al paquete `Interpolación`. Es importante conservar el nombre de la carpeta y del paquete.

## Compilar y ejecutar desde la terminal

Abre una terminal en la carpeta raíz del proyecto y ejecuta:

```bash
javac -encoding UTF-8 -d out "Interpolación"/*.java
java -cp out Interpolación.Main
```

El primer comando compila los archivos y guarda las clases generadas en la carpeta `out`. El segundo ejecuta el programa principal.

También puedes abrir el proyecto desde un IDE compatible con Java y ejecutar la clase `Main`.

## Datos de prueba

El programa utiliza los siguientes puntos:

| x | f(x) |
|---:|---:|
| 1.0 | 2.0 |
| 2.0 | 3.0 |
| 4.0 | 10.0 |

Ambos métodos evalúan el polinomio en `x = 3.0`. El programa muestra la tabla de diferencias divididas de Newton, los coeficientes del polinomio y los resultados de ambos métodos.

Resultado esperado:

```text
Lagrange: P(3.00) = 5.666667
Newton:   P(3.00) = 5.666667
Diferencia absoluta: 0.000000000000
```

## Validaciones

Los métodos comprueban que los arreglos no sean nulos ni estén vacíos, que tengan la misma cantidad de elementos y que no existan valores repetidos en los nodos `x`. Si alguna condición no se cumple, se genera una excepción `IllegalArgumentException`.

## Descripción de las clases

- **`Main.java`:** contiene los datos de prueba, ejecuta los dos métodos y compara sus resultados.
- **`InterpolacionLagrange.java`:** implementa el método de interpolación de Lagrange.
- **`InterpolacionNewton.java`:** calcula la tabla de diferencias divididas, evalúa el polinomio de Newton e imprime la tabla en consola.
