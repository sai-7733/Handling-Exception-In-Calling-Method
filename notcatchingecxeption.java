public class JavaExample {

  //exception occurred in this method but it is not handled here
  //so the exception is propagated to the calling method printQuotient
  int calculateQuotient(int num1, int num2) {
    int temp = num1/num2;
    return temp;
  }

  //Here we have done exception handling
  void printQuotient(int num1, int num2){
    try {
      int q = calculateQuotient(num1, num2);
      System.out.println("Quotient is: " + q);
    }catch(ArithmeticException e){
      System.out.println("Arithmetic exception occurred");
    }
  }
  public static void main(String[] args) {

    int num1 = 10, num2 = 0;

    //calling method
    JavaExample obj = new JavaExample();
    obj.printQuotient(num1, num2);

  }
}