import java.util.*;
class Prac1{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the numbers and sign for operation ");
      System.out.print("Enter the first name ");
      int num1 = sc.nextInt();
      System.out.println();
      System.out.print("Enter the second name ");
      int num2 = sc.nextInt();
      System.out.println();
      System.out.print("Enter the sign of operation ");
      char sign = sc.nextChar();
      Calculator(num1,num2,sign); 
  }
  public static void Calculator(int num1 , int num2, char sign){
      if(sign == '+'){
        System.out.println("Addition of 2 numbers are : " + num1 + num2);
        return;
      }
      if(sign == '-'){
        System.out.println("Substraction of 2 numbers are : " + num1 - num2);
        return;
      }
      if(sign == '*'){
        System.out.println("Multiplication  of 2 numbers are : " + num1 * num2);
        return;
      }
      if(sign == '/'){
        if(num1 == 0){
          System.out.println("dividation not possible ");
          return;
        }
        System.out.println("Addition of 2 numbers are : " + num2 / num1);
      }
  }
}
