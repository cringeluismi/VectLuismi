import java.util.Scanner;

public class ExerStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String parts[] = text.split(" ");
        for (int i = 0; i < parts.length; i++) {
            System.out.print("v["+ i + "]=" + parts[i] + " ");
        }

    }
}
