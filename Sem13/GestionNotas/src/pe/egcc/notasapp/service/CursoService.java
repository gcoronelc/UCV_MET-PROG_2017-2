package pe.egcc.notasapp.service;

import java.util.List;
import pe.egcc.notasapp.model.Alumno;

public class CursoService {

  public Alumno procesarNotas(Alumno alumno) {
    // Variables
    Double pronotas, profinal;
    String situacion;
    // Proceso
    pronotas = (alumno.getNota1() + alumno.getNota2() 
            + alumno.getNota3() + alumno.getNota4() ) / 4.0;
    profinal = ( pronotas + alumno.getExapar() + alumno.getExafin()) / 3.0;
    if (profinal > 11) {
      situacion = "Aprobo";
    } else {
      situacion = "Desaprobo";
    }
    // Respuesta
    alumno.setPronota(dosDec(pronotas));
    alumno.setProfinal(dosDec(profinal));
    alumno.setSituacion(situacion);
    
    // Salida
    return alumno;
  }

  public void registrarAlumno(Alumno alumno) {
    Data.alumnos.add(alumno);
  }

  public List<Alumno> leerAlumnos() {
    return Data.alumnos;
  }

  private double dosDec(double valor) {
    valor *= 100.0;
    valor = Math.round(valor);
    valor /= 100.0;
    return valor;
  }

  public Double leerNotaMayor() {
    Double notaMayor = 0.0;
    for (Alumno alumno : Data.alumnos) {
      if(notaMayor < alumno.getProfinal()){
        notaMayor = alumno.getProfinal();
      }
    }
    return notaMayor;
  }
  
  public Double leerNotaMenor() {
    Double notaMenor = 20.0;
    for (Alumno alumno : Data.alumnos) {
      if(notaMenor > alumno.getProfinal()){
        notaMenor = alumno.getProfinal();
      }
    }
    if( Data.alumnos.isEmpty()){
      notaMenor = 0.0;
    }
    return notaMenor;
  }
  
  public Double leerPromedio() {
    Double suma = 0.0;
    for (Alumno alumno : Data.alumnos) {
      suma += alumno.getProfinal();      
    }
    Double prom = dosDec( suma/Data.alumnos.size() );
    return prom;
  }
  
  public int leerAprobados() {
    int cont = 0;
    for (Alumno alumno : Data.alumnos) {
      if(alumno.getSituacion().equals("Aprobo")){
        cont++;
      }
    }
    return cont;
  }
  
  public int leerDesaprobados() {
    int cont = 0;
    for (Alumno alumno : Data.alumnos) {
      if(alumno.getSituacion().equals("Desaprobo")){
        cont++;
      }
    }
    return cont;
  }
  

}
