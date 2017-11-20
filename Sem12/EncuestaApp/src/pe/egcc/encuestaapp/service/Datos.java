package pe.egcc.encuestaapp.service;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.encuestaapp.model.Encuesta;

final class Datos {

    private Datos() {
    }

    static List<Encuesta> encuestas;
    
    static String turnos[] = {"MAÑANA", "TARDE", "NOCHE"};

    static String cursos[] = {
        "JAVA ORIENTADO A OBJETOS",
        "JAVA JDBC",
        "JAVA WEB",
        "SQL SERVER PROGRAMACION",
        "ORACLE IMPLEMENTACION",
        "ORACLE PL/SQL",
        "EXCEL BASICO",
        "EXCEL AVANZADO",
        "EXCEL FINANCIERO"
    };

    static {
        encuestas = new ArrayList<>();
    }

}
