public class troca {
    public static void main(String[] args) {
        int[] fibonnacci = new int[20];
        int[] primos = new int[20];

        primo(primos, primos.length);
        System.out.println(primos);
    }
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
    for (int i = 0; i < lim; i++) {
        if (alvo % i == 0) {
            return false;
        }
    }
    return true;
}

public static void primo(int[] vetor, int tamanho) {
    int i = 0;
    boolean f = false;
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

