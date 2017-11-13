package pe.egcc.encuestaapp.service;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.encuestaapp.model.Encuesta;

final class Datos {

  private Datos() {
  }

  static List<Encuesta> encuestas;
  
  static {
    encuestas = new ArrayList<>();
  }

}
