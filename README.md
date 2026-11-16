# Métodos Numéricos para EDO: Runge-Kutta de 4to Orden (RK4) y Euler

Implementación modular en *Java* para la resolución numérica de Ecuaciones Diferenciales Ordinarias (EDO) de primer orden, contrastando el método de *Runge-Kutta de 4to Orden (RK4)* y el *Método de Euler* frente a la solución analítica exacta.

## 📋 Descripción del Problema

Se resuelve el siguiente Problema de Valor Inicial (PVI) en el intervalo \([0, 0.3]\):

\[\frac{dy}{dx} = x + y, \quad y(0) = 1\]

* *Solución analítica exacta:* \(y_{\text{exacta}}(x) = 2e^x - x - 1\)
* *Métrica de evaluación:* Error absoluto \(E_a = \vert{}y_{\text{exacta}}(x_n) - y_n\vert{}\)

## 🛠️ Requisitos Previos

* *Java Development Kit (JDK)* versión 8 o superior.
* *Git* instalado para clonar el repositorio.
* Terminal o línea de comandos (Bash, PowerShell, CMD o Zsh).

Verifica que tienes Java y Git instalados ejecutando:
bash
java -version
javac -version
git --version


## 📂 Estructura del Proyecto

text
├── Main.java                 # Punto de entrada y configuración de parámetros
├── MetodoRungeKutta.java     # Lógica matemática modular (RK4, Euler y solución exacta)
└── README.md                 # Documentación del proyecto


## 🚀 Instalación, Compilación y Ejecución

Sigue estos pasos en tu terminal para descargar y ejecutar el proyecto:

### 1. Clonar el repositorio
bash
git clone https://github.com
cd tu-repositorio

(Nota: Reemplaza la URL con el enlace real de tu repositorio en GitHub/GitLab).

### 2. Compilar el código fuente
Compila todos los archivos .java desde la carpeta raíz:
bash
javac Main.java MetodoRungeKutta.java

Esto generará los archivos de bytecode Main.class y MetodoRungeKutta.class.

### 3. Ejecutar el programa
Inicia la simulación ejecutando la clase principal:
bash
java Main


## 📊 Resumen de Resultados y Conclusiones Técnicas

Al ejecutar el programa se generan las tablas iterativas para *RK4 ($h = 0.1$)* y *Euler ($h \in \{0.1, 0.05, 0.01\}$)*:

| Método | Tamaño de paso ($h$) | Pasos ($N$) | $y(0.30)$ Aproximado | $y(0.30)$ Exacto | Error Absoluto en $x=0.30$ |
| :--- | :---: | :---: | :---: | :---: | :---: |
| *Euler* | 0.10 | 3 | 1.362000 | 1.399718 | 3.77e-02 |
| *Euler* | 0.05 | 6 | 1.380191 | 1.399718 | 1.95e-02 |
| *Euler* | 0.01 | 30 | 1.395698 | 1.399718 | 4.02e-03 |
| *RK4* | 0.10 | 3 | 1.399717 | 1.399718 | 6.21e-07 |
