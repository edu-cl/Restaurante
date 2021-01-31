package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Ejercicio1();
    }

    public static void Ejercicio1() {
        int f;
        int c;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las filas de la matriz");
        f = teclado.nextInt();
        System.out.println("Introduce las columnas de la matriz");
        c = teclado.nextInt();

        int[][] matriz = new int[f][c];
        carga(matriz);      
        SacarMayor(matriz);
    }

    public static void SacarMayor(int[][] m) {
        int fila = 0;
        int max = 0;
        int columna = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > max) {
                    max = m[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.println("El numero mayor de la matriz es: " + max + "\n En la fia " + fila + "\n En la columna " + columna);
    }

    public static void carga(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = leeEntero();
            }
        }
    }

    public static int leeEntero() {
        int result = -1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero");
        result = teclado.nextInt();
        return result;
    }

}
