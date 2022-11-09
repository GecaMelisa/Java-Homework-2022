public class w4_e3 {
    public static void main(String[] args) {
        Lyra card = new Lyra(25.0);
    
        System.out.println(card.toString()); //25.0
    
        card.payEconomical();
        System.out.println(card.toString()); //22.5
    
        card.payGourmet();
        System.out.println(card.toString()); //18.5
    
        card.loadMoney(-10);
        System.out.println(card.toString());
      }
    
}
