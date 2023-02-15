public class Country {
    private String countryId;
    private String country;
    private int population;

    public Country(String countryId, String country, int population) {
        this.countryId = countryId;
        this.country = country;
        this.population = population;
    }

    public String getCountryId() {
        return countryId;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }
}
