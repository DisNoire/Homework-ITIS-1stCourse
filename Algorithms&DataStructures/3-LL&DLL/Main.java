
public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("qwe");
        myLinkedList.add("asd");
        myLinkedList.add("zxc");
        myLinkedList.add("fgh");
        myLinkedList.addAfter("asd", "fgh");
        myLinkedList.remove("fgh");
        System.out.println("Get: " + myLinkedList.get(1));
        System.out.println("Has: " + myLinkedList.has("qwe"));
        MyLinkedList<String> myLinkedList1 = new MyLinkedList<>();
        myLinkedList1.add("ass und");
        myLinkedList1.add("ITIS wot");
        myLinkedList1.add("m8 mate");
        myLinkedList.merge(myLinkedList1);

        for (String myLL : myLinkedList) {
            System.out.println("Iterator: " + myLL);
        }

        System.out.println("_____________________________________________________");

        MyDoubleLinkedList<String> myDoubleLinkedList = new MyDoubleLinkedList<>();
        myDoubleLinkedList.add("qwe");
        myDoubleLinkedList.add("asd");
        myDoubleLinkedList.add("zxc");
        myDoubleLinkedList.add("fgh");
        myDoubleLinkedList.addAfter("asd", "fgh");
        myDoubleLinkedList.remove("fgh");
        System.out.println("Get: " + myDoubleLinkedList.get(1));
        System.out.println("Has: " + myDoubleLinkedList.has("qwe"));
        MyDoublyLinkedList<String> myDoublyLinkedList1 = new MyDoublyLinkedList<>();
        myDoubleLinkedList1.add("ass und");
        myDoubleLinkedList1.add("ITIS wot");
        myDoubleLinkedList1.add("m8 mate");
        myDoubleLinkedList.merge(myDoubleLinkedList1);

        for (String myDLL : myDoubleLinkedList) {
            System.out.println("Iterator: " + my);
        }
    }
}
