import java.util.*;

public class ListArrayOfInteger{
    private static final int INITIAL_SIZE = 1;
    private Integer[] data;
    private int count;

    public ListArrayOfInteger(){
        data = new Integer[INITIAL_SIZE];
        count = 0;
    }

    public ListArrayOfInteger(int size){
        if(size < 1) {
            throw new IllegalArgumentException("Tamanho inválido");
        }
        data = new Integer[size];
        count = 0;
    }

    private void expandirArray() {
        Integer[] aux = new Integer[data.length + 1];

        for(int i = 0; i < data.length; i++) {
            aux[i] = data[i];
        }
        data = aux;
    }

    private void diminuirArray() {
        Integer[] aux = new Integer[data.length - 1];

        for(int i = 0; i < aux.length; i++) {
            aux[i] = data[i];
        }
        data = aux;
    }

    public void add(int index, Integer element) {
        if(index > count || index < 0) {
            throw new IndexOutOfBoundsException("Index inválido");
        }

        if(index == count) {
            expandirArray();
            data[index] = element;
            count++;
        }

        if(index < count) {

        }
    }

    public void add(Integer element) {
        if(count >= data.length) {
            expandirArray();
        }
        data[count] = element;
        count++;
    }

    public Integer removeByIndex(int index) {
        if(index >= count || index < 0) {
            throw new IndexOutOfBoundsException("Index inválido");
        }

        Integer element = data[index];

        if(index == count - 1) {
            diminuirArray();
            count--;
        }

        if(index < count - 1) {
            for(int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }

            diminuirArray();
            count--;
        }
        return element;
    }

    public boolean remove(Integer element) {
        for(int i = 0; i < data.length; i++) {
            if(element.equals(data[i])) {
                for(int j = i; j < count - 1; j++) {
                    data[j] = data[j + 1];
                }
                data[count - 1] = null;
                diminuirArray();
                count--;
                return true;
            }
        }
        return false;
    }

    public int get(int index) {
        if(index > count || index < 0) {
            throw new IndexOutOfBoundsException("Index inválido");
        }
        return data[index];
    }

    public int size() {
        return count;
    }

    public void clear() {
        Integer[] aux = new Integer[INITIAL_SIZE];
        data = aux;
        count = 0;
    }

    public boolean contains(Integer element) {
        for(int i = 0; i < data.length; i++) {
            if(data[i].equals(element)) {
                return true;
            }
        }

        return false;
    }

    public boolean containsRecursivo(Integer element) {
        return containsRecursivoAux(element, 0);
    }

    private boolean containsRecursivoAux(Integer element, int i) {
        if(i == count) {
            return false;
        }
        if(data[i].equals(element)) {
            return true;
        }

        return containsRecursivoAux(element, i + 1);
    }

    public boolean isEmpty() {
        if(count != 0) {
            return false;
        }
        return true;
    }

    public int indexOf(Integer element) {
        for(int i = 0; i < data.length; i++) {
            if(data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public Integer set(int index, Integer element) {
        if(index > count || index < 0) {
            throw new IndexOutOfBoundsException("Index inválido");
        }

        Integer aux = data[index];
        data[index] = element;
        return aux;
    }

    public void ensureCapacity(int minCapacity) {
        if(minCapacity > data.length) {
            Integer[] aux = new Integer[minCapacity];

            for(int i = 0; i < count; i++) {
                aux[i] = data[i];
            }
            data = aux;
        }
    }

    public void iterator() {
        int cont = 0;
        for(Integer i : data) {
            System.out.println("Index: " + cont + " Integer: " + i);
            cont++;
        }
    }

    public Integer[] subList(int fromIndex, int toIndex) {
        if(fromIndex < 0 || toIndex > count) {
            throw new IndexOutOfBoundsException("Index inválido");
        }
        if(fromIndex > toIndex) {
            throw new IndexOutOfBoundsException("Index inválido");
        }

        Integer[] aux = new Integer[toIndex - fromIndex];
        int cont = 0;

        for(int i = fromIndex; i < toIndex; i++) {
            aux[cont] = data[i];
            cont++;
        }
        return aux;
    }

    public void revese() {
        Integer[] aux = new Integer[data.length];
    }

    public int countOccurrences(Integer element) {
        int cont = 0;

        for(int i = 0; i < data.length; i++) {
            if(data[i].equals(element)) {
                cont ++;
            }
        }

        return cont;
    }

    public void addIncreasingOrder(Integer element) {

    }

    public void unique() {

    }

    @Override
    public String toString() {
        return "ListArrayOfInteger [Array=" + Arrays.toString(data) + "]";
    }
} 