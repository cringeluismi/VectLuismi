import java.util.Scanner;

public class Vect1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v[] = new int[10];

        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+ " ");
        }

    }
}
