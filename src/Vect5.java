import java.util.Scanner;

public class Vect5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v[] = new int[20];

        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextInt();
        }

        double sum=0, media;

        for (int i = 0; i < v.length; i++) {
            sum = sum + v[i];
        }

        media = sum/v.length;

        System.out.println(media);

    }
}
