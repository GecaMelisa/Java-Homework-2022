import java.util.HashMap;

public class Prvi {
    public static void main(String[] args){
        HashMap<String,String> people = new HashMap<String,String>();

        people.put("matti" , "mage");
        people.put("mikael" , "mixu");
        people.put("arto" , "arpa");

        System.out.println(people.get("matti"));
        System.out.println(people.get("mikael"));
        System.out.println(people.get("arto"));
    }
    
}
