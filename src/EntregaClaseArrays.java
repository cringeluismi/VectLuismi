import java.lang.Math;
import java.util.Arrays;

public class EntregaClaseArrays {
    public static void main(String[] args) {

        // Apartado A

        int vectA[] = new int[10];

        for (int i = 0; i < vectA.length; i++) {
            vectA[i] = (int)(Math.random()*(30+1));
        }
        for (int i = 0; i < vectA.length; i++) {
            System.out.print(vectA[i] + " ");
        }

        // Apartado B

        int sumaB = 0;
        for (int i = 0; i < vectA.length; i++) {
            sumaB += vectA[i];
        }
        int medianaB = sumaB/vectA.length;
        System.out.println("\nSuma: " + sumaB + " | Mediana: " + medianaB);

        // Apartado C

        Arrays.sort(vectA);
        for (int i = 0; i < vectA.length; i++) {
            System.out.print(vectA[i] + " ");
        }

        // Apartado D

        int max = -1,min = 31;
        for (int i = 0; i < vectA.length; i++) {
            if (vectA[i] > max) {
                max = vectA[i];
            }
            if (vectA[i] < min) {
                min = vectA[i];
            }
        }
        System.out.print("\nMax: " + max + " | Min: " + min);

        // Apartado E

        int vectE[] = new int[10];
        Arrays.fill(vectE,-10);
        System.out.println("\nvectE: ");
        for (int i = 0; i < vectE.length; i++) {
            System.out.print(vectE[i] + " ");
        }

        // Apartado F

        int vectF[] = new int[vectE.length];
        System.arraycopy(vectE,0,vectF,0, vectE.length);
        System.out.println("\nvectF: ");
        for (int i = 0; i < vectF.length; i++) {
            System.out.print(vectF[i] + " ");
        }

        // Apartado G

        Arrays.fill(vectF,4,9,3);
        System.out.println("\nvectF (valor 3 de la posición 5 a la 9): ");
        for (int i = 0; i < vectF.length; i++) {
            System.out.print(vectF[i] + " ");
        }

        // Apartado H

        int vectH[] = new int[vectA.length];
        for (int i = 0; i < vectH.length; i++) {
            vectH[i] = vectA[i] * vectF[i];
        }
        System.out.println("\nVectH: ");
        for (int i = 0; i < vectH.length; i++) {
            System.out.print(vectH[i] + " ");
        }

        // Apartado I

        Arrays.sort(vectH);
        System.out.println("\nvectH(Ordenado):");
        for (int i = 0; i < vectH.length; i++) {
            System.out.print(vectH[i] + " ");
        }

    }
}
