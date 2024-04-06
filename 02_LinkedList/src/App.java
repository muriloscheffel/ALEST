import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        LinkedListOfInteger l1 = new LinkedListOfInteger();
        LinkedListOfInteger l2 = new LinkedListOfInteger();

        for(int i = 0; i < 10; i++) {
            l1.add(r.nextInt(30));
            l2.add(r.nextInt(30));
        }
    }
}
