public class App {
    public static void main(String[] args) throws Exception {
        ListArrayOfInteger lista = new ListArrayOfInteger();

        System.out.println(lista);

        lista.add(5);
        lista.add(8);
        lista.add(10);
        lista.add(7);
        lista.add(16);

        System.out.println(lista);

        lista.remove(3);

        System.out.println(lista);

    }
}
