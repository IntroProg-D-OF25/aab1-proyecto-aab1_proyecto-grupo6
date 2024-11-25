import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Número de intentos disponibles
        int intentos = 20;

        // Crear un objeto Random para generar un número aleatorio entre 1 y 20
        Random random = new Random();
        int numRandom = random.nextInt(30) + 1;

        System.out.println("Adivina el número entre 1 y 20");

        // Primer intento
        int num = scanner.nextInt();

        while (intentos > 0) {
            if (num == numRandom) {
                System.out.println("¡Felicidades! Has adivinado el número " + numRandom + " correctamente.");
                break;
            } else {
                intentos--; // Reducir los intentos después del primer fallo

                if (num < numRandom) {
                    System.out.println("Incorrecto. El número es mayor.");
                } else if (num > numRandom) {
                    System.out.println("Incorrecto. El número es menor.");
                }

                // Mostrar los intentos restantes
                System.out.println("Te quedan: " + intentos + " intentos.");

                if (intentos > 0) {
                    System.out.println("¿Quieres una pista? (si/no)");
                    String respuesta = scanner.next();

                    if (respuesta.equalsIgnoreCase("si")) {
                        // Dar una pista adicional y restar un intento
                        intentos--;
                        darPista(numRandom);
                        System.out.println("Te quedan: " + intentos + " intentos.");
                    }

                    // Si se quedan sin intentos, terminar el juego
                    if (intentos > 0) {
                        System.out.println("Ingresa otro número:");
                        num = scanner.nextInt();
                    } else {
                        System.out.println("Lo siento, has agotado tus intentos. El número correcto era " + numRandom);
                    }
                }
            }
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }

    // Método para dar pistas sobre el número
    public static void darPista(int numRandom) {
        Random rand = new Random();
        int tipoPista = rand.nextInt(6); // Selecciona aleatoriamente el tipo de pista (0 a 5)

        switch (tipoPista) {
            case 0:
                System.out.println("Pista: El número es " + (numRandom % 2 == 0 ? "par" : "impar"));
                break;
            case 1:
                System.out.println("Pista: El número " + (esPrimo(numRandom) ? "es primo" : "no es primo"));
                break;
            case 2:
                System.out.println("Pista: El número " + (esFibonacci(numRandom) ? "pertenece a la serie de Fibonacci" : "no pertenece a la serie de Fibonacci"));
                break;
            case 3:
                System.out.println("Pista: El número es " + (numRandom % 3 == 0 ? "múltiplo de 3" : "no es múltiplo de 3"));
                break;
            case 4:
                System.out.println("Pista: El número es " + (numRandom % 5 == 0 ? "múltiplo de 5" : "no es múltiplo de 5"));
                break;
            case 5:
                System.out.println("Pista: El número es " + (numRandom % 7 == 0 ? "múltiplo de 7" : "no es múltiplo de 7"));
                break;
        }
    }

    // Método para verificar si el número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Método para verificar si el número pertenece a la serie de Fibonacci
    public static boolean esFibonacci(int num) {
        int a = 0, b = 1;
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == num;
    }
}
