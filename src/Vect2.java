import java.util.Scanner;

public class Vect2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v[] = new int[10];

        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }

        int sum=0;
        for (int i = 0; i < v.length; i++) {
            sum = sum + v[i];
        }

        System.out.println(sum);

    }
}
