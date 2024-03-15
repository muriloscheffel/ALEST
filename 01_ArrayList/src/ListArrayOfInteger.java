import java.util.*;

public class ListArrayOfInteger{
    private int[] data;
    private int count;

    public ListArrayOfInteger(){
        data = new int[1];
        count = 0;
    }

    public ListArrayOfInteger(int size){
        data = new int[size];
        count = 0;
    }

    public void add(int index, int i) {
        if(index > count) {
            throw new IllegalArgumentException("Index inválido");
        }

        int[] aux = new int[data.length + 1];

        for(int j = 0; j < aux.length; j++) {
            if (j == index) {
               aux[index] = i; 
            } else {
                if(j > index) {
                    aux[j] = data[j - 1];
                }
                else {
                    aux[j] = data[j];
                }
            }
        }
        data = aux;
        count++;
    }

    public void add(int i) {
        if(count == data.length) {
            expandirArray(data.length + 1);
        }
        data[count] = i;
        count++;
    }

    public void expandirArray(int tam) {
        int[] aux = new int[tam];

        for(int j = 0; j < data.length; j++) {
            aux[j] = data[j];
        }
        data = aux;
    }

    public void remove(int index) {
        if(index >= count || index < 0) {
            throw new IllegalArgumentException("Index inválido");
        }

        if(index == count - 1) {
            diminuirArray();
        }

        if(index < count - 1) {
            int[] aux = new int[data.length];

            for(int i = 0; i < data.length; i++) {
                aux[i] = data[i];
            }

            for(int i = index; i < data.length - 1; i++) {
                aux[i] = data[i + 1];
            }
            data = aux;
            diminuirArray();
        }
    }

    public void diminuirArray() {
        int[] aux = new int[data.length - 1];

            for(int i = 0; i < aux.length; i++) {
                aux[i] = data[i];
            }

            data = aux;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return count;
    }

    public void clear() {
        int[] aux = new int[0];
        data = aux;
    }

    public boolean contains(int j) {
        for(int i = 0; i < data.length; i++) {
            if (data[i] ==  j) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        if (count != 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ListArrayOfInteger [Array=" + Arrays.toString(data) + "]";
    }
} 