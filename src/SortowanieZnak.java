import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortowanieZnak {
    /*Zadanie 1.3. Sortowanie listyWykorzystując  interfejs  funkcyjny Comparator<T>napisz  metodę  sortującą  listę łańcuchów  znaków
     w  zależności  od  długości.  Metoda  compare(T  o1,T  o2)  zwraca  liczbę całkowitą zgodnie z funkcją signum (ujemną, zero lub dodatnią)
      jeśli pierwszy argument jest odpowiednio (mniejszy, równy, większy) od drugiego. Użyj wyrażenia lambda*/

    public static void sortowanieListy(Comparator<String> komperator, ArrayList<String> lista) {
        int porownanie;
        String temp;
        for (int i = 0; i < lista.size()-1; i++) {
            for (int j = i+1; j <lista.size() ; j++) {
                porownanie=komperator.compare(lista.get(i), lista.get(j));
                if(porownanie<=0) {
                    continue;
                }
                else {
                    temp=lista.get(i);
                    lista.set(i,lista.get(j));
                    lista.set(j,temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("Utworzyłem", "listę", "zawierającą", "wyrazy" ,"losowej", "długości" ,"przybliżeniu"));
        SortowanieZnak.sortowanieListy(((o1, o2) -> Integer.compare(o1.length(), o2.length())),lista);
        for (String napis:lista) System.out.println(napis);
    }



}
