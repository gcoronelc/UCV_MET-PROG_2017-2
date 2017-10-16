package pe.egcc.preciodeventa.service;

import pe.egcc.preciodeventa.model.LoteModel;

public class LoteService {

  public LoteModel procesarLote(LoteModel bean) {
    // Variables
    double uniComer, cosLote, cosUnidad, preVenta;
    // Proceso
    uniComer = 0.90 * bean.getTamLote();
    double gasAdm = ( bean.getPorcGastosAdm()  * bean.getPreLote() ) / 100;
    cosLote = bean.getPreLote() + gasAdm;
    cosUnidad = cosLote / uniComer;
    double gana = ( bean.getPorcGanancia()* cosUnidad ) / 100;
    preVenta = cosUnidad + gana;
    // Preparar salida
    bean.setUniComer(uniComer);
    bean.setCosLote(cosLote);
    bean.setCosUnidad(cosUnidad);
    bean.setPreVenta(preVenta);
    // Retorno
    return bean;
  }
  
}
