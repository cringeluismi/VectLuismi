import java.util.Scanner;

public class Vect12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v[] = new int[10];

        boolean exit = false;
        System.out.println("- - OPCIONES - -");
        System.out.println("1 - Mostrar valores");
        System.out.println("2 - Introducir valor");
        System.out.println("3 - Salir");
        do {
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    for (int i = 0; i < v.length; i++) {
                        System.out.print("v[" + i + "]=" + v[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Valor a introducir: ");
                    int val = sc.nextInt();
                    System.out.println("Posición a la que asignar: ");
                    int pos = sc.nextInt();
                    v[pos] = val;
                    break;
                case 3:
                    System.out.println("Has elegido salir del programa.");
                    exit = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (exit != true);
    }
}
