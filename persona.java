package Prueba;
public class persona{
	
        int edad;
        String nombre;
     public static void main(String[]args){
    
    	    persona x = new persona();
    	    x.edad = 4;
    	    x.nombre = "Jorge";

    	    persona y;
    	    y= x;

    	    y.edad= 15;
    	    System.out.println(x.nombre+" "+x.edad);
    	    System.out.println(y.nombre+" "+y.edad);

     }
  
}
