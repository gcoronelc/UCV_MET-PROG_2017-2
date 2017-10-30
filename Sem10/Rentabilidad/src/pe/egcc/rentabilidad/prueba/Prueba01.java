package pe.egcc.rentabilidad.prueba;

import pe.egcc.rentabilidad.model.CosechaModel;
import pe.egcc.rentabilidad.service.CosechaService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    CosechaModel model = new CosechaModel(15, 40, 50, 20, 200, 6, 4000);

    // Procesar
    CosechaService cosechaService = new CosechaService();
    model = cosechaService.procesarCosecha(model);

    // Reporte
    System.out.println("Gasto en Semilla: " + model.getGastoSemilla());
    System.out.println("Gasto en Abono: " + model.getGastoAbono());
    System.out.println("Gasto en Horas/Hombre: " + model.getGastoHoraHombre());
    System.out.println("Gasto en Riego: " + model.getGastoRiego());
    System.out.println("Ingresos Totales: " + model.getIngresoVenta());
    System.out.println("Utilidad: " + model.getUtilidad());

  }

}
