import java.util.Scanner;

public class Vacaciones{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String nombre = "";
		int clave = 0, dias = 0, tiempo = 0;
		
		System.out.println("Programa para calcular los dias de Vacaciones de la empresa Coca-cola, C.A.");
		System.out.println("Dependiendo del departamento al que pertenece y los años de servicio.");
		System.out.println("");

		System.out.print("Indica el nombre del empleado: ");
		nombre = in.nextLine();
		System.out.println("");

		System.out.println("Indica a cual departamento pertenece " + nombre);
		System.out.print("Intoduce la clave. 1 = Atencion al cliente. 2 = Logistica. 3 = Gerencia.: ");
		clave = in.nextInt();
		System.out.println("");

		System.out.print("Indica cuantos años de servicio tiene en la empresa " + nombre+ ".: ");
		tiempo = in.nextInt();
		System.out.println("");

		if (clave == 1){
			if(tiempo == 1){
				dias = 6;
			}
			else if(tiempo >= 2 && tiempo <= 6){
				dias = 14;
			}
			else if(tiempo >= 7){
				dias = 20;
			}
			else{
				dias = 0;
			}
			System.out.println(nombre + ", del departamento de atencion al cliente, gozará de " + dias + " de vacaciones debido a su tiempo de servicio en la empresa");
		}
		else if (clave == 2){
			if(tiempo == 1){
				dias = 7;
			}
			else if (tiempo >= 2 && tiempo <= 6){
				dias = 15;
			}
			else if(tiempo >= 7){
				dias = 22;
			}
			else{
				dias = 0;
			}
			System.out.println(nombre + ", del departamento de logistica, gozará de " + dias + " de vacaciones debido a su tiempo de servicio en la empresa");
		}
		else if (clave == 3){
			if (tiempo == 1){
				dias = 10;
			}
			else if (tiempo >= 2 && tiempo <= 6){
				dias = 20;
			}
			else if (tiempo >= 7){
				dias = 30;
			}
			else {
				dias = 0;
			}
			System.out.println(nombre + ", del departamento de gerencia, gozará de " + dias + " de vacaciones debido a su tiempo de servicio en la empresa.");
		}
		else {
			System.out.println("La clave no existe.");
		}	

 }
}



















