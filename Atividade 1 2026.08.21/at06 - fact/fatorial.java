
import java.util.Scanner;

public class fatorial {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int init;

        do {
        System.out.print("Digite um número positivo para fatorializar: ");
        init = input.nextInt();
        } while (init < 0);

        int calc = init;
        while (init > 1) {
            init--;
            calc *= init;
        }

        System.out.println("O resultado foi " + calc + ".");

    }
}
