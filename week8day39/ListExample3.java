import java.util.*;
class Book{
  String title,author;
  int price;
  public Book(String title,String author,int price){
    this.title=title;
    this.author=author;
    this.price=price;
  }
}
class ListExample3 {
  public static void main(String[] args) {
    List<String> l = new ArrayList<String>();
    Book b1=new Book("the rose","srinidhi",100);
    l.add(b1);

      System.out.println("the book"+b1.title+"is wrriten by "+b1.autor+"prize is "+b1.price);
    
  }
}