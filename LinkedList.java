class LinkedList {
    class Node {
        int data;      
        Node next;   

        Node(int value) {
            data = value;
            next = null;
        }
    }

    Node head = null; 

    public                                                                                                                                                                       void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {  
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) { 
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Inserted "+value);
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ==> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(100);
        list.insert(200);
        list.insert(300);
        list.insert(400);
        list.insert(500);

        list.display();
    }
}