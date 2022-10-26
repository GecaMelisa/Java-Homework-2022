

import java.util.Scanner;

public class w2_e4{
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number for x: ");
        int x = Integer.parseInt(reader.nextLine());

        System.out.println("Enter a number for y: ");
        int y = Integer.parseInt(reader.nextLine());

        if (x<y) {
            while (x<=y){
                System.out.println(x);
                x++;
            }
        }
    }
}