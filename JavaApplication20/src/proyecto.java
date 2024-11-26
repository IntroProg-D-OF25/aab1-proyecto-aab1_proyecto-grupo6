/***
 * Sistema académico de la UTPL
 *La UTPL, le contrata para realizar una aplicación pequeña que permita la gestión 
 * de calificaciones de los estudiantes en una materia.
 *Del Estudiante se registra su: nombre, cédula y la materia a cruzar. (Auto genere estos datos
 *con la función ALEATORIO/RAMDOM)
 *Se debe verificar la aprobación de una materia dadas tres calificaciones: ACD (3.5/10), APE
 *(3.5/10) y AA (3/10). Se aprueba si la sumatoria es de al menos 70%, si cumple con este
 *requisito, se considera que ha aprobado, caso contrario informar al estudiante que deberá rendir
 *un examen de recuperación sobre 3.5/10 pts. agregado al 60% acumulado de los componentes
 *A CD, APE y AA.
 *Ahora, debe implementar los siguientes requisitos en su programa:
 *1. El programa debe permitir al usuario ingresar los datos de un estudiante, incluyendo su
 *nombre y cédula. (Nota: realizarlo por medio de simulación – random/aleatorio en el main())
 *2. El programa debe permitir auto generar simulación de los datos de una materia, incluyendo
 *su nombre y las calificaciones del estudiante en las categorías ACD, APE y AA.
 *3. El programa debe verificar si un estudiante ha aprobado la materia. Para ello, se deben
 *evaluar las calificaciones del estudiante en las tres categorías (ACD, APE y AA).
 *4. Al finalizar, el programa debe mostrar las estadísticas/porcentajes de aprobación y/o
 *reprobación de la materia de un X curso. 
 */
import java.util.Random;
import java.util.Scanner;

public class proyecto {
    public static void main(String[] args) {
        // Scanner y Random
        Scanner tcl;
        Random random;

        // Título y símbolo
        String titulo;
        char simbolo;

        // Materias
        String materia1;
        String materia2;
        String materia3;
        String materia4;
        String materia5;

        // Variables para los estudiantes
        String nombre;
        String cedula;
        float APE, ACD, AA, sumaNotas;
        String materia;

        // Porcentaje 
        int procentaje;

        // Inicialización de variables
        tcl = new Scanner(System.in);
        random = new Random();

        titulo = "Sistema académico para la UTPL";
        simbolo = '=';

        materia1 = "Programación";
        materia2 = "Humanismo";
        materia3 = "Fundamentos Computacionales";
        materia4 = "Matemáticas";
        materia5 = "Estructuras Discretas";

        // Mostrar título
        System.out.println(titulo);
        for (int i = 0; i <= titulo.length(); i++) {
            System.out.print(simbolo);
        }
        System.out.println();

        // Procesar estudiantes
        for (int i = 1; i <= 6; i++) {
            System.out.println("Ingrese el nombre del estudiante " + i + ": ");
            nombre = tcl.nextLine();

            // Generar cédula
            cedula = String.valueOf(1000000000 + random.nextInt(100000000));

            // Generar notas
            APE = random.nextInt(3501) / 1000.0f;
            ACD = random.nextInt(3501) / 1000.0f;
            AA = random.nextInt(3001) / 1000.0f;
            sumaNotas = APE + ACD + AA;
            procentaje = (int)(sumaNotas*100)/10;

            // Elegir materia al azar
            int randomMateria = random.nextInt(5); // Número entre 0 y 4
            if (randomMateria == 0) {
                materia = materia1;
            } else if (randomMateria == 1) {
                materia = materia2;
            } else if (randomMateria == 2) {
                materia = materia3;
            } else if (randomMateria == 3) {
                materia = materia4;
            } else {
                materia = materia5;
            }

            // Mostrar información del estudiante
            System.out.println();
            System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
            System.out.println("Nombre del estudiante: " + nombre);
            System.out.println("Número de cédula: " + cedula);
            System.out.println("Nota en APE: " + APE);
            System.out.println("Nota en ACD: " + ACD);
            System.out.println("Nota en AA: " + AA);
            System.out.println("Nota total: " + sumaNotas);
            System.out.println("Su porcentaje de 100% es: " + procentaje + "%");
            System.out.println(sumaNotas >= 7 ? "¡Aprobó!" : "Reprobó, debe realizar un examen de refuerzo");
            System.out.println("Materia elegida: " + materia);
            System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
            System.out.println();
        }
    }
}
/***
 * run:
Sistema acad�mico para la UTPL
===============================
Ingrese el nombre del estudiante 1: 
valeria

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Nombre del estudiante: valeria
N�mero de c�dula: 1085432466
Nota en APE: 1.598
Nota en ACD: 1.72
Nota en AA: 0.05
Nota total: 3.368
Su porcentaje de 100% es: 33%
Reprob�, debe realizar un examen de refuerzo
Materia elegida: Programaci�n
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Ingrese el nombre del estudiante 2: 
Sebastian

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Nombre del estudiante: Sebastian
N�mero de c�dula: 1048354208
Nota en APE: 2.102
Nota en ACD: 1.232
Nota en AA: 2.341
Nota total: 5.675
Su porcentaje de 100% es: 56%
Reprob�, debe realizar un examen de refuerzo
Materia elegida: Estructuras Discretas
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Ingrese el nombre del estudiante 3: 
Yadira

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Nombre del estudiante: Yadira
N�mero de c�dula: 1043651586
Nota en APE: 1.858
Nota en ACD: 1.685
Nota en AA: 2.108
Nota total: 5.651
Su porcentaje de 100% es: 56%
Reprob�, debe realizar un examen de refuerzo
Materia elegida: Programaci�n
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Ingrese el nombre del estudiante 4: 
Italo

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Nombre del estudiante: Italo
N�mero de c�dula: 1017345813
Nota en APE: 2.785
Nota en ACD: 2.795
Nota en AA: 1.414
Nota total: 6.994
Su porcentaje de 100% es: 69%
Reprob�, debe realizar un examen de refuerzo
Materia elegida: Programaci�n
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Ingrese el nombre del estudiante 5: 
Tania

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Nombre del estudiante: Tania
N�mero de c�dula: 1097831362
Nota en APE: 1.441
Nota en ACD: 0.535
Nota en AA: 0.794
Nota total: 2.77
Su porcentaje de 100% es: 27%
Reprob�, debe realizar un examen de refuerzo
Materia elegida: Matem�ticas
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Ingrese el nombre del estudiante 6: 
Luis

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Nombre del estudiante: Luis
N�mero de c�dula: 1016582765
Nota en APE: 0.931
Nota en ACD: 2.75
Nota en AA: 1.645
Nota total: 5.326
Su porcentaje de 100% es: 53%
Reprob�, debe realizar un examen de refuerzo
Materia elegida: Humanismo
 
 */
