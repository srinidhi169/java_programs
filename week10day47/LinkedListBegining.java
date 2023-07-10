//inserting at begining
class Node{
  int data;
  Node next;

  public Node(int data){
    this.data=data;
    this.next=null;
  }
}


class Method{
public Node head=null;
public Node tail=null;

public void insertAtBegining(int data){
  
  Node newNode=new Node(data);
  if(head==null){
    head=newNode;
    tail=newNode;
  }
 else{
   newNode.next=head;
   head=newNode;
 }
}
public void insertAtEnd(int data){
  
  Node newNode=new Node(data);
  if(head==null){
    head=newNode;
    tail=newNode;
  }
 else{
   tail.next=newNode;
   tail=newNode;
 }
}

 public void displaylist(){
   
  Node current=head;
  if(head==null){
    System.out.println("empty list");
    return;
  }
  System.out.println("the list is:");
  while(current!=null){
    System.out.print(current.data+",");
    current=current.next;
  }
  System.out.println();
 }
  
}



class LinkedListBegining{
  public static void main(String[] args){
    Method m=new Method();
    m.insertAtBegining(10);
    m.insertAtBegining(100);
    m.insertAtBegining(60);
    m.insertAtBegining(90);
    m.insertAtBegining(40);
    m.displaylist();
    m.insertAtEnd(1345);
    m.insertAtEnd(45);
    m.insertAtEnd(2345);
    m.displaylist();
    
  }
}
