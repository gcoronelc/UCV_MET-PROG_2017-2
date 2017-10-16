package pe.egcc.preciodeventa.controller;

import pe.egcc.preciodeventa.model.LoteModel;
import pe.egcc.preciodeventa.service.LoteService;

public class LoteController {

  public LoteModel procesarLote(LoteModel bean) {
    LoteService service = new LoteService();
    return service.procesarLote(bean);
  }
  
}
