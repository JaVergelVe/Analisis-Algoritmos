package creacion_matrices;

import java.util.Scanner;

public class Creacion_matrices {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int talla = input.nextInt();
        
        int[][] matriz = new int[talla][talla];
        
        long starTime;
        long endTime;
        
        for (int n = 0; n < 7; n++) {
            starTime = System.nanoTime();

            for (int i = 0; i < talla; i++) {
                for (int j = 0; j < talla; j++) {
                    matriz[i][j] = (int) (Math.random() * 10);
                }
            }

            endTime = System.nanoTime() - starTime;

            System.out.println(endTime);
        }

    }

}
