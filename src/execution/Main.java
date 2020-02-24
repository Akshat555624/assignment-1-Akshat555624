package execution;

import contact.Person;
import definition.Program;
import node.LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = false;
        LinkedList<Person> linkedList = new LinkedList<>();
        while (!loop) {
            System.out.println("Welcome to My  Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            int choice = scanner.nextInt();
            Program object = new Program();
            switch (choice) {
                case 1:
                    linkedList.insert(object.addDetails());
                    if (linkedList.getSize() > 1) {
                        linkedList = linkedList.sort(linkedList);
                    }
                    break;
                case 2:
                    object.viewContact(linkedList);
                    break;
                case 3:
                    object.searchContact(linkedList);
                    break;
                case 4:
                    object.deleteContact(linkedList);
                    break;
                case 5:
                    loop = true;
                    break;
                default:
                    System.out.println("entry is wrong..sorry");
            }
        }

    }
}




