import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escreva o primeiro número (inteiro): ");
        int num1 = input.nextInt();
        System.out.print("Escreva o segundo número (inteiro): ");
        int num2 = input.nextInt();

        System.out.println("Soma: " + (num1+num2));
        System.out.println("Subtração: " + (num1-num2));
        System.out.println("Multiplicação: " + (num1*num2));
        if (num2 != 0) {
            System.out.println("Divisão: " + (num1/num2));
        } else {
            System.out.println("Divisão: Valor Nulo");
        }
        
        input.close();
    }
}