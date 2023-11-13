import java.util.Scanner;

public class Vect6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int v[] = new int[n];

        for (int i = 0; i < v.length; i++) {
            v[i] = m;
        }

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }


    }
}
