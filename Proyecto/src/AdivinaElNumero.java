import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        // Inicializamos el generador de números aleatorios y el scanner
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        // El número aleatorio que el jugador debe adivinar, entre 1 y 100
        int numeroSecreto = random.nextInt(100) + 1;
        
        // Puntos iniciales
        int puntos = 5;
        
        // Mensaje de inicio
        System.out.println("¡Bienvenido al Adivina el numero !");
        System.out.println("Tienes " + puntos + " puntos. Trata de adivinar el número entre 1 y 100.");
        
        while (puntos > 0) {
            // Pedimos al jugador que ingrese un número
            System.out.print("Introduce tu numero: ");
            int intento = scanner.nextInt();
            
            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número.");
                System.out.println("Tu puntuación final es: " + puntos);
                break;
            } else {
                // Restamos un punto
                puntos--;
                System.out.println("¡Incorrecto! Te quedan " + puntos + " puntos.");
                
                // Dar pista matemática dependiendo de la respuesta
                if (intento < numeroSecreto) {
                    System.out.println("Pista: El número secreto es mayor que " + intento + ".");
                } else if (intento > numeroSecreto) {
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
            }
            
            // Si se quedan sin puntos
            if (puntos == 0) {
                System.out.println("Te has quedado sin puntos. El número secreto era " + numeroSecreto + ".");
                System.out.println("¡Mejor suerte la próxima vez!");
            }
        }

        // Cerramos el scanner
        scanner.close();
    }
}
