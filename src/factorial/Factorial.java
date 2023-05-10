
package factorial;
import java.util.Scanner;

/**
 *
 * @author El chistes (Kevin Moreno Rojas)
 *
 * Ciclo for
 * Programa para el cálculo del fatorial de un número
 *
 */

public class Factorial {
    Scanner stdIn = new Scanner(System.in);
        int numero;
        double factorial = 1.0;
        
        public void factorial (){
            System.out.print("Introduzca un número entero: ");
        numero = stdIn.nextInt();
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println(numero + "! = " + factorial);
        }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.factorial();
    }
}
