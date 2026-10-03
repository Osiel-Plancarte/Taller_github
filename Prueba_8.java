package Prueba;

public class Prueba_8 {
public static void main(String[] args) {
	int m=6;
	int n=8;
	int direccion=0;
	int i = 0; 
	
	int matriz[][]=new int[m][n];
	for(int j=0;j<n;j++) {
		matriz[i][j] = 1;
		
	 i+= direccion;
	 
	 if(i == m-1) {
		 direccion = -1; 
		 
	 }else if(i == 0) {
		 direccion = 1; 
	 }
		
	}
	
}
}
