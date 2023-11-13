import java.util.Scanner;

public class Vect10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("N Alturas: ");
        double v[] = new double[sc.nextInt()];

        double min=1000.00, max=0.00, sumMed=0;
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextDouble();
            if (min > v[i]) {
                min = v[i];
            }
            if (max < v[i]) {
                max = v[i];
            }
            sumMed = sumMed + v[i];
        }

        double med = sumMed/v.length;
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Med: " + med);


    }
}
