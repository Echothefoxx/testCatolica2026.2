import java.util.Scanner;

public class irpf {

    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double desc;

        System.out.print("Insira seu salário bruto: R$");
        double sal = input.nextDouble();

        if (sal >= 4664.68) {
            desc = 0.275 * sal;
        } else if (sal >= 3751.06) {
            desc = 0.225 * sal;
        } else if (sal >= 2826.66) {
            desc = 0.15 * sal;
        } else if (sal > 2428.80) {
            desc = 0.075 * sal;
        } else {
            desc = 0;
        }

        System.out.println("Foi descontado R$" + desc + " do seu salário para o Imposto de Renda. Seu salário líquido é R$" + (sal - desc));
    }
}
