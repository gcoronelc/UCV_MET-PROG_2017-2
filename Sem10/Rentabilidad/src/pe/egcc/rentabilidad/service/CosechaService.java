package pe.egcc.rentabilidad.service;

import pe.egcc.rentabilidad.model.CosechaModel;

public class CosechaService {

  public CosechaModel procesarCosecha(CosechaModel model) {

    // Variables
    double gastoSemilla, gastoAbono, gastoHoraHombre, gastoRiego, ingresoVenta, utilidad;

    // Proceso
    gastoSemilla = model.getPreBolsaSemilla() * 10 * model.getHectareas();
    gastoAbono = model.getPreBolsaAbono() * 20 * model.getHectareas();
    gastoHoraHombre = model.getPreHoraHombre()*200*model.getHectareas();
    gastoRiego = model.getPreRiegoHectarea()*4*model.getHectareas();
    ingresoVenta = model.getToneladasHectarea() * model.getPrecVentaTonelada() * model.getHectareas();
    utilidad = ingresoVenta - gastoSemilla - gastoAbono - gastoHoraHombre - gastoRiego;

    // Preparando la salida
    model.setGastoSemilla(gastoSemilla);
    model.setGastoAbono(gastoAbono);
    model.setGastoHoraHombre(gastoHoraHombre);
    model.setGastoRiego(gastoRiego);
    model.setIngresoVenta(ingresoVenta);
    model.setUtilidad(utilidad);
    
    // Retorno
    return model;
  }
}
