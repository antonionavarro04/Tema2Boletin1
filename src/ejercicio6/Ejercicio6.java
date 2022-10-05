package ejercicio6;

// ? Importamos el Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio6 {
    public static void main(String[] args) {
        // ^ Creamos 3 variables; a, b y c las cuales van a ser usadas para hallar x y posteriormente resolver la ecuacion de segundo grado
        double a, b, c, x1 = 0, x2 = 0, sqrt = 0;

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su formato al de US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos al usuario que introudza los valores de a, b y c
        System.out.print("Introduce el valor de a: ");
        a = read.nextDouble();
        System.out.print("Introduce el valor de b: ");
        b = read.nextDouble();
        System.out.print("Introduce el valor de c: ");
        c = read.nextDouble();

        // ? Salto de linea bonito
        System.out.println();System.out.println("---------------------------------------------");System.out.println();

        // ! Comprobamos mediante una estructura de if si la ecuacion tiene solucion o no
        // ? En caso de que 'a' sea 0 la ecuacion ya directamente no va a tener solucion, ya que cualquier numero dividido entre 0 no se puede calcular
        if (a == 0){
            System.out.println("La ecuacion no tiene solución Real");
            System.out.println("Motivo: a = 0, no se puede dividir entre 0");
        } else{
            sqrt = Math.pow(b, 2) - (4 * a * c);
            if (sqrt < 0){
                System.out.println("La ecuacion no tiene solución Real");
                System.out.println("Motivo: No se puede hacer la raiz cuadrada de: " + sqrt);
            } else {
                x1 = (-b + Math.sqrt(sqrt)) / (2 * a);
                x2 = (-b - Math.sqrt(sqrt)) / (2 * a);
                System.out.println("La ecuacion tiene dos soluciones: " + x1 + " y " + x2);
            }
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
