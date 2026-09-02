import java.util.Random;

public class ex3 {
    public static final int SIZE = 20;
    public static Random rng = new Random();
    public static void main(String[] args) {
        double[] lista = new double[SIZE];
        preencherLista(lista, rng);
        printLista(lista);
    }

    public static void preencherLista(double[] lista, Random numberGen) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = rng.nextDouble();
        }
    }
    public static void printLista(double[] lista) {
        System.out.printf("{ %5.2f", lista[0]);
        if (lista.length > 1) {
            for (int i = 1; i < lista.length; i++) {
                System.out.printf(" - %5.2f", lista[i]);
            }
        }
        System.out.printf(" }");
    }

    public static void inserirOrdenado(double[] vetor, int limite, double alvo) {
        int i = limite-1;
        while (i >= 0 && alvo < vetor[i]) {
            vetor[i+1] = vetor[i];
            i--;
        }
        vetor[i] = limite;
    }
}