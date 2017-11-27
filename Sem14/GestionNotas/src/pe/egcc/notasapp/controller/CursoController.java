package pe.egcc.notasapp.controller;

import java.util.List;
import pe.egcc.notasapp.model.Alumno;
import pe.egcc.notasapp.service.CursoService;

public class CursoController {

    private CursoService cursoService;

    public CursoController() {
        cursoService = new CursoService();
    }
    
    public Alumno procesarNotas(Alumno alumno) {
      return cursoService.procesarNotas(alumno);
    }
    
    public void registrarAlumno(Alumno alumno) {
      cursoService.registrarAlumno(alumno);
    }
    
    public List<Alumno> leerAlumnos() {
      return cursoService.leerAlumnos();
    }
    
    public Double leerNotaMayor() {
      return cursoService.leerNotaMayor();
    }
    
    public Double leerNotaMenor() {
      return cursoService.leerNotaMenor();
    }
    
    public Double leerPromedio() {
      return cursoService.leerPromedio();
    }
    
    public int leerAprobados() {
      return cursoService.leerAprobados();
    }
    
    public int leerDesaprobados() {
      return cursoService.leerDesaprobados();
    }
    
}
