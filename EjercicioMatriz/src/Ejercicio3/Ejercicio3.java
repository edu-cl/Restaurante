package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Ejercicio3();
    }

    public static void Ejercicio3() {
        int fila;
        int columna = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las filas de tu matriz");
        fila = teclado.nextInt();

        int[][] matriz = new int[fila][];

        //Recorre las filas para asignarle columnas a cada fila
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Introduce la cantidad de columna para la fila " + i);
            columna = teclado.nextInt();
            matriz[i] = new int[columna];
        }
        Cargar(matriz);
        imprimir(matriz);

    }

    public static int leeEntero() {
        int result = -1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero :");
        result = teclado.nextInt();
        return result;
    }

    public static void Cargar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = leeEntero();
            }
        }
    }

    public static void imprimir(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
