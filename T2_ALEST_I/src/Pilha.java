public class Pilha {

    private class Node{
        public Integer element;
        public Node next, prev;
    
        public Node(Integer element) {
            this.element = element;
            next = null;
            prev = null;
        }
    }

    private Node bottom, top;
    private int count;

    public Pilha() {
        bottom = null;
        top = null;
        count = 0;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node aux = bottom.next;

        for(int i = 0; i < count; i++) {
            s.append(aux.element);
            s.append("\n");
            aux = aux.next;
        }
        
        return s.toString();
    }
}