import java.util.Scanner;

public class IMC {

    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Insira seu peso em quilogramas: ");
        double peso = input.nextDouble();
        System.out.print("Insira sua altura em metros: ");
        double altura = input.nextDouble();

        double imc = peso * (altura * altura);

        System.out.printf("Seu IMC é %.2f. Sua classificação é ", imc);
        
        if (imc < 18.5) {
            System.out.print("Abaixo do peso");
        } else if (imc <= 24.5) {
            System.out.print("Peso ideal");
        } else if (imc < 30) {
            System.out.print("Sobrepeso");
        } else if (imc < 35) {
            System.out.print("Obesidade (Grau I)");
        } else if (imc < 40) {
            System.out.print("Obesidade (Grau II)");
        } else {
            System.out.print("Obesidade (Grau III)");
        }
    }
}
