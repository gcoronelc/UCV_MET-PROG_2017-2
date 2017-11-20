package pe.egcc.notasapp.service;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.notasapp.model.Alumno;

class Data {

  private Data() {
  }

  static List<Alumno> alumnos;

  static {
    alumnos = new ArrayList<>();
  }

}
