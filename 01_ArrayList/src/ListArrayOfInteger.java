import java.util.*;

public class ListArrayOfInteger{
    private int[] data;
    private int count;

    public ListArrayOfInteger(){
        data = new int[10];
        count = 0;
    }

    public ListArrayOfInteger(int size){
        data = new int[size];
        count = 0;
    }

    public void add(int i) {
        if(count < data.length) {
            expandirArray();
        }
        data[count] = i;
        count++;
    }

    public void expandirArray() {

    }

    public void remove(int index) {
        
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return count;
    }

    public void clear() {

    }

    public boolean contains() {

    }

    public boolean isEmpty() {
        
    }

    @Override
    public String toString() {
        return "ListArrayOfInteger [Array=" + Arrays.toString(data) + "]";
    }
} 