public class App {
    public static void main(String[] args) throws Exception {
        LinkedListOfInteger lista = new LinkedListOfInteger();
        LinkedListOfInteger l1 = new LinkedListOfInteger();
        LinkedListOfInteger l2 = new LinkedListOfInteger();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(10);
       
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(10);

        l1.add(2, 22);

        System.out.println(l1);
      
    }
}
