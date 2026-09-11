public class troca {
    public static void main(String[] args) {
        int[] fibonnacci = new int[20];
        int[] primos = new int[20];
        int[] fim = new int[20];

        primo(primos, primos.length);
        fibonnacci(fibonnacci, fibonnacci.length);
        somarVetores(fibonnacci, primos, fim, 20);
        printVetor(fim);
        int maior = maiorNumero(fim);
        System.out.println("Maior número do vetor: " + maior);
        int[] arrayNumero = new int[10];
        numeroEmVetor(arrayNumero, maior);
        printVetor(arrayNumero);
    }

    public static void fibonnacci(int[] vetor, int tamanho) {
        if (tamanho > 0) {
            vetor[0] = 0;
            if (tamanho > 1){
            vetor[1] = 1;

            for (int i = 2; i < tamanho; i++) {
                vetor[i] = vetor[i-1] + vetor[i-2];
            }
            }
        }
    }

    public static boolean acharPrimo(int[] vetor, int alvo) {
        for (int i = 2; i < alvo; i++) {
            if (alvo % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primo(int[] vetor, int tamanho) {
        int i = 0;
        int x = 2;

        while (i < tamanho) {
            while (!acharPrimo(vetor, x)) {
                x++;
            }
            vetor[i] = x;
            i++;
            x++;
        }
    }
    public static void somarVetores(int[] vetorA, int[] vetorB, int[] vetorS, int limite) {
        for (int i = 0; i < limite; i++) {
            vetorS[i] = vetorA[i] + vetorB[(limite - 1) - i];
        }
    }
    
    public static void printVetor(int[] vetor) {
        System.out.print(vetor[0]);
        for (int i = 1; i < vetor.length; i++) {
            System.out.printf(", %d", vetor[i]);
        }
        System.out.println();
    }
    public static int maiorNumero(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }
    public static void numeroEmVetor(int[] vetorAlvo, int alvo) {
        for (int i = 9; i >= 0; i--) {
            if (alvo > 0) {
                vetorAlvo[i] = alvo % 10;
                alvo /= 10;
            } else {
                vetorAlvo[i] = 0;
            }
        }
    }
}
