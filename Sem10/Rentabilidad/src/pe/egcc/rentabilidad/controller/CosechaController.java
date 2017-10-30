package pe.egcc.rentabilidad.controller;

import pe.egcc.rentabilidad.model.CosechaModel;
import pe.egcc.rentabilidad.service.CosechaService;

public class CosechaController {

  public CosechaModel procesarCosecha(CosechaModel model) {
    
    CosechaService   cosechaService = new CosechaService();
    return cosechaService.procesarCosecha(model);
    
  }
  
}
