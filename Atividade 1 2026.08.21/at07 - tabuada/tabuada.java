
import java.util.Scanner;

public class tabuada {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Insita um número para criar uma tabuada: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
