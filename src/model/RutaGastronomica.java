package model;
/**
 * Representa una ruta gastronómica ofrecida por Llanquihue Tour.
 * Esta clase hereda de ServicioTuristico y agrega el atributo
 * de paradas que contempla la ruta.
 */

public class RutaGastronomica extends ServicioTuristico{
    
//atributos de la clase
    private int numeroDeParadas;
    
    //constructor con herencia de la clase ServicioTuristico
    public RutaGastronomica(String nombre, int duracionHoras, int numeroDeParadas){
    super(nombre, duracionHoras);
    this.numeroDeParadas = numeroDeParadas;
    }    

    //Getter y Setter
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }
/**
* Muestra la información de la ruta gastronómica.
* Sobrescribe el método de la clase ServicioTuristico
* para incluir el número de paradas.
*/
@Override
public void mostrarInformacion(){
    System.out.println("Nombre: " + getNombre());
    System.out.println("Duracion: " + getDuracionHoras() + " horas");
    System.out.println("Numero de Paradas: " + getNumeroDeParadas());
}
    
    
}
