package entornos;

/*
 * Este programa recorre los números del 1 al 100 y aplica las siguientes reglas:
 * 
 * Imprime "Fizz" si el número es divisible por 3.
 * Imprime "Buzz" si el número es divisible por 5.
 * Imprime el número si no es divisible ni por 3 ni por 5.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        // Bucle para recorrer los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Si el número es divisible por 3, imprime "Fizz"
            if (i % 3 == 0) {
                System.out.println("Fizz");
            // Si el número es divisible por 5, imprime "Buzz"
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            // Si no cumple ninguna de las condiciones anteriores, imprime el número
            } else {
                System.out.println(i);
            }
        }
    }

}
