import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tools {
    public static void showCountryInfo(String countryId, Map<String, Country> countryMap) {
        if (countryMap.get(countryId) == null) {
            System.out.println("Kod kraju <" + countryId + "> nie został znaleziony.");
            return;
        }
        Country country = countryMap.get(countryId);
        System.out.println(country.getCountry() + " (" + country.getCountryId() + ") " + country.getPopulation());
    }

    public static Map<String, Country> createCountryMap(String fileName) throws FileNotFoundException {
        Map<String, Country> countryMap = new HashMap<>();
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            int population = Integer.parseInt(split[2]);
            countryMap.put(split[0], new Country(split[0], split[1], population));
        }
        return countryMap;
    }
}
