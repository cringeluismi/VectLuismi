public class EntregaClaseString {
    public static void main(String[] args) {


        System.out.println("1 - valueOf(valor)");

        int integer = 33;
        String.valueOf(integer); // Conversión int -> String
        String alo = "Alonso" + integer; // Concatenación
        System.out.println(alo);

        System.out.println("\n2 - length()");
        System.out.println("Largo de alo: " + alo.length());

        System.out.println("\n3 - charAt(i)");
        System.out.println("Posición 7 de alo: " + alo.charAt(7));

        System.out.println("\n4 - equals(cadena)");
        String alo2 = "Alonso33";
        System.out.println(alo.equals(alo2));

        // NO FUNCIONA
        System.out.println("\n5 - equalsIgnoreCase(String cadena)");
        System.out.println(alo.equals(alo2));

        System.out.println("\n6 - substring(ini, fin)");
        String subalo = alo.substring(1,6);
        System.out.println(subalo);

        System.out.println("\n7 - indexOf(cadena)");
        System.out.println(alo.indexOf(subalo));

        System.out.println("\n8 - lastIndexOf(cadena)");
        System.out.println(alo.lastIndexOf("3"));

        System.out.println("\n9 - startsWith(cadena)");
        String alostart = alo.substring(0,6);
        System.out.println(alo.startsWith(alostart));

        System.out.println("\n10 - endsWith(cadena)");
        System.out.println(alo.endsWith(alostart));

        // NO FUNCIONA
        System.out.println("\n11 - replace(cadena1, cadena2)");
        String cadena1 = "Hola";
        String cadena2 = "Adiós";
        cadena1.replace(cadena1,cadena2);
        System.out.println(cadena1);

        System.out.println("\n12 - toUpperCase()");
        System.out.println(alo.toUpperCase());

        System.out.println("\n13 - toLowerCase()");
        System.out.println(alo.toLowerCase());

        System.out.println("\n14 - toCharArray()");
        char alovec[] = alo.toCharArray();
        for (int i = 0; i < alo.length(); i++) {
            System.out.print(alovec[i] + " ");
        }

        System.out.println("\n\n15 - split(expresión)");
        String frase = "Esto es un ejemplo";
        String frasesplit[] = frase.split(" ");
        System.out.println(frasesplit[1]);

    }
}
