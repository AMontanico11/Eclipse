
public class Software_4 {
         
	   public static void main(String[] args) {
		   
		   int contadorDeNumeros = 0;
	       int saltoDeLinea = 20;
	       int numeroDeDatos = 300;
	       
	    	for(int i = 5; i<=numeroDeDatos;i++) {
	    		System.out.print(i+"  ");
	    		contadorDeNumeros++;
	    		
	    		if(contadorDeNumeros==saltoDeLinea) {
	    			 System.out.println("");
	    		   contadorDeNumeros=0;
	    	}
	    	}
	    	}
	   }
