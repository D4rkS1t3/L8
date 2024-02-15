import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortowanieTablic {
    /*Wykorzystując interfejs  funkcyjny Comparator<T>napisz metodę sortującą tablicę liczb całkowitych.
    Metoda  compare(T o1,T o2) zwraca liczbę całkowitą zgodnie z funkcją signum  (ujemną, zero  lub  dodatnią)  jeśli
    pierwszy  argument  jest  odpowiednio  (mniejszy, równy, większy) od drugiego. Użyj wyrażenia lambda.
*/
    public static void sortTab(Comparator<Integer> komparator, int[] tablica) {
        int temp=0;int porownanie;

        for (int i = 0; i < tablica.length-1; i++) {
            for (int j = i+1; j < tablica.length; j++) {
                porownanie=komparator.compare(tablica[i],tablica[j]);
                if (porownanie<=0) continue;
                else {
                    temp=tablica[i];
                    tablica[i]=tablica[j];
                    tablica[j]=temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] tablica=new int[]{5,4,3,2,1};
        SortowanieTablic.sortTab(((o1, o2) -> Integer.compare(o1,o2)),tablica);
        for (int i:tablica) System.out.println(i);
    }
}
