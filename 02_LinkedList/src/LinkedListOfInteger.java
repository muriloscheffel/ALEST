public class LinkedListOfInteger {

    // Classe interna Node
    private class Node {
        public Integer element;
        public Node next;

        public Node(Integer element) {
            this.element = element;
            next = null;
        }
        
        public Node(Integer element, Node next) {
            this.element = element;
            this.next = next;
        }        
    }

    
    // Referência para o primeiro elemento da lista encadeada.
    private Node head;
    // Referência para o último elemento da lista encadeada.
    private Node tail;
    // Contador para a quantidade de elementos que a lista contem.
    private int count;

    
    /**
     * Construtor da lista.
     */
    public LinkedListOfInteger() {
        head = null;
        tail = null;
        count = 0;
    }
    
    /**
     * Retorna true se a lista nao contem elementos.
     * @return true se a lista nao contem elementos
     */
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Retorna o numero de elementos da lista.
     * @return o numero de elementos da lista
     */
    public int size() {
        return count;
    }

    /**
     * Esvazia a lista
     */
    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }    

    /**
     * Adiciona um elemento ao final da lista.
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Integer element)  { // O(1)
        Node n = new Node(element);

        if (head == null) {
            head = n;
        } else {
            tail.next = n;
        }
        tail = n;
        count++;
    }
    
    /**
     * Retorna o elemento de uma determinada posicao da lista.
     * @param index a posição da lista
     * @return o elemento da posicao especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer get(int index) { 
        if(index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index invalido");
        }
        if(index == count - 1) {
            return tail.element;
        }
        Node aux = head;

        for(int i = 0; i < index; i++) {
            aux = aux.next;
        }
        return aux.element;
    }
    
    /**
     * Retorna true se a lista contem o elemento especificado.
     * @param element o elemento a ser testado
     * @return true se a lista contem o elemento especificado
     */
    public boolean contains(Integer element) { 
        Node aux = head;

        for(int i = 0; i < count; i++) {
            if(aux.element.equals(element)) {
                return true;
            }
            aux = aux.next;
        }

        return false;
    }    
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        Node aux = head;

        while (aux != null) {
            s.append(aux.element.toString());
            s.append("\n");
            aux = aux.next;
        }

        return s.toString();
    }    
    
    
    ////////////////////////////////////////////////////////////////
    
    /**
     * Substitui o elemento armanzenado em uma determinada posicao da lista pelo
     * elemento indicado.
     * @param index a posicao da lista
     * @param element o elemento a ser armazenado na lista
     * @return o elemento armazenado anteriormente na posicao da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer set(int index, Integer element) {
        if(index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index invalido");
        }
        Node aux = head;

        for(int i = 0; i < index; i++) {

        }
        return -1;
    }
    
    /**
     * Insere um elemento em uma determinada posicao da lista.
     * @param index a posicao da lista onde o elemento sera inserido
     * @param element elemento a ser inserido
     * @throws IndexOutOfBoundsException se (index < 0 || index > size())
     */
    public void add(int index, Integer element) {
        if(index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index invalido");
        }
        
    }

    /**
     * Remove a primeira ocorrencia do elemento na lista, se estiver presente.
     * @param element o elemento a ser removido
     * @return true se a lista contem o elemento especificado
     */
    public boolean remove(Integer element) {
        if(count == 0) {
            return false;
        }
        if(head.element.equals(element)) {
            if(count == 1) {
                tail = null;
            }
            head = head.next;
            count--;
            return true;
        }

        Node ant = head;
        Node aux = head.next;

        for(int i = 0; i < count; i++) {
            if(aux.element.equals(element)) {
                if(aux == tail) {
                    tail = ant;
                    tail.next = null;
                } else {
                    ant.next = aux.next;
                }
                count--;
                return true;
            }
            ant = ant.next;
            aux = aux.next;
        }
        return false;
    }

    /**
     * Remove o elemento de uma determinada posicao da lista.
     * @param index a posicao da lista
     * @return o elemento que foi removido da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer removeByIndex(int index) {
        
        return -1;
    }

    /**
     * Retorna o indice da primeira ocorrencia do elemento na lista, ou -1 se a
     * lista nao contem o elemento.
     * @param element o elemento a ser buscado
     * @return o indice da primeira ocorrencia do elemento na lista, ou -1 se a
     * lista nao contem o elemento
     */
    public int indexOf(Integer element) {
        Node aux = head;

        for(int i = 0; i < size(); i++) {
            if(aux.element.equals(element)) {
                return i;
            }
            aux = aux.next;
        }
        return -1;
    }

    public int[] subList(int fromIndex, int toIndex) {
        if(fromIndex < 0) {
            throw new IndexOutOfBoundsException("Index invalido");
        }
        if(toIndex < fromIndex || toIndex > size()) {
            throw new IndexOutOfBoundsException("Index invalido");
        }
    
        int[] vetor = new int[toIndex - fromIndex];
        Node aux = head;

        for(int i = 1; i <= fromIndex; i++) {
            aux = aux.next;
        }

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = aux.element;
            aux = aux.next;
        }

        return vetor;
    }

    public boolean equals(LinkedListOfInteger outra) {
        if(size() != outra.size()) {
            return false;
        }
        Node aux = head;
        Node auxOutra = outra.head;

        for(int i = 0; i < size(); i++) {
            if(aux.element != auxOutra.element) {
                return false;
            }
            aux = aux.next;
            auxOutra = auxOutra.next;
        }
        return true;
    }

    public int[] getBackToFront() {
        int[] v = new int[size()];
        Node aux = head;
        getBackToFront(aux, v, size() - 1);
        return v;
    }
    private void getBackToFront(Node aux, int[] vet, int index) {
        if(aux == null) {
            return;
        }
        vet[index] = aux.element;
        getBackToFront(aux.next, vet, index - 1);
    }

    public LinkedListOfInteger merge(LinkedListOfInteger l1, LinkedListOfInteger l2) {
        Node aux1 = l1.head;
        Node aux2 = l2.head;

        int[] vet = new int[l1.size() + l2.size()];

        for(int i = 0; i < l1.size(); i++) {
            vet[i] = aux1.element;
            aux1 = aux1.next;
        }
        for(int i = l1.size(); i < vet.length; i++) {
            vet[i] = aux2.element;
            aux2 = aux2.next;
        }
        insertionSort(vet);
        LinkedListOfInteger lista = new LinkedListOfInteger();
        for(int i = 0; i < vet.length; i++) {
            lista.add(vet[i]);
        }
        return lista;
    } 

    public void insertionSort(int[] vetor) {
        int j;
        int key;
        int i;
    
        for (j = 1; j < vetor.length; j++)
        {
          key = vetor[j];
          for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
          {
             vetor[i + 1] = vetor[i];
           }
            vetor[i + 1] = key;
        }
    }
}
