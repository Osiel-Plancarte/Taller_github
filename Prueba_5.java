package Prueba;

import java.util.Arrays;

public class Prueba_5 {
	 public static void main(String[]args){
	int numero[]= {1,6,3,5,5,9,7,10,13,4,8};
	int izq=0, dere=numero.length-1;
	boolean bandera=false;
	int mitad=(izq+dere)/2;
	int num=9;
	Arrays.sort(numero);
	System.out.println(Arrays.toString(numero));
	while(izq<=dere && !bandera){
		mitad=(izq+dere)/2;
		if (numero[mitad]==num){
			bandera=true;
			break;
		}else if(numero[mitad]<num){
			izq=mitad+1;
		}else{
			dere=mitad-1;
		}
	}
	if (bandera) {
		System.out.println("Posicion"+mitad+"__numero:"+num);
	}else {
		System.out.println("valor no encontrado");
	}
}
}
