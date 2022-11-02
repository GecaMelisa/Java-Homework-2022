import java.util.Scanner;

public class w3_e1 {
  public static double average(int a, int b, int c, int d) {
    int sum = Integer.sum(a, b) + Integer.sum(c, d);
    double avg = sum / 4.0;
    return avg;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print( "Type a number for a: ");

    int a = Integer.parseInt(reader.nextLine());

    System.out.print("Type a number for b: ");
    int b = Integer.parseInt(reader.nextLine());

    System.out.print("Type a number for c: ");
    int c = Integer.parseInt(reader.nextLine());

    System.out.print("Type a number d: ");
    int d = Integer.parseInt(reader.nextLine());

    System.out.println("The average is: " + average(a, b, c, d));
  }
}