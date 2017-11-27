package pe.egcc.notasapp.prueba;

import pe.egcc.notasapp.model.Alumno;
import pe.egcc.notasapp.service.CursoService;

public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    Alumno alumno = new Alumno("Alexis", 10, 05, 04, 06, 15, 18);

    // Proceso
    CursoService cursoService = new CursoService();
    alumno = cursoService.procesarNotas(alumno);
    
    // Reporte
    System.out.println("Promedio Notas: " + alumno.getPronota());
    System.out.println("Promedio Final: " + alumno.getProfinal());
    System.out.println("Situación: " + alumno.getSituacion());

  }
}
