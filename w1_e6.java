import java.util.Scanner;

public class w1_e6{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Type the first number: ");
    int x = Integer.parseInt(reader.nextLine());

    System.out.print("Type the second number: ");
    int y = Integer.parseInt(reader.nextLine());

    if(x > y) {
      System.out.println("Greater number: " + x);
    } else if (x < y) {
      System.out.println("Greater number: " + y);
    } else {
      System.out.println("The numbers are equal");
    }
  }
}