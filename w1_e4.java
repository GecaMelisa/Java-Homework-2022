import java.util.Scanner;

public class w1_e4{
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number for a: ");
        int a = Integer.parseInt(reader.nextLine());

        System.out.println("Type a number for b: ");
        int b = Integer.parseInt(reader.nextLine());

        System.out.println("The sum is: " + (a + b));
  }
}
