package model;

/**
 * Clase base que representa un servicio turístico del sistema
 * Llanquihue Tour.
 *
 * Contiene los atributos comunes que comparten todos los tipos
 * de servicios turísticos y el método para mostrar su información.
 */
public class ServicioTuristico {
    
//atributos de la clase
private String nombre;
private int duracionHoras;

//constructor con parametros
    public ServicioTuristico(String nombre, int duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

/**
* Muestra por consola la información básica del servicio turístico.
* Este método sera sobrescrito por las clases hijas para
* mostrar información específica.
*/
public void mostrarInformacion(){
    System.out.println("Nombre: " + nombre);
    System.out.println("Duracion: " + duracionHoras + " horas");
}
}
