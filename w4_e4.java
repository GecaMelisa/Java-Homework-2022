import java.text.BreakIterator;

public class w4_e4 {
  public static void main(String[] args) {
    Lyra pekka = new Lyra(20.0);
    Lyra brian = new Lyra(30.0);

    pekka.payGourmet();
    brian.payEconomical();

    System.out.println("Pekka: " + pekka.toString());
    System.out.println("Brian: " + brian.toString());

    pekka.loadMoney(20.0);
    brian.payGourmet();

    System.out.println("Pekka: " + pekka.toString());
    System.out.println("Brian: " + brian.toString());

    pekka.payEconomical();
    pekka.payEconomical();
    brian.loadMoney(50.0);

    System.out.println("Pekka: " + pekka.toString());
    System.out.println("Brian: " + brian.toString());
  }
}