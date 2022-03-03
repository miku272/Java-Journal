/*
Create a class namely Book to maintain Book details like id, name, quantity and author using singly linked list. Perform following operations on book list:

a. Add book details in the beginning of the list
b. Add book details at the end of the list
c. Add book detail at particular position
d. Remove first book detail from the list
e. Remove last book detail from the list
f. Display all book details in the list
*/

class BookDetail {
    int id;
    String name;
    int quantity;
    String author;

    BookDetail() {
        this.id = 0;
        this.name = "Not Set";
        this.quantity = 0;
        this.author = "None";
    }

    BookDetail(int id, String name, int quantity, String author) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.author = author;
    }
}

class SinglyLinkedList {
    class Node {
        BookDetail data;
        Node next;

        Node(BookDetail data) {
            this.data = data;
            next = null;
        }
    }

    Node head = null;

    public SinglyLinkedList.Node addFirst(BookDetail data) {
        Node newNode = new Node(data);

        newNode.next = head;
        return head = newNode;
    }

    public void addLast(BookDetail data) {
        Node newNode = new Node(data);
        Node temp = head;
        newNode.next = null;

        if(head == null) {
            head = new Node(data);
            return;
        }

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    public void addAt(Node prevNode, BookDetail data) {
        Node newNode = new Node(data);

        if(prevNode == null) {
            System.out.println("Error! please enter a correct node!");
            return;
        }

        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public Node removeFirst() {
        if(head == null) {
            return null;
        }
        else {
            head = head.next;
            return head;
        }
    }

    public Node removeLast() {
        Node secondLast = head;

        if(head == null) {
            return null;
        }
        else if(head.next == null) {
            return null;
        }
        else {
            while(secondLast.next.next != null) {
                secondLast = secondLast.next;
            }

            secondLast.next = null;

            return head;
        }
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty!");
        } 
        else {
            do {
                System.out.println(current.data.id + " " + current.data.name + " " + current.data.quantity + " " + current.data.author);

                current = current.next;

                System.out.print("\n");
            } while (current.next != null);
        }
    }
}

public class Program6 {
    public static void main(String[] args) {
        SinglyLinkedList l = new SinglyLinkedList();

        l.addFirst(new BookDetail(1, "Book-1", 10, "Author-1"));
        l.addFirst(new BookDetail(2, "Book-2", 1, "Author-2"));
        l.addFirst(new BookDetail(3, "Book-3", 4, "Author-3"));
        l.addFirst(new BookDetail(4, "Book-4", 60, "Author-4"));
        SinglyLinkedList.Node temp = l.addFirst(new BookDetail(5, "Book-5", 30, "Author-5"));

        l.addFirst(new BookDetail(6, "Book-6", 3, "Author-6")); // Adding book details in the beginning of the list

        l.addLast(new BookDetail(7, "Book-7", 55, "Author-7")); // Adding book details at the end of the list

        l.addAt(temp, new BookDetail(8, "Book-8", 13, "Author-8")); // Adding book detail at particular position

        l.removeFirst(); //Removing first book detail

        l.removeLast(); // Removing last book detail

        l.display(); // displaying book detail
    }
}