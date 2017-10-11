package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.Item;

public class BoletaService extends CompAbstract {

    @Override
    public Item[] procesarVenta(double total) {
        // Variables
        double servicio, totalGeneral;
        // Proceso
        servicio = total * 0.10;
        totalGeneral = total + servicio;
        // Preparar el reporte
        Item[] repo = {
            new Item("Total", total),
            new Item("Servicio", servicio),
            new Item("Total General", totalGeneral)
        };
        // Reporte
        return repo;
    }

}
