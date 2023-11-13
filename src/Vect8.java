import java.lang.Math;
import java.util.Scanner;

public class Vect8 {
    public static void main(String[] args) {

        double v[] = new double[100];

        for (int i = 0; i < v.length; i++) {
            v[i] = Math.random();
        }

        Scanner sc = new Scanner(System.in);
        double userInput = sc.nextDouble();

        int contIgual=0, contMayor=0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == userInput) {
                contIgual++;
            }
            if (v[i] < userInput) {
                contMayor++;
            }
        }

        System.out.println("Iguales a " + userInput + ": " + contIgual);
        System.out.println("Mayores a " + userInput + ": " + contMayor);

    }
}