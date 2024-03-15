public class App {
    public static void main(String[] args) throws Exception {
        ListArrayOfInteger lista = new ListArrayOfInteger();

        lista.add(5);
        lista.add(8);
        lista.add(10);

        lista.add(0, 10);

        System.out.println(lista);

        System.out.println(lista.size());

        lista.clear();

        System.out.println("--------");

        System.out.println(lista);
    }
}
