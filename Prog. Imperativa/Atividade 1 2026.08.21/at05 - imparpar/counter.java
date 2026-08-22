
import java.util.Scanner;

public class counter {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o número inicial: ");
        int init = input.nextInt();
        System.out.print("Digite o número final: ");
        int end = input.nextInt();

        for (int i = init; i < end; i++) {
            if (i % 2 == 0) {
                if (i == init || i == init+1) {
                    System.out.print(i);
                } else {
                    System.out.print(", " + i);
                }
            }
        }
        System.out.println();
        System.out.println("---");
        for (int i = init; i < end; i++) {
            if (i % 2 == 1) {
                if (i == init || i == init+1) {
                    System.out.print(i);
                } else {
                    System.out.print(", " + i);
                }
            }
        }
    }
}
