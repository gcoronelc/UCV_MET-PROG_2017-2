package pe.egcc.censoapp.service;

import java.util.List;
import pe.egcc.censoapp.model.Censo;

public class CensoService {

  public void grabarCenso(Censo bean){
    Data.lista.add(bean);
  }
  
  public List<Censo> leerCensos(){
    return Data.lista;
  }
  
  public String[] leerSexos(){
    String[] sexos = {Data.SEXO_MASCULINO, Data.SEXO_FEMENINO};
    return sexos;
  }
  
  public String[] leerGrados(){
    String[] grados = {Data.INST_PRIMARIA, Data.INST_SECUNDARIA, Data.INST_SUPERIOR};
    return grados;
  }
  
  
  
  
  
  
}
