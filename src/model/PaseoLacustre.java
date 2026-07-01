package model;
/**
 * Representa un Paseo Lacustre ofrecida por Llanquihue Tour.
 * Esta clase hereda de ServicioTuristico y agrega el atributo
 * de tipo de embarcacion.
 */

public class PaseoLacustre extends ServicioTuristico{
     
    //atributos de la clase
    private String tipoEmbarcacion;
    
    //constructor con herencia de la clase ServicioTuristico
public PaseoLacustre(String nombre, int duracionHoras, String tipoEmbarcacion){
    super(nombre, duracionHoras);
    this.tipoEmbarcacion = tipoEmbarcacion;
    }    

//Getter y Setter
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

/**
* Muestra la información de Paseo Lacustre.
* Sobrescribe el método de la clase ServicioTuristico
* para incluir el tipo de embarcacion.
*/

@Override
public void mostrarInformacion(){
    System.out.println("Nombre: " + getNombre());
    System.out.println("Duracion: " + getDuracionHoras() + " horas");
    System.out.println("Tipo de embarcacion: " + getTipoEmbarcacion());
}


}
