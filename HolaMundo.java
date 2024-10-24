import java.util.Scanner;

public class HolaMundo {
 
    // main, psvm para crearlo con la plantilla
    public static void main(String[] args) {
        // Imprimir datos en terminal
        System.out.println("Hola Brayan!");

        //Imprime en pantalla, pero no cambia de linea o no hace salto de linea
        System.out.print("Como van las cosas");

        System.out.printf("Aquí va una cadena: %s%n", "Brayan");
        System.out.printf("Aquí va una entero: %d%n", 10);
        System.out.printf("Mi nombre es %s y tengo %d años%n", "Brayan Perez", 21);

        var scanner = new Scanner(System.in);

        System.out.print("Por favor ingrese su nombre: ");
        var nombre = scanner.nextLine();

       
        System.out.println(nombre);

        scanner.close();

    }
    
}