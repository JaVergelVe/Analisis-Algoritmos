package numero_perfecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Numero_perfecto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese un numero: ");
        int numero = sc.nextInt();

        ArrayList<Integer> lista = new ArrayList<>();

        long starTime = System.nanoTime();

        for (int i = numero; i > 0; i--) {
            if ((numero % i) == 0) {
                lista.add(i);
            }
        }

        lista.remove(0);

        int sumador = 0;
        for (int i = 0; i < lista.size(); i++) {
            sumador = sumador + lista.get(i);
        }

        long endTime = System.nanoTime() - starTime;

        if (sumador == numero) {
            System.out.println("Es un numero perfecto");
        } else {
            System.out.println("No es un numero perfecto");
        }

        System.out.println("timepo de ejecucion(nanosegundos): " + endTime);
    }

}
