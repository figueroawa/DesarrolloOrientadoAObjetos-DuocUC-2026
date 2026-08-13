import java.util.Scanner;

public class EjemploScanner {
   public static void main(String[] args) {
        Scanner ejemplo_scanner = new Scanner(System.in);
		System.out.println("Ingrese su nombre:");

		String nombre_usuario = ejemplo_scanner.nextLine(); // Lee input del usuario
		System.out.println("¡Hola " + nombre_usuario + "!");
   } 
}
