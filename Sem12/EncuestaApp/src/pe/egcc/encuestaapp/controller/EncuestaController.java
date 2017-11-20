package pe.egcc.encuestaapp.controller;

import java.util.List;
import pe.egcc.encuestaapp.model.Encuesta;
import pe.egcc.encuestaapp.service.EncuestaService;

public class EncuestaController {

    private EncuestaService encuestaService;

    public EncuestaController() {
        encuestaService = new EncuestaService();
    }
    
    public String[] obtenerCursos(){
        return encuestaService.obtenerCursos();
    }
    
    public String[] obtenerTurnos(){
        return encuestaService.obtenerTurnos();
    }

    public void procesarEncuesta(Encuesta[] datos) {
        for (Encuesta dato : datos) {
            encuestaService.agregar(dato);
        }
    }

    public List<Encuesta> obtenerEncuestas() {
        return encuestaService.getEncuestas();
    }
    
}
