package pe.egcc.encuestaapp.prueba;

import pe.egcc.encuestaapp.model.Encuesta;
import pe.egcc.encuestaapp.service.EncuestaService;

public class Prueba01 {
 
  public static void main(String args[]) {
    
    
    EncuestaService service = new EncuestaService();
    
    service.agregar(new Encuesta("JAVA", "MAÑANA"));
    service.agregar(new Encuesta("SQL SERVER", "TARDE"));
    service.agregar(new Encuesta("MATEMATICA II", "NOCHE"));
    service.agregar(new Encuesta("SPRING", "MAÑANA"));
    service.agregar(new Encuesta("JAVA", "MAÑANA"));
    service.agregar(new Encuesta("EXCEL", "NOCHE"));
    
    
    
    for(Encuesta bean: service.getEncuestas()){
      System.out.println(bean.getCurso() + "\t" + bean.getTurno());
    }
    
    
  }
  
  
  
}
