import java.util.Scanner;

public class Vect7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Primer valor introducido mayor que el segundo");
        int p = sc.nextInt();
        int q = sc.nextInt();

        int v[] = new int [p-q];

        for (int i = 0; i < v.length; i++) {
            v[i] = q;
            q++;
        }

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " ");
        }

    }
}
