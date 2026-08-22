
import java.util.Scanner;

public class inss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double desc;

        System.out.print("Insira seu salário bruto: R$");
        double sal = input.nextDouble();

        if (sal > 8475.55) {
            desc = 988.09; // desconto máximo já calculado
        } else if (sal >= 4354.28) {
            desc = 0.14 * sal;
        } else if (sal >= 2902.85) {
            desc = 0.12 * sal;
        } else if (sal > 1621) {
            desc = 0.09 * sal;
        } else {
            desc = 0;
        }

        System.out.println("Foi descontado R$" + desc + " do seu salário. Seu salário líquido é R$" + (sal - desc));
        input.close();
    }
}
