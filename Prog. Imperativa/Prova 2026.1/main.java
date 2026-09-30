public class main {
    public static void main(String[] args) {
        //Eu tentei

    }

    public static int intersecao(int[] a, int tamA, int[] b, int tamB, int[] intersec) {
        int count = 0;
        for (int i = 0; i < tamA; i++) {
            for (int j = 0; j < tamB; j++) {
                if (a[i] == b[j]) {
                    intersec[count] = a[i];
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void ordenar(int[] v, int n) {
        //Bubble :3 Bolhas são legais.
        bool work = true;
        int storage;
        int i = 1;
        int lim = v.length;
        while (work) {
            work = false;
            if (v[i] < v[i-1]) {
                storage = v[i];
                v[i] = v[i-1];
                v[i-1] = storage;
                work = true;
                lim--;
            }
            i++;
            if (i >= lim) {
                i = 1;
            }
        }
    }

    public static int gerarVetorPares(int[] v, int tamV, int[] vPares) {
        int count = 0;
        for (int i = 0; i < tamV; i++) {
            if (v[i] % 2 == 0) {
                vPares[count] = v[i];
                count++;
            }
        }
        return count;
    }

    public static void inverterTrechos(int[] v, int tam) {
        int storage;
        int last = 0;
        for (int i = 0; i < tam; i++) {
            if (v[i] == 0) {
                for (int j = last; j < i - 1; j++) {
                    storage = v[j];
                    v[j] = v[j+1];
                }
                last = v[i];
            }
            /* codigo ERRADO
            storage = v[i];
            v[i] = v[lim-i];
            v[lim-i] = storage;
            */
        }
    }
}
