import java.util.Scanner;

public class ex1 {

    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetor = new int[10];
        int vTAtual = vetor.length;

        for (int i = 0; i < vetor.length; i++) {
            do {
                System.out.printf("Insira o %dº número positivo: ", i+1);
                vetor[i] = input.nextInt();
            } while (vetor[i] < 0);
        }
            System.out.println("Buscando o número 10:");
            System.out.println(buscaSequencial(vetor, vTAtual, 10));
            System.out.println("Removendo o 10 da sequência:");

            vTAtual = removerDoArray(vetor, vTAtual, 10);

            System.out.println(vTAtual);
            System.out.println("Imprimindo o array: ");
            for (int i = 0; i < vTAtual; i++) {
                System.out.println(vetor[i]);
            }

    }

    public static int buscaSequencial(int[] v, int escopo, int alvo) {
        for (int i = 0; i < escopo; i++) {
            if (v[i] == alvo) {
                return i;
            }
        }
        return -1;
    }
    public static int removerDoArray(int[] v, int n, int alvo) {
        int pos = buscaSequencial(v, n, alvo);
        if (pos != -1) {
            for (int i = pos; i < n-1; i++) {
                v[i] = v[i+1];
            }
            return n - 1;
        }
        return -1;
    }
}