import java.util.Scanner;

public class w3_e5 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter the first word: ");
    String word1 = reader.nextLine();

    System.out.print("Enter the second word: ");
    String word2 = reader.nextLine();

    if(word1.indexOf(word2) != -1) {
      System.out.println(word2 + " is in the word " + word1);
    } else {
      System.out.println(word2 + " is not in the word " + word1);
    }    
  }
}