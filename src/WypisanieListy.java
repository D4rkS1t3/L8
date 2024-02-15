import java.util.ArrayList;
import java.util.Arrays;

public interface WypisanieListy {
    void metoda(String lancuch);
}

class Ain {
    public static void wypiszElementy(ArrayList<String> tab, WypisanieListy inter) {
        for (String napis : tab) {
            inter.metoda(napis);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> przedmioty = new ArrayList<>(Arrays.asList("informatyka", "angielski", "polski", "matematyka"));

        wypiszElementy(przedmioty, napis -> System.out.println(napis));
    }
}
