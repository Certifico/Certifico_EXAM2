/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

///number 1
package certifico_exam2;

/**
 *
 * @author khian
 */
import java.util.Scanner;
class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        this.head = null;
    }


   private void addCircular(String data,int position) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = head.next;
            head.next = newNode;
        }
    }
    
    private  void displayCircular() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }   
}


public class Certifico_EXAM2 {
    
public static void main(String [] args){
        
        Certifico_EXAM2 list = new Certifico_EXAM2();
        Scanner scn = new Scanner (System.in);
        boolean start= true;
        
        while (true) {            
            System.out.println("[Question #1]. Manually Input the 10 Classmates");
            
            System.out.println("Add");
            System.out.println("Display");
            System.out.println("Exit");
            System.out.println("Enter Choice: ");
            
            int choiceInt = scn.nextInt();
            
              switch (choiceInt) {
                case 1:
                    System.out.print("Enter a name to add: ");
                    String fruitToAdd = scn.next();
                    list.addCircular();
                    break;
                case 2:
                     System.out.println("Circular Linked List:");
                    list.displayCircular();
                    break;
            }
        }
        }

    private void addCircular() {
        
    }

    private void displayCircular() {
      
        
    }

}
