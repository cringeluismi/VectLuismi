import java.lang.Math;
import java.util.Scanner;

public class Vect9 {
    public static void main(String[] args) {

        int v[] = new int [100];

        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(1 + Math.random() * 10);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Valor a comprobar: ");
        int userInput = sc.nextInt();

        int contInput = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == userInput) {
                contInput++;
            }
        }

        System.out.println("El valor " + userInput + " se repite " + contInput + " veces");

    }
}
