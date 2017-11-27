package pe.egcc.censoapp.service;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.censoapp.model.Censo;

final class Data {

  private Data() {
  }
  
  static List<Censo> lista;
  
  static {
    lista = new ArrayList<>();
  }
  
  
  static final String SEXO_MASCULINO = "MASCULINO";
  static final String SEXO_FEMENINO = "FEMENINO";
  
  
  static final String INST_PRIMARIA = "PRIMARIA";
  static final String INST_SECUNDARIA = "SECUNDARIA";
  static final String INST_SUPERIOR = "SUPERIOR";
  
  
  
}
