class Operator {
  public static void main(String[] args) {

    int a = 12, b = 5;

    // addition operator
    System.out.println("a + b = " + (a + b));

    // subtraction operator
    System.out.println("a - b = " + (a - b));

    // multiplication operator
    System.out.println("a * b = " + (a * b));

    // division operator
    System.out.println("a / b = " + (a / b));

    // modulo operator
    System.out.println("a % b = " + (a % b));

    // == operator
    System.out.println(a == b); // false

    // != operator
    System.out.println(a != b); // true

    // > operator
    System.out.println(a > b); // true

    // < operator
    System.out.println(a < b); // false

    // >= operator
    System.out.println(a >= b); // true

    // <= operator
    System.out.println(a <= b); // false

    // && operator
    System.out.println((5 > 3) && (8 > 5)); // true

    // || operator
    System.out.println((5 < 3) || (8 > 5)); // true

    // ! operator
    System.out.println(!(5 == 3)); // true

  }
}