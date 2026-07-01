package model;
/**
 * Representa una Excursion Cultural ofrecida por Llanquihue Tour.
 * Esta clase hereda de ServicioTuristico y agrega el atributo
 * de lugr historico.
 */

public class ExcursionCultural extends ServicioTuristico {
    
//atributos de la clase
    private String lugarHistorico;
    
    //constructor con herencia de la clase ServicioTuristico
    public ExcursionCultural(String nombre, int duracionHoras, String lugarHistorico){
    super(nombre, duracionHoras);
    this.lugarHistorico = lugarHistorico;
    }

    //Getter y Setter
    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }
 
/**
* Muestra la información de Excursion Cultural.
* Sobrescribe el método de la clase ServicioTuristico
* para incluir el lugar historico.
*/
@Override
public void mostrarInformacion(){
    System.out.println("Nombre: " + getNombre());
    System.out.println("Duracion: " + getDuracionHoras() + " horas");
    System.out.println("Lugar Historico: " + getLugarHistorico());
}

}
