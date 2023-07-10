//inserting at end
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

public void insert(int data){
  
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



class LinkedListEnd{
  public static void main(String[] args){
    Method m=new Method();
    m.insert(10);
    m.insert(100);
    m.insert(60);
    m.insert(90);
    m.insert(40);
    m.displaylist();
    
  }
}
