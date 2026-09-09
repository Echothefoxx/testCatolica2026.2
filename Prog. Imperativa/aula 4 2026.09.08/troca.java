public class troca {
    public static void main(String[] args) {
        int[] fibonnacci = new int[20];
        int[] primos = new int[20];

        primo(primos, primos.length);
        System.out.println(primos);
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

    public static boolean acharPrimo(int[] vetor, int alvo, int lim) {
        for (int i = 1; i < lim; i++) {
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
            while (!acharPrimo(vetor, x, i)) {
                x++;
            }
            vetor[i] = x;
            x = vetor[i];
            i++;
        }
    }
    public static void somarVetores(int[] vetorA, int[] vetorB, int[] vetorS, int limite) {
        for (int i = 0; i < limite; i++) {
            vetorS[i] = vetorA[i] + vetorB[limite - i];
        }
    }
    
    public static void printVetor(int[] vetor) {
        System.out.print(vetor[0]);
        for (int i = 1; i < vetor.length; i++) {
            System.out.printf(", %d", vetor[i]);
        }
    }
    public static void printMaior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println(maior);
    }
    public static void numeroEmVetor(int[i] vetor, int alvo) {
        String[] parts = String.valueOf(alvo).split();
        for (int i = 10; i < parts.length; i--) {
            //CONTINUAR DP
        }
    }
}

