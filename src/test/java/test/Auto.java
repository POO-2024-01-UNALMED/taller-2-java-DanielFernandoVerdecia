package test;

import java.util.*;


public class Auto {
	
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public int cantidadCreados;
	
	public int cantidadAsientos() {
		return asientos.length;
	}
	
	

   public String verificarIntegridad() {
	   

	   //Registro auto
	   int r_auto = this.registro;
	   

	   //Registro Asiento
	   int r_asiento = new Asiento().registro;
	 
	   
	   //Registro Motor
	   int r_motor = new Motor().registro;
	   
	   
	   //Validar que el registro no sea pirata
	   if (r_auto != r_asiento) {
		   
		   
		   return "Las piezas no son originales";
		   
	   }
	   
	   else if (r_auto != r_motor) {
		   
		   
		   return "Las piezas no son originales";
		   
	   }
	   
	   else {
		   
		   return "Auto original";
		   
	   }
	   
	  
	   
   	}
	

}
