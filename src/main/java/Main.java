import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        main.run(scanner);
    }

    void run(Scanner scanner) {
        String fileName = "countries.csv";
        Map<String, Country> countryMap = null;
        try {
            countryMap = Tools.createCountryMap(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku countries.csv.");
            System.exit(0);
        }
        System.out.println("Podaj ID kraju, którego statystki chcesz zobaczyć: ");
        String countryId = scanner.nextLine();
        Tools.showCountryInfo(countryId, countryMap);
    }
}
