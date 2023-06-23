package practices.repeatingLetters;

import java.util.*;

public class RepeatingLetters {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        HashSet<String> c = new HashSet<>();

        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j < a.length(); j++) { // iç döngüde j'yi i + 1'den başlatma
                if (a.charAt(i) == a.charAt(j)) {

                   c.add(String.valueOf(a.charAt(j)));

                }

            }
        }

        for(String character : c){
            System.out.print(character);
        }
    }
}
