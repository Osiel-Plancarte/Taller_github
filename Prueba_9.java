package Prueba;
public class Prueba_9 {
  public static void main(String[] args) {
    int sum2=0;
    int sum1=0;
    int numero[]= {15,10,10,10,10  };
    for(int i=0; i<numero.length;i++) {
    	sum1=sum1+numero[i ];
    }
	    for (int j = numero.length - 1; j >= 0; j--) {
	         sum2 =sum2+ numero[j];
	    }
	    int sum3=sum1+sum2;
    System.out.println("suma de atras hacia adelante:"+sum1);
    System.out.println("suma de adelante hacia atras:"+sum2);
    System.out.println("suma total:"+sum3);
    
}
}
