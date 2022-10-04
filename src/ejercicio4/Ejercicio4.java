package ejercicio4;

// ? Importamos el Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {
    public static void main(String[] args) {
        // ^ Creamos dos variables, num1 y num2 las cuales van a ser ordenadas de menor a mayor una vez el usuario introduzca sus valores

        // ^ Creamos el Scanner, se lo asignamos a la variable read y cambiamos su formato al de US
        final Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);


        
        // ^ Cerramos el Scanner
        read.close();
    }
}
