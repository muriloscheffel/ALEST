public class Algoritmos {
    
    // Algoritmo 1
    public int f1(int n) {
        int i, j, k, res = 0;
        int cont_op = 0;

        for (i = 1; i <= n * n; i += 1) {
            for (j = 1; j <= i; j += 2) {
                for (k = n + 1; k <= 2 * i; k += i * j) {
                    res = res + k + 1;
                    cont_op++;
                }
            }
        }
        return cont_op;
    }

    // Algoritmo 2
    public int f( int n ) {
        int i, j, k, res = 0;
        int cont_op = 0;

        for( i = n; i <= n; i += i/2+1 ) {
            for( j = i/2; j <= i*i; j += i+1 ) {
                for( k = n; k <= 2*n; k += i+1 ) {       
                    res = res + n;
                    cont_op++;
                }
            }
        }
        return cont_op;
    }
}