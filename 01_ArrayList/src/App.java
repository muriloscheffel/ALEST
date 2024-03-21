public class App {
    public static void main(String[] args) throws Exception {
        ListArrayOfInteger lista = new ListArrayOfInteger();

        lista.add(5);
        lista.add(2);
        lista.add(10);
        lista.add(10);
        lista.add(121);
        System.out.println(lista.size());
        lista.add(5, 8);
        System.out.println(lista.size());

        System.out.println(lista);
        System.out.println(lista.containsRecursivo(75));
    }
}
