package pe.egcc.notasapp.prueba;

import java.util.List;
import pe.egcc.notasapp.model.Alumno;
import pe.egcc.notasapp.service.CursoService;

public class Prueba02 {

  public static void main(String[] args) {

    // Dato
    Alumno alumno1 = new Alumno("Alexis", 10, 12, 10, 15, 16, 12);
    Alumno alumno2 = new Alumno("Sara", 10, 12, 00, 15, 5, 5);
    Alumno alumno3 = new Alumno("Natalia", 18, 12, 10, 15, 16, 12);
    Alumno alumno4 = new Alumno("Yola", 10, 12, 15, 15, 16, 12);
    Alumno alumno5 = new Alumno("yala", 10, 18, 18, 15, 16, 12);

    // Proceso
    CursoService cursoService = new CursoService();

    alumno1 = cursoService.procesarNotas(alumno1);
    alumno2 = cursoService.procesarNotas(alumno2);
    alumno3 = cursoService.procesarNotas(alumno3);
    alumno4 = cursoService.procesarNotas(alumno4);
    alumno5 = cursoService.procesarNotas(alumno5);

    cursoService.registrarAlumno(alumno1);
    cursoService.registrarAlumno(alumno2);
    cursoService.registrarAlumno(alumno3);
    cursoService.registrarAlumno(alumno4);
    cursoService.registrarAlumno(alumno5);

    // Reporte
    List<Alumno> alumnos = cursoService.leerAlumnos();
    System.out.println("NOMBRE\tPROMNOTA\tPROMFINAL\tSITUACION");
    for (Alumno alumno : alumnos) {
      System.out.println( alumno.getNombre() + "\t" 
              + alumno.getPronota() + "\t\t" + 
              alumno.getProfinal() + "\t\t" + alumno.getSituacion());
    }

    System.out.println("");
    System.out.println("Nota Mayor: " + cursoService.leerNotaMayor());
    System.out.println("Nota Menor: " + cursoService.leerNotaMenor());
    System.out.println("Promedio general: " + cursoService.leerPromedio());
    System.out.println("Aprobados: " + cursoService.leerAprobados());
    System.out.println("Desaprobados: " + cursoService.leerDesaprobados());
    
  }

}
