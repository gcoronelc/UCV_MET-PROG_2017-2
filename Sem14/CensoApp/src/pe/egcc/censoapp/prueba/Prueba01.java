package pe.egcc.censoapp.prueba;

import pe.egcc.censoapp.model.Censo;
import pe.egcc.censoapp.service.CensoService;

public class Prueba01 {

  public static void main(String[] args) {
    
    CensoService censoService = new CensoService();
    
    String[] sexos = censoService.leerSexos();
    String[] grados = censoService.leerGrados();
    
    censoService.grabarCenso(new Censo("YO", 50, sexos[0], grados[2]));
    censoService.grabarCenso(new Censo("dfsd", 10, sexos[1], grados[1]));
    censoService.grabarCenso(new Censo("sdds", 30, sexos[0], grados[0]));
    censoService.grabarCenso(new Censo("YddddO", 35, sexos[1], grados[2]));
    censoService.grabarCenso(new Censo("hhhh", 8, sexos[0], grados[1]));
    censoService.grabarCenso(new Censo("kkkk", 15, sexos[1], grados[2]));
    
    
    for(Censo r: censoService.leerCensos()){
      System.out.println(r.getNombre() + ", " + r.getEdad() + ", " 
              + r.getSexo() + ", " + r.getInstruccion());
    }
    
  }
  
}
