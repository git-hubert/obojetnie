import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2 {


    public static Double cenabrutto(Double cena) {
        return cena * 1.23;
    }


    public static void main(String[] args) {


        HashMap<String, Double> owoce = new HashMap<>();
        owoce.put("maliny", 2.5);
        owoce.put("gruszka", 3.5);
        owoce.put("banan", 1.75);
        owoce.put("truskawka", 5.80);
        List<String> nazwyowocow = new ArrayList<>();
        nazwyowocow.add("maliny");
        nazwyowocow.add("gruszka");
        nazwyowocow.add("banan");
        nazwyowocow.add("truskawka");

        Double cenasumaryczna = 0.0;
        for (Integer i = 0; i < 4; i++) {
            String owoc = nazwyowocow.get(1);
            cenasumaryczna += cenabrutto(owoce.get(owoc));
        }
        System.out.println("cena twoich zakupów to: " + cenasumaryczna.toString());

    }
}