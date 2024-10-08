
package numero.pkg20;

import java.util.Scanner;


public class Numero20 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int sumaPares = 0;
        int sumaImpares = 0; 
        int sumaPosPares = 0;
        int sumaPosImpares = 0;
        int countPares = 0;
        int countImpares = 0;

        
        System.out.println("Ingrese 20 números enteros:");
        for (int i = 0; i < 20; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
                countPares++;
            } else {
                sumaImpares += numeros[i];
                countImpares++;
            }
            if (i % 2 == 0) {
                sumaPosImpares += numeros[i]; 
            } else {
                sumaPosPares += numeros[i]; 
            }
        }

        // Calcular promedios
        double promedioPares = (countPares > 0) ? (double) sumaPares / countPares : 0;
        double promedioImpares = (countImpares > 0) ? (double) sumaImpares / countImpares : 0;

        // Mostrar resultados
        System.out.println("Promedio de los números pares: " + promedioPares);
        System.out.println("Promedio de los números impares: " + promedioImpares);
        System.out.println("Suma de los elementos en posiciones pares: " + sumaPosPares);
        System.out.println("Suma de los elementos en posiciones impares: " + sumaPosImpares);
    }
}