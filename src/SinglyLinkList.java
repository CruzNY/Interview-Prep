
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexiscruz
 */
public class SinglyLinkList {
    private Node start;
    public SinglyLinkList(){
        start = null;
        
    }
    public static void main (String argsp[]){
        SinglyLinkList s = new SinglyLinkList();
        s.createList();
        System.out.println("");
        s.displayList();
        s.insertToBeginning(3);
        s.displayList();
        
    }
    
    public void displayList(){
        Node p;
        if(start==null){
            System.out.println("List is empy");
        }
        System.out.println("List is: ");
        p = start;
        while(p!= null){
            System.out.println(p.info + " ");
            p=p.link;              
        }
        System.out.println();
    }
    public void countNodes(){
        int n = 0;
        Node p = start;
        while(p!=null){
            n++;
            p=p.link;
            
        }
        System.out.println("Number of Links: " + n);
    }
    public boolean search(int x){
        Node p;
        int position = 1;
        p = start;
        while(p!=null){
            if(p.info == x)
                break;
            position++;
            p = p.link;
        }
        if(p==null){
            System.out.println(x + " Not Found");
            return false;            
        }
        else{
            System.out.println(x + " is at position " + position);
            return true;
        }
            
    }
    public void insertToBeginning(int data){
        Node temp = new Node(data);
        temp.link = start;
        start = temp;
    }
    public void insertToEnd(int data){
        Node p;
        Node temp = new Node(data);
        if(start==null){
            start = temp;
            return;
        }
        p=start;
        while(p.link!=null)
            p = p.link;            
        p.link = temp;
    }
    public void createList(){
     int i, n , data;
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the number of nodes: ");
     n = scan.nextInt();
     if(n == 0)
         return;
     for(i = 1; i<=n; i++){
         System.out.println("Enter the elemenet to be inserted.");
         data = scan.nextInt();
         insertToEnd(data);         
     }
    }        

}

class Node{
    public int info;
    public Node link;
    public Node(int i){
        info = i;
        link = null;
    }
}