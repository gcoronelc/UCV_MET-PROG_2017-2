package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.Item;

public class FacturaService extends CompAbstract{

    @Override
    public Item[] procesarVenta(double total) {
        // Variables
        double consumo, impuesto, servicio, totalGeneral;
        // Proceso
        consumo = total / 1.18;
        impuesto = total - consumo;
        servicio = total * 0.10;
        totalGeneral = total + servicio;
        // Preparar el reporte
        Item[] repo = {
            new Item("Consumo", consumo),
            new Item("Impuesto", impuesto),
            new Item("Total", total),
            new Item("Servicio", servicio),
            new Item("Total General", totalGeneral)
        };
        // Reporte
        return repo;
    }
    
}
