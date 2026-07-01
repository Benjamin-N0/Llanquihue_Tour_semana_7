package service;
import java.util.ArrayList;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

//Esta clase se encarga de mostrar por consola las distintas rutas turísticas registradas

public class ServicioDeRutas {
    
    public void mostrarRutas(ArrayList<ServicioTuristico> rutas){
        
        System.out.println("----LISTA DE RUTAS DE LLANQUIHUE TOUR----");
        
        for (ServicioTuristico servicio : rutas){
            
            System.out.println("---------------------");
            
            if(servicio instanceof ExcursionCultural){
                
            ExcursionCultural excursion = (ExcursionCultural) servicio;
            
                System.out.println("RUTA TIPO EXCURSION");
                
            }else if (servicio instanceof PaseoLacustre){
                
            PaseoLacustre paseo = (PaseoLacustre) servicio;
            
                System.out.println("RUTA TIPO PASEO");
            
            
            }else {
            
                System.out.println("RUTA NORMAL");
            }
            servicio.mostrarInformacion();
        }
    }
}
