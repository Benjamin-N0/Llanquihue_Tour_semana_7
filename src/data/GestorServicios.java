package data;
import java.util.ArrayList;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

/**
 * Clase encargada de gestionar la creación de las rutas turísticas
 * utilizadas por el sistema Llanquihue Tour.
 * Genera una colección de servicios turísticos con distintos tipos de
 * rutas para demostrar el uso de herencia y polimorfismo.
 */
public class GestorServicios {
    
/**
* Generamos una lista de servicios turísticos con información de prueba.
* @return ArrayList con los servicios turísticos creados.
*/
    public ArrayList<ServicioTuristico> generarRutas(){
        
        ArrayList<ServicioTuristico> rutas = new ArrayList<>();
        rutas.add(new RutaGastronomica("Ruta Salmon",3,3));
        rutas.add(new ExcursionCultural("Excursion Generica",3,"Monte Generico"));
        rutas.add(new ExcursionCultural("Excursion Normal",3,"Monte de algun lado"));
        rutas.add(new PaseoLacustre("Lago generico",4,"Barco"));
        rutas.add(new PaseoLacustre("Lago generico dos",4,"lancha"));
        rutas.add(new RutaGastronomica("Ruta Pescado",5,5));
    return rutas;
    }
    
}
