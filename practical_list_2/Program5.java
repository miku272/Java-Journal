/*
Create a class namely Vehicle to maintain vehicle data like chassisNo, nameOfVehicle, colour, owner using singly circular linked list. Perform following operations on student list:

a. Add vehicle details at the end of the list
b. Remove last vehicle detail in the list
c. Display all vehicle details in the list
*/

class Vehicle {
    long chassisNo;
    String nameOfVehicle;
    String color;
    String ownerName;

    Vehicle() {
        this.chassisNo = 0L;
        this.nameOfVehicle = "Not Set";
        this.color = "Red";
        this.ownerName = "No Owner";
    }

    Vehicle(long chassisNo, String nameOfVehicle, String color, String ownerName) {
        this.chassisNo = chassisNo;
        this.nameOfVehicle = nameOfVehicle;
        this.color = color;
        this.ownerName = ownerName;
    }
}

class SinglyCircularLinkedList {
    private class Node {
        Vehicle data;
        Node next;

        Node(Vehicle data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    public void add(Vehicle data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public Node delete() {
        Node current = head, previous = null;

        if (head == null) {
            System.out.println("There is nothing to delete...");
            return null;
        }

        if (current.next == current) {
            head = null;
            return null;
        }

        while (current.next != head) {
            previous = current;
            current = current.next;
        }

        previous.next = current.next;
        head = previous.next;

        return head;
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("List is empty!");
        } else {
            do {
                System.out.println(current.data.chassisNo + " " + current.data.nameOfVehicle + " " + current.data.color
                        + " " + current.data.ownerName);

                current = current.next;

                System.out.print("\n");
            } while (current != head);
        }
    }
}

public class Program5 {
    public static void main(String[] args) {
        SinglyCircularLinkedList l = new SinglyCircularLinkedList();

        l.add(new Vehicle(1, "BMW", "White", "Daniels"));
        l.add(new Vehicle(2, "Maruti Suzuki", "Red", "Mike"));
        l.add(new Vehicle(3, "Ford", "Blue", "Jake"));

        l.add(new Vehicle(4, "Honda", "Maroon", "Lisa")); // Adding one detail at the end of the list

        l.delete(); // Deleting the last detail from the list

        l.display(); // Displaying the list
    }
}
