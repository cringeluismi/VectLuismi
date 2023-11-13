import java.util.Scanner;

public class Vect3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v[] = new int[10];

        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }

        int min= v[0],max= v[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
            if (v[i] < min) {
                min = v[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
