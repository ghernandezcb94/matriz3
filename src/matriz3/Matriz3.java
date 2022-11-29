package matriz3;

import java.util.Scanner;

public class Matriz3 {
    public static void main(String[] args) {
        int n, x = 1, i, j, k;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Dime el tamaño de la matriz: ");
        n = teclado.nextInt();

        if (n < 2) { 
            System.out.println("La matriz debe ser de al menos 2x2!");
        } else {
            int[][] matriz = new int[n][n];
            //primero llenamos la matriz
            for (i = 0; i < n; i++) //primera fila
                matriz[0][i] = x++;
            for (k = 1; k < matriz.length - 1; k++) //ultima columna 
                matriz[k][n - 1] = x++;
            for (j = n - 1; j >= 0; j--) //ultima fila
                matriz[n - 1][j] = x++;
            for (k = n - 2; k > 0; k--) //primera columna
                matriz[k][0] = x++;

            //imprimimos la matriz llena
            for (k = 0; k < matriz.length; k++){
                for (i = 0; i < matriz.length; i++){
                    System.out.print("\t" + matriz[k][i]);
                }
                System.out.println("");
            }
       
        }
    }
}
