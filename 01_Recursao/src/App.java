public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("2^3 = " + potencia( + 2, 3));
        // System.out.println("2^3 = " + potenciaRec( + 2, 3));
        int vet1[] = {1, 2, 3, 4, 5, 6};
        int vet2[] = {1, 2, 3};

        // inverteArray(vet1);

        somaVetorRec(vet2);
    }


    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        int resultado = base;
        for(int i = 1; i < expoente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }

    public static int potenciaRec(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potenciaRec(base, expoente - 1);
    }

    public static void inverteArray(int vet[]) {
        inverteArray(vet, 0, vet.length - 1);
    }

    public static void inverteArray(int vet[], int i, int f) {
        if(i < f) {
            int aux = vet[i];
            vet[i] = vet[f];
            inverteArray(vet, i + 1, f - 1);
        }
    }

    //
    // RESOLVER ALGORITMOS
    //
}
