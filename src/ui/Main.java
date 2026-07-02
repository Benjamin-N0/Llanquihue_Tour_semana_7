package ui;
import java.util.ArrayList;
import model.ServicioTuristico;
import data.GestorServicios;
import service.ServicioDeRutas;

/**
 * Clase principal del sistema Llanquihue Tour.
 *
 * Se encarga de iniciar el sistema, genera la colección de
 * servicios turísticos y muestra la información de las rutas
 * disponibles por consola.
 */
public class Main {

    public static void main(String[] args) {
        
        //Crea el gestor encargado de generar las rutas.
        GestorServicios gestor = new GestorServicios();
        
         //Crea el servicio encargado de mostrar las rutas.
        ServicioDeRutas servicio = new ServicioDeRutas();
        
         //Obtiene la lista de rutas disponibles.
        ArrayList<ServicioTuristico> rutas = gestor.generarRutas();
        
        //Muestra la información de las rutas por consola.
        servicio.mostrarRutas(rutas);
    }
}
