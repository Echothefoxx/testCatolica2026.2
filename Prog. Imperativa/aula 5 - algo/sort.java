import java.util.Random;

public class sort {
    public static void main(String[] args) {
        double[] v = new double[10];

        preencherLista(v, RNG);
        printLista(v);
        insertionSort(v, v.length);
        printLista(v);
    }

    public static final Random RNG = new Random(7);

    public static void insertionSort(double[] vetor, int n) {
        double chave;
        for (int i = 1; i <= n - 1; i++) {
            chave = vetor[i];
            int j = i - 1;
            while (vetor[j] > chave && j > 0) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = chave;
        }
    }
    public static void selectionSort(double[] vetor, int limite) {
        int menor;
        double store;
        for (int i = 0; i < limite; i += 1) {
            menor = i;
            for (int j = i + 1; j <= limite - 1; j++) {
                if (vetor[j] < vetor[menor]) {
                    //TERMINAR DE FAZER
                }
            }
        }
    }
    public static void preencherLista(double[] lista, Random numberGen) {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = numberGen.nextDouble();
        }
    }

    public static void printLista(double[] lista) {
        System.out.printf("{ %5.2f", lista[0]);
        if (lista.length > 1) {
            for (int i = 1; i < lista.length; i++) {
                System.out.printf(" - %5.2f", lista[i]);
            }
        }
        System.out.println();
    }
}
