import java.util.Scanner;

public class Vect13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Valor: ");
        int val = sc.nextInt();
        System.out.print("Números de valores a crear: ");
        int num = sc.nextInt();
        System.out.print("Incremento: ");
        int inc = sc.nextInt();

        int v[] = new int[num];

        v[0] = val;
        for (int i = 1; i < v.length; i++) {
            v[i] = v[i-1] + inc;
        }

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

    }
}
