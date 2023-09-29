/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certifico_exam2;

/**
 *
 * @author khian
 */
import java.util.Scanner;

public class Number2 {
   
  private class DoubleNode{
      DoubleNode next;
      String data;
      DoubleNode prev;
  }

    private int size;
    private DoubleNode head;
    
    private DoubleNode createNewNode(String value)throws Exception{
        DoubleNode doublenewnode = new DoubleNode();
        doublenewnode.data = value;
        doublenewnode.prev = null;
        doublenewnode.next = null;
      return doublenewnode;
    
    }
    public DoubleNode getNodeatbeg(int index)throws Exception{
        if (size == 0) {
            throw new Exception("Linked list MT");
        
    }
      return null;
}
    public int getNode(int index)throws Exception{
    
        return 0;
    }
    
    public static void main(String[]args)throws Exception{
    Scanner scn = new Scanner(System.in);
    Number2 list = new Number2();
    boolean start = true;
   
    while(start){
        System.out.println("Menu");
        System.out.println("Search");
        System.out.println("Exit");
        int choice = scn.nextInt();
        int position;
                String value;
                
    }
    }
    }