import java.util.Scanner;
public class Software1 {
	
	public static void main(String[] args) {

	/************************************************************************
	 * LA ESCUELA DE FÍSICA FUNDAMENTAL “TESLA” SOLICITA EL DESARROLLO DE UN 
	 * SOFTWARE QUE PUEDA CONVERTIR UNA CANTIDAD EN KILÓMETROS A METROS.
	 ***********************************************************************/
	
	//DATOS DEL PROBLEMA
	
			int cant_kilometros;
			int metros_por_kilometro = 1000;//1km 0 1000.m
			int resultado;
			
			//FUNCION
			Scanner datokilometro = new Scanner(System.in);
			System.out.println("km: ");
			cant_kilometros =datokilometro.nextInt();
			
			//OPERACION
			resultado = cant_kilometros * 1000;
			
			System.out.println(resultado);
   }
}  



