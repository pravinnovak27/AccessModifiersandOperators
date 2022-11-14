package apt;
import java.util.*;
class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.print("Enter the number: ");
      int num= sc.nextInt();
   
      int reverse=0, element, remainder; 
      element = num;
   
      for( ;num!=0;num/=10){
        remainder= num % 10;
        reverse = (reverse * 10) + remainder;
      }
   
      if (element == reverse){
        System.out.println("Yes, it is palindrome");
      }
      else{
        System.out.println("No, it is not palindrome");
        sc.close();
      }
    }
  }

