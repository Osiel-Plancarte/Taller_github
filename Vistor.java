package Prueba;
import java.util.Scanner;
public class Vistor {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num,sum,result,result2;
		System.out.println("introduzca el numero de carros de leña: ");
		 num=sc.nextInt();
		 sum=num*100000;
		 result=sum/5;
		 result2=result*4;
		
		System.out.println("total de produccion:"+result2);
		System.out.println("ganancia de los "+num+" carros de leña:"+result);
	}
}
