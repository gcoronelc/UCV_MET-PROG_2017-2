package pe.egcc.ventaapp.controller;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.BoletaService;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaService;

public class VentaController {


    private final String COMP_FACTURA = "FACTURA";
    private final String COMP_BOLETA = "BOLETA";

    public String[] obtenerTipos(){
        String[] tipos = {COMP_FACTURA, COMP_BOLETA};
        return tipos;
    }
    
    public Item[] procesarVenta(String tipo, double total){
        CompAbstract service = null;
        switch(tipo){
            case COMP_FACTURA:
                service = new FacturaService();
                break;
            case COMP_BOLETA:
                service = new BoletaService();
                break;
        }
        return service.procesarVenta(total);
    }
    
}
