import java.util.Scanner;
public class Sowtfare2 {
            
	       public static void main (String[] args) {    	
	        	  
	       //DEFINICION DE MATRIZ
	        String [] nombres = new String [10];
	        
	        nombres [0] = "ADRIAN";
 	        nombres [1] = "ALBERTO";
	        nombres [2] = "CARLOS";
	        nombres [3] = "CRISTINA";
	        nombres [4] = "DANIEL";
	        nombres [5] = "DARINA";
	        nombres [6] = "DAVID";
	        nombres [7] = "FLOR";
	        nombres [8] = "JOSE";
	        nombres [9] = "MARCOS";
	        
	        //EL NOMBRE A BUSCAR 
	        Scanner buscarNombre = new Scanner (System.in);
	        System.out.println("Que nombre buscas: ");
	        String nombreAbuscar = buscarNombre.nextLine();
	        
	        //OPERACION PARA ENCONTRAR EL NOMBRE INGRESADO
	        for(int i = 0;i<=9;i++) {
	        	if(nombreAbuscar.equalsIgnoreCase(nombres[i])) {
	        		
	        		//RESPUESTA DEL NOMBRE BUSCADO 
	        		System.out.println("Si existe");
	        	}
	        }
	        
	    			   
	          }
}
