//program to illustrate usage of this keyword in constructor overloading 
class Test
{
    Test() //no-arg constructor
    {
        this(10,20);
    System.out.println("I am from Default Constructor");
    }
    Test(int x) //parameterized constructor
    {
        this(); //call the no-arg constructor
        System.out.println("I am from Single Parameter Constructor");
    
    }
    Test(int x, int y) //parameterized constructor
    {
        System.out.println("I am from Double Parameter Constructor");
    }
}
class Constractor
{
    public static void main(String args[])
    {
        Test t1 = new Test(10);
    }
}