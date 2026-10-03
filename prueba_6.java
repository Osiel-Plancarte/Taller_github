 package Prueba;
import java.util.Arrays;
import java.util.Scanner;
public class prueba_6 {
	  public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int numero[]= {7,10,12,17,22,25,30,32,37,45};
	int I=0, F=numero.length-1;
	System.out.println(Arrays.toString(numero));
	System.out.println("ingrese el numero a buscar:");
	int num=sc.nextInt();
			while(I<=F){
				int mitad=(I+F)/2;
				if(numero[mitad]<num){
					I=mitad+1;
				}else{
					F=mitad-1;
				}
			}
			if (numero[I]==num) {
				System.out.println("numero:"+numero[I]);
			}
}
}



