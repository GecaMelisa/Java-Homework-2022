import java.util.Scanner;

public class w2_e7 {
    public static void printStars(int a) {
        String star =  "";
      
        while(a >= 0) {
          star += "*";
          a--;
        }
      
        System.out.println(star);
       }
      
       public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
      
        System.out.print("How many stars to print: ");
        int num = Integer.parseInt(reader.nextLine());
      
        printStars(num);
       }
    }
