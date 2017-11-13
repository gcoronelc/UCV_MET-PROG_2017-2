package pe.egcc.encuestaapp.service;

import java.util.List;
import pe.egcc.encuestaapp.model.Encuesta;

public class EncuestaService {
  
  public void agregar(Encuesta bean){
    Datos.encuestas.add(bean);
  }
  
  public List<Encuesta> getEncuestas(){
    return Datos.encuestas;
  }
  
}
