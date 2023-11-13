import java.lang.Math;

public class Entrega4Vect {
    public static void main(String[] args) {

        int vect1[] = new int[20];
        int vect2[] = new int[20];
        int vect3[] = new int[40];
        int vect4[] = new int[40];

        // Cálculo vect1

        for (int i = 0; i < vect1.length; i++) {
            vect1[i] = (int)(1+Math.random()*20);
        }

        // Cálculo vect2

        int j = vect2.length-1;
        for (int i = 0; i < vect2.length; i++) {
            vect2[i] = vect1[j];
            j--;
        }

        // Cáculo vect3

        for (int i = 0; i < vect1.length; i++) {
            vect3[i] = vect1[i];
        }
        int w=0;
        for (int i = 20; i < vect3.length; i++) {
            vect3[i] = vect2[w];
            w++;
        }

        // Cálculo vect4

        int y = 0;
        for (int i = 0; i < vect1.length; i++) {
            vect4[y] = vect1[i];
            y+=2;
        }

        int z = 1;
        for (int i = 0; i < vect2.length; i++) {
            vect4[z] = vect2[i];
            z+=2;
        }

        // Print de todos los vectores

        System.out.println("vect1");
        for (int i = 0; i < vect1.length; i++) {
            System.out.print(vect1[i] + " ");
        }

        System.out.println("\nvect2 (copia inversa) ");
        for (int i = 0; i < vect2.length; i++) {
            System.out.print(vect2[i] + " ");
        }

        System.out.println("\nvect3 (mitad vect1 + mitad vect2)");
        for (int i = 0; i < vect3.length; i++) {
            System.out.print(vect3[i] + " ");
        }

        System.out.println("\nvect4 (vect1 y vect2 alternativamente)");
        for (int i = 0; i < vect4.length; i++) {
            System.out.print(vect4[i] + " ");
        }

    }
}
