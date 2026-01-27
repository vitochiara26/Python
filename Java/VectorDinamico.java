import java.util.Scanner;

public class VectorDinamico {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int tamaño_vector = in.nextInt();

        int vector_numeros[] = new int[tamaño_vector];

        for (int i = 0; i < tamaño_vector; i++){
            System.out.print("Ingrese el numero de la posicion " + (i + 1) +": ");
            vector_numeros[i] = in.nextInt();
        }

        for (int i = 0; i < tamaño_vector; i++){
            System.out.print("[" +vector_numeros[i] +"] ");
        }
   }
}
