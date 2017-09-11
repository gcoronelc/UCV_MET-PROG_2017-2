package pe.ucv.app.prueba;

import pe.ucv.app.service.Punto;
import pe.ucv.app.service.Recta;

public class Prueba02 {

	public static void main(String[] args) {
		
		Recta recta = new Recta();
		
		recta.setP1(new Punto(0, 0));
		recta.setP2(new Punto(3, 4));
		
		System.out.println("Distancia: " 
				+ recta.getDistancia());
		
	}
}
