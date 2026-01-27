import java.util.Scanner;

public class LogIn{
	public static void main(String args[]){
	String createdUserName = "vitochiara26", createdPassword = "27550462";
	
	Scanner in = new Scanner(System.in);
	String  userName = "", password = "";

	System.out.print("Ingresa el nombre de usuario:  ");
	userName = in.nextLine();

	System.out.print("Ingresa la contraseña: ");
	password = in.nextLine();

	if (createdUserName.equals(userName) && (createdPassword.equals(password))){
		System.out.println("Inicio de sesion correcto.");
	}
	else{
		System.out.println("Usuario o contraseña incorrecto.");
	}
	}
}