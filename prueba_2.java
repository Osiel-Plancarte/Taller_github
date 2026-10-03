 package Prueba;
    import java.util.Arrays;
	import java.util.Scanner;
	public class prueba_2{
	    public static void main(String[]args){
	    Scanner sc= new Scanner(System.in);
	        int cantidad;
	        int salto=0, contador=0;

	          System.out.println("ingrese la cantidad de numeros:");
	          int cant=sc.nextInt();
	          int[] t = new int[cant];

	          for(int i=0; i<cant; i++ ) {
	        	  System.out.println("ingrese la cantidad de :"+i);
	        	  t[i]=sc.nextInt();
	          }
	          System.out.println(Arrays.toString(t));
	           
	          int[] p= new int[cant];
	          int[] salt= new int[cant];
	          
	          for(int i=0; i<cant; i++){
	        	 if(i==0) {
	        		 System.out.print(t[0]);
	        		 salt[0]=1;
	        		 contador++;	 
	        	 }else {
	        		 if(salto==0) {
	        			 salt[contador]=salt[contador-1]+1;
	        			 salto=salt[contador];
	        			 contador++;
	        		 }else {
	        			 System.out.print(t[i]);
	        			 salto--;
	        		 }
	        	 }
	          }
	        	  //ir pidiendo numeros dependiendo la cantidad
	        	  //y guardarlo en un array  <>
	          }
	    	 
	    }
	