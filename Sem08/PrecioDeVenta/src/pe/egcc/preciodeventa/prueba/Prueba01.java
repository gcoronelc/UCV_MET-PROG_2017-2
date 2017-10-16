package pe.egcc.preciodeventa.prueba;

import pe.egcc.preciodeventa.model.LoteModel;
import pe.egcc.preciodeventa.service.LoteService;

public class Prueba01 {

  public static void main(String[] args) {
    // datos
    String nombre = "Pantalon";
    double tamLote = 1000;
    double preLote = 50000.0;
    double porcGastosAdm = 25.0;
    double porcGanancia = 200.0;
    LoteModel bean = new LoteModel(nombre, tamLote, preLote, porcGastosAdm, porcGanancia);
    
    // Proceso
    LoteService service = new LoteService();
    bean = service.procesarLote(bean);
    
    // Reporte
    System.out.println("Uni. a comercializar: " + bean.getUniComer());
    System.out.println("Costo del lote: " + bean.getCosLote());
    System.out.println("Costo por unidad: " + bean.getCosUnidad());
    System.out.println("Precio de venta: " + bean.getPreVenta());
    
  }
}
