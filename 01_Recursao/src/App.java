public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("2^3 = " + potencia( + 2, 3));
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
}
