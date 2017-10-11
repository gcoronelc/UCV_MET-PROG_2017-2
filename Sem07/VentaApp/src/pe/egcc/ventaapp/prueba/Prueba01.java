package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.BoletaService;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaService;

public class Prueba01 {

    public static void main(String[] args) {
        
        // Dato
        double total = 345.67;
        
        // Proceso
        CompAbstract service = new BoletaService();
        Item[] repo = service.procesarVenta(total);
        
        // Reporte
        for (Item i : repo) {
            System.out.println(i.getConcepto() + " - " + i.getValor());
        }
            
    }
    
}
