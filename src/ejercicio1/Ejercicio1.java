package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        final Scanner read = new Scanner(System.in);

        long num;

        System.out.print("Introduce un número: ");
        num = read.nextLong();

        num %= 2;

        if (num == 0){
            
        }

        read.close();
    }
    
}
