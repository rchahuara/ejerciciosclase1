package com.senati.camara;

public class Implementacamara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camara camara1 = new Camara();
		camara1.descripcion = "camara fotografica";
		camara1.marca = "toshiba";
		camara1.modelo = "digital";
		camara1.precio = 100;
		
		Camara camara2 = new Camara("filmadora","sanyo",30,"x3oo");
		System.out.println(camara1.toString());
		System.out.println(camara2.toString());
		
	}		

}
