# Laboratorio 1: Construcción Automática de Proyectos de Software con Maven y Pruebas Unitarias

**Curso:** Construcción y Pruebas de Software  
**Estudiante:** Gallegos Inca, Mauricio Alonso Guido  
**Institución:** Instituto Superior Tecnológico TECSUP — Arequipa  

---

## 🛠️ Estructura del Proyecto

El proyecto está gestionado con Apache Maven y estructurado según las convenciones estándar:

```text
Lab11-Construccion/
├── .gitignore
├── README.md
└── calculadora-maven/
    ├── pom.xml
    └── src/
        ├── main/
        │   └── java/
        │       └── com/tecsup/lab01/
        │           ├── App.java
        │           └── Calculadora.java
        └── test/
            └── java/
                └── com/tecsup/lab01/
                    └── CalculadoraTest.java
```

---

## 📋 Métodos de la Clase `Calculadora`

1. **`sumar(int a, int b)`**: Retorna la suma de dos números enteros.
2. **`dividir(int a, int b)`**: Retorna la división entera. Si el divisor `b` es cero, lanza una excepción `IllegalArgumentException`.
3. **`esPositivo(int n)`**: Evalúa si un número es positivo (`n > 0`), retornando `true` o `false`.

---

## 🧪 Pruebas Unitarias con JUnit 5 (Patrón AAA)

En `CalculadoraTest.java` se implementan pruebas con el patrón **Arrange-Act-Assert** y el ciclo de vida `@BeforeEach`:

* `sumar_dosNumeros_devuelveSuma()`
* `dividir_diezEntreDos_devuelveCinco()` (caso normal)
* `dividir_entreCero_lanzaExcepcion()` (con `assertThrows`)
* `esPositivo_numeroPositivo_devuelveTrue()` (número mayor a cero)
* `esPositivo_numeroNegativo_devuelveFalse()` (número menor a cero)
* `esPositivo_casoLimiteCero_devuelveFalse()` (caso límite con cero)

---

## 🔍 Análisis contra las Características FIRST

* **F - Fast (Rápidas):** Las pruebas se ejecutan en 0.05 segundos en consola.
* **I - Independent (Independientes):** Gracias a `@BeforeEach`, cada prueba instancia un objeto nuevo y fresco, sin depender de otras pruebas.
* **R - Repeatable (Repetibles):** No dependen de internet, base de datos ni sistema operativo; arrojan el mismo resultado siempre.
* **S - Self-validating (Auto-validables):** No requieren inspección manual por consola; JUnit valida automáticamente mediante aserciones (`assertEquals`, `assertTrue`, `assertFalse`, `assertThrows`).
* **T - Timely / Thorough (Oportunas y Exhaustivas):** Cubren casos normales, errores con excepciones y casos de borde o límite.

---

## 🚀 Compilación y Ejecución de Pruebas

Para compilar y correr las pruebas:

```bash
cd calculadora-maven
mvn test
```

Resultado obtenido:
```text
Results:
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```
