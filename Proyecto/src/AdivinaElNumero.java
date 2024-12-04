import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean jugarDeNuevo;
        do {
            int numeroSecreto = random.nextInt(100) + 1;
            int puntos = 5;

            System.out.println("¡Bienvenido al Adivina el número!");
            System.out.println("Tienes " + puntos + " puntos. Trata de adivinar el número entre 1 y 100.");

            while (puntos > 0) {
                System.out.print("Introduce tu número: ");
                int intento = scanner.nextInt();

                if (intento == numeroSecreto) {
                    System.out.println("¡Felicidades! Has adivinado el número.");
                    System.out.println("Tu puntuación final es: " + puntos);
                    break;
                } else {
                    puntos--;
                    System.out.println("¡Incorrecto! Te quedan " + puntos + " puntos.");

                    if (intento < numeroSecreto) {
                        System.out.println("Pista: El número secreto es mayor que " + intento + ".");
                    } else {
                        System.out.println("Pista: El número secreto es menor que " + intento + ".");
                    }

                    // Si el número es múltiplo de un número específico, lo mencionamos
                    if (numeroSecreto % 2 == 0) {
                        System.out.println("Pista extra: El número secreto es múltiplo de 2.");
                    } else if (numeroSecreto % 3 == 0) {
                        System.out.println("Pista extra: El número secreto es múltiplo de 3.");
                    } else {
                        System.out.println("Pista extra: El número secreto no es múltiplo de 2 ni de 3.");
                    }

                    int a = 0, b = 1, fib = 0;
                    boolean esFibonacci = false;
                    while (fib < numeroSecreto) {
                        fib = a + b;
                        a = b;
                        b = fib;
                        if (fib == numeroSecreto) {
                            esFibonacci = true;
                            break;
                        }
                    }

                    if (esFibonacci) {
                        System.out.println("Pista extra: El número pertenece a la serie de Fibonacci.");
                    } else {
                        System.out.println("Pista extra: El número no pertenece a la serie de Fibonacci.");
                    }
                }

                if (puntos == 0) {
                    System.out.println("Te has quedado sin puntos. El número secreto era " + numeroSecreto + ".");
                    System.out.println("¡Mejor suerte la próxima vez!");
                }
            }

            System.out.print("¿Quieres jugar de nuevo? (si/no): ");

            jugarDeNuevo = scanner.next().equals("si");

        } while (jugarDeNuevo);

        scanner.close();
    }
}

