
package servicio;

import entidad.Revolver;
import java.util.Objects;

public class RevolverServicio {
    
  public static void llenarRevolver(Revolver r){
      
      r.setPosicionActual(0);
      r.setPosicionAgua((int) (Math.random() * 6 + 1));
      
  }
    
    public static Boolean mojar (Revolver r){
    return Objects.equals(r.getPosicionActual(), r.getPosicionAgua());
    }
    
     public static void siguienteChorro(Revolver r){
        r.setPosicionActual( r.getPosicionActual()+1);
                 
    }
    public static void mostrar (Revolver r ){
        System.out.println(r);
        
    }
     
    
}
