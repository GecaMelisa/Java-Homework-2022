import java.util.Scanner;

public class w1_e5{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = Integer.parseInt(reader.nextLine());
    
        if(n > 0) {
          System.out.println("Numebr is positive");
        } else if(n < 0) {
          System.out.println("Number is negative");
        } else {
          System.out.println("Number is zero");
        }
      }
    }


