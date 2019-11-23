import javafx.util.Pair;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {


    public static String zwrocimie() {
        Integer case1 = 5;
        String imie = "";
        switch (case1) {
            case 1:
                imie = "Kasia";
                break;
            case 5:
                imie = "Tomek";
                break;
            case 8:
                imie = "Romek";
                break;
            default:
                imie = "noname";
        }
        return imie;
    }

    public static void przedstawsie(String imie) {
        System.out.println("Moje imie to" + imie);
    }

    public static void main(String[] args) {

        String imie = zwrocimie();
        przedstawsie(imie);

        {
            System.out.println("moj pierwszy program");
            System.out.println("druga linijka");
            //zmienne
            //Definicja typu (string) nazwa zmiennej (napis) + opcjonalne przydzielenie wartości
            //String - typ tekstowy, jego wartością jest napis (w cudzysłow)
            String napis1 = "pierwszy napis";
            //boolean - typ logiczny zwraca true or flase
            Boolean isTomek = napis1.contains("Tomek");
            System.out.print(isTomek);
            //integer - typ numeryczny licz całkowitych
            //Long - liczba całkowita, dużo dłuższa jeśli bedzie krótka to pojawi sie komunikat o próbe użycia integer
            Integer licza1 = 2;
            Long liczba2 = Long.valueOf(214);
            //Typ prpsty, integer to klasa wrappująca typ prosty int(daje metody
            // ułatwiajace prace z danym typem

            //Float - typ numeryczny zmiennoprzecinkowy
            //Float ulamki1 = 10.15545645;
            Double ulamki2 = 20.87;

            //Kolekcje
            // Lista = zbior elementów w indeksie
            List<String> lista1 = new ArrayList<>();
            lista1.add(napis1);
            lista1.add("Tomek");
            System.out.print(lista1.toString());

            //HashMap - słownik trzymający pary klucz-wartość

            HashMap<String, Integer> mapa1 = new HashMap<>();
            mapa1.put(napis1, licza1);
            mapa1.put("Tomek", 5);
            System.out.println(mapa1.toString());

            //Pair - słownik trzymający jendą pare klucz-wartosc
            Pair<String, Integer> mojapara = new Pair<>("Pojedyńcza para", 1);
            String napis2 = mojapara.getKey();
            napis2 += mojapara.getValue().toString();
            System.out.println((napis2));

            //Pętle
            //petla for
            // warunek poczatkowy ( wartość początkowa licznika ; warunek końcowy ( warość końcowa licznika;
            // modyfikator licznika i++  oznacza, że i bedzie wieksze od 1 po przejsciu pętli

            for (Integer i = 0; i < 6; i++) {
                System.out.println("wartość licznika: " + i.toString());
            }
            Integer i = 0;
            while (i < 6) {
                System.out.println(("jestem w while po raz" + i.toString()));
                i++;

                // Break to specjalne słowo, które pozwala zakończyć działanie pętli
                //Contiune pozwala przejsc do kolejnej iteraji z pominieciem kodu pod tym
            }
            while (true) {
                if (i.equals(7))
                    continue;
                System.out.println("xyz" + i.toString());
                if (i.equals(6))
                    break;
            }


            do {
                System.out.println("jestem w do while");
                i++;
            } while (i < 10);

            //Petla foreach
            for (String el : lista1) {
                System.out.println("element listy: " + el);

            }
            // Pętla for each na mapie #TODO

            //for(string el; mapa1)


            //instrukcje warunkowe
            //instrukcja if..else if...else
            //Else zawsze sie wykona, kiedy warunek nie jest spełniony

            if (lista1.size() == 3) {
                System.out.println("hej jestem w instrukcji warunkowej");

            }
            if (lista1.size() < 1) {
                System.out.println("z tym warunkiem nigdy sie nie wpisze");
            } else {
                System.out.println("jestem w intrukcji else");
            }

            if (lista1.size() < 1) {
                System.out.println("nie wykonam sie");
            } else if (lista1.size() == 2) {
                System.out.println("ja sie wykonam");
            } else {
                System.out.println("ja sie juz niewykonam bo warunek jest spełniony");
            }

            //instrukcja warunkowa switch case
            i = 5;
            String massage = "moje imie to ";
            switch (i) {
                case 2:
                    massage += "Gałgan";
                case 5:
                    massage = "Hultaj";
                case 8:
                    massage = "Nicpon";
            }
            System.out.println(massage);

        }
    }
}
