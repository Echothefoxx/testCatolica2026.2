import java.util.ArrayList;
import java.util.Scanner;

public class sample1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String name = input.nextLine();
        System.out.println("Olá, " + name + "!");

        System.out.println("-----");

        System.out.print("De onde começar? ");
        int init = input.nextInt();
        System.out.print("Onde acabo?");
        int end = input.nextInt();

        for (int i = init; i <= end; i++) {
            if (i % 2 == 0) {
                if (i != 20) {
                    System.out.print(i + ", ");
                } else {
                    System.out.println(i + ".");
                }
            }
        }
        System.out.println("-----");
        System.out.print("Quer imprimir quantas estrelas? ");
        int x = input.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = x-1; 0 < i; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}