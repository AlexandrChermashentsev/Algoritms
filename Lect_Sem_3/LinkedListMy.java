package Lect_Sem_3;
public class LinkedListMy {
    private Node head;
    private Node tail;
    private int size;

    public void add(int value) {
        Node newNode = new Node(value, null, null);
        if (head == null) {
            head = newNode;
            size = 1;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null)
            currentNode = currentNode.next;
        currentNode.next = newNode;
        size++;
    }

    public void print() {
        System.out.print("[ ");
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println("]");
    }
    
    // Необходимо реализовать метод разворота связного списка
    public void reverse(){
        if (head != null && head.next != null){
            tail = head;
            Node currentNode = head.next;
            head.next = null;
            while (currentNode != null){
                Node temp = currentNode.next;
                currentNode.next = head;
                head = currentNode;
                currentNode = temp;
            }
        } else System.out.println("Error!");
    }

    private class Node {
        public int value;
        public Node next;
        public Node prev;

        public Node() {
            value = 0;
            next = null;
            prev = null;
        }

        public Node(int _value, Node _next, Node _prev) {
            this.value = _value;
            this.next = _next;
        }
    }
}


