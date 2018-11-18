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
    public void displayList(){
        Node p;
        if(start==null){
            System.out.println("List is empy");
        }
        p = start;
        while(p.link!= null){
            System.out.println(p.info + " ");
            p=p.link;          
        }
        System.out.println();
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