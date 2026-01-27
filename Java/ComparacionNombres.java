import java.util.Scanner;

public class ComparacionNombres{
	public static void main(String args[]){

	Scanner in = new Scanner(System.in);
	String nombreUno = "", nombreDos = "";

	System.out.print("Ingresa el primer nombre a registrar: ");
	nombreUno = in.nextLine();

	System.out.print("Ingresa el segundo nombre a registrar: ");
	nombreDos = in.nextLine();

	if (nombreUno.equalsIgnoreCase(nombreDos)){
		System.out.println("Los nombres son iguales");
	}
	else{
		System.out.println("Los nombres no son iguales");
	}
	}
}