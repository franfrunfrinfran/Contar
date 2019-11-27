package es.Studium.Contar;

import java.util.Scanner;

public class Ejercicio18Contar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);

		String cadena;
		int contador=0; 
		
		System.out.println("Escriba una cadena");
		cadena=teclado.nextLine();
		
		cadena=cadena.replaceAll(" ", "");//quitar espacios en blanco
		
		for(int j=0;j<cadena.length();j++)
		{
			if ((int)cadena.charAt(j)>= 48 && (int)cadena.charAt(j)<=57)
			{
				contador++;
			}
		}
		
		System.out.println("El número de digitos es " + (cadena.length()-contador));
		
		teclado.close();
	}

}
