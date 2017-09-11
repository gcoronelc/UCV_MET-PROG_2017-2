package pe.ucv.pagoapp.service;

import pe.ucv.pagoapp.model.PagoModel;

public class PagoService {

	public PagoModel procesar( PagoModel bean){
		
		// Variables
		double ingresos;
		double renta;   
		double neto;  
		
		// Proceso
		ingresos = bean.getHorasDia() * bean.getDias() * bean.getPagoHora();
		renta = ingresos * ((ingresos>1500)?0.08:0);
		neto = ingresos - renta;
		
		// Retorno
		bean.setIngresos(ingresos);
		bean.setRenta(renta);
		bean.setNeto(neto);
		return bean;
		
	}
	
}
