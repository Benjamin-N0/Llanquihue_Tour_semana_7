#Evaluación Formativa Semana 7 – Desarrollo Orientado a Objetos I

## Autor del proyecto
- **Nombre completo:** Benjamin Norambuena
- **Carrera:** Analista Programador Computacional

## Descripción de esta semana

En esta séptima semana realizarás una actividad formativa individual llamada “Aplicando polimorfismo y colecciones genéricas”, donde se espera que extiendas una jerarquía de clases previamente diseñada, incorporando el uso de colecciones, la sobrescritura de métodos y la diferenciación de comportamientos mediante referencias a la superclase.


## Caso: "Llanquihue Tour"

Durante la semana anterior, implementaste una jerarquía de clases para representar los servicios turísticos de la agencia (ServicioTuristico, RutaGastronomica, PaseoLacustre, ExcursionCultural). Ahora, debes avanzar hacia una versión funcional que permita gestionar y recorrer dinámicamente estos servicios desde una colección, aplicando principios de polimorfismo y sobrescritura de métodos.

## Problematica:

•	Almacenar diferentes tipos de servicios turísticos en una misma colección.
•	Recorrer y mostrar su información de forma polimórfica, invocando métodos sobrescritos desde referencias del tipo ServicioTuristico.
•	Escalar el sistema de manera flexible, permitiendo integrar nuevas subclases sin modificar el código existente.


## 🧱 Estructura general del proyecto
```plaintext
📁 src/
├── ui/                            # Clase principal con el método main
    └── Main.java

├── model/                         # Clases de dominio
    └──ServicioTuristico.java
    └── RutaGastronomica.java
    └── PaseoLacustre.java
    └── ExcursionCultural.java

├── data/                          # Clase encargda de creacion de rutas
    └── GestorRutas.java

├── service/                       # Clase encargada de procesar la informacion
    └── ServicioDeRutas.java
````
## Ejecución

1. Clonar el repositorio:

```bash
git clone https://github.com/Benjamin-N0/llanquihue-tour.git
```

2. Abrir el proyecto en NetBeans.

3. Ejecutar la clase:

```text
ui/Main.java
```

##Ejemplo de Salida
```bash
----LISTA DE RUTAS DE LLANQUIHUE TOUR----

---------------------
RUTA NORMAL
Nombre: Ruta Salmon
Duración: 3 horas
Número de Paradas: 3

---------------------
RUTA TIPO EXCURSION
Nombre: Excursion Generica
Duración: 3 horas
Lugar Histórico: Monte Generico
---------------------

RUTA TIPO PASEO
Nombre: Lago Generico
Duración: 4 horas
Tipo de Embarcación: Barco
```
