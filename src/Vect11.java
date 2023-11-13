public class Vect11 {
    public static void main(String[] args) {

        int vect1[] = new int[100];
        int vect2[] = new int[100];

        System.out.println("vect1");
        for (int i = 0; i < vect1.length; i++) {
            vect1[i] = i+1;
            System.out.print(vect1[i] + " ");
        }

        System.out.println("\nvect2");

        for (int i = 0; i < vect2.length; i++) {
            vect2[i] = vect2.length - i;
            System.out.print(vect2[i] + " ");
        }

    }
}