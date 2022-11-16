/*The University of Helsinki students use so-called Lyyra cards to pay for their meals in student cafeterias. In this assignment, we
 implement the class LyyraCard that simulates the Lyyra card.
 */

public class Lyra {
    private double balance;
  
      public Lyra(double balanceAtStart) {
        this.balance = balanceAtStart;
      }
  
      public String toString() {
        return "The card has " + this.balance + " euros";
      }
  
      public void payEconomical() {
        if(this.balance < 2.5) {
          System.out.println("Payment rejected!");
        } else {
          this.balance -= 2.50;
        }
      }
  
      public void payGourmet() {
        if(this.balance < 4.0) {
          System.out.println("Payment rejected!");
        } else {
          this.balance -= 4.0;
        }
      }
  
      public void loadMoney(double amount) {
        if(amount >= 0) {
        if(this.balance + amount > 150.0) {
          this.balance = 150.0;
        } else {
          this.balance += amount;
        }
      }
    }
  }