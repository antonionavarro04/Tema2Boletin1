package ejercicio5;

// ? Importamos el Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio5 {
    public static void main(String[] args) {
        // ? Programa el cual introduciendole tres valores nos lo va a ordenar de mayor a menor.
        // ^ Creamos 3 variables; num1, num2 y num3 las cuales van a ser ordenadas de mayor a menor una vez el usuario introduzca sus valores
        double num1, num2, num3;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su formato al de US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que introudza 3 valores
        System.out.print("Introduce el primer número: ");
        num1 = read.nextDouble();
        System.out.print("Introduce el segundo número: ");
        num2 = read.nextDouble();
        System.out.print("Introduce el tercer número: ");
        num3 = read.nextDouble();

        // ? Salto de linea bonito
        System.out.println();System.out.println("---------------------------------------------");System.out.println();

        // ! Comprobamos mediante una estructura de if el orden en el que hay que ordenar los numeros
        System.out.println("Los números ordenados de mayor a menor son: ");
        if (num1 > num2){
            if (num2 > num3){
                System.out.println("El orden de los números es: " + num1 + ", " + num2 + ", " + num3);
            } else if (num1 > num3){
                System.out.println("El orden de los números es: " + num1 + ", " + num3 + ", " + num2);
            } else {
                System.out.println("El orden de los números es: " + num3 + ", " + num1 + ", " + num2);
            }
        } else {
            if (num1 > num3){
                System.out.println("El orden de los números es: " + num2 + ", " + num1 + ", " + num3);
            } else if (num2 > num3){
                System.out.println("El orden de los números es: " + num2 + ", " + num3 + ", " + num1);
            } else {
                System.out.println("El orden de los números es: " + num3 + ", " + num2 + ", " + num1);
            }
        }
        
        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
