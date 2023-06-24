package Lect_Sem_3;

public class Main {
    public static void main(String[] args) {
        LinkedListMy list = new LinkedListMy();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(7);

        list.print();
        list.reverse();
        list.print();

        LinkedListMy list2 = new LinkedListMy();
        list2.reverse();
        list2.add(1);
        list2.reverse();
    }
}
