import java.util.Scanner;

public class Vect4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v[] = new int[20];

        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }

        int sumPos=0, sumNeg=0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] > 0) {
                sumPos = sumPos + v[i];
            }
            if (v[i] < 0) {
                sumNeg = sumNeg + v[i];
            }
        }

        System.out.println("Suma numPos: " + sumPos);
        System.out.println("Suma numNeg: " + sumNeg);

    }
}
