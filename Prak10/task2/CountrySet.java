import java.util.HashSet;
import java.util.Set;

public class CountrySet {

    private static final String COUNTRY_INDONESIA = "Indonesia";
    private static final String COUNTRY_JAPAN = "Jepang";
    private static final String COUNTRY_GERMANY = "Jerman";
    private static final String COUNTRY_BRAZIL = "Brasil";
    private static final String COUNTRY_CANADA = "Kanada";

    public static void main(String[] args) {
        Set<String> countrySet = new HashSet<>();
        populateCountrySet(countrySet);
        displaySetDetails(countrySet);
    }

    private static void populateCountrySet(Set<String> countrySet) {
        addCountryAndPrintResult(countrySet, COUNTRY_INDONESIA);
        addCountryAndPrintResult(countrySet, COUNTRY_JAPAN);
        addCountryAndPrintResult(countrySet, COUNTRY_GERMANY);
        addCountryAndPrintResult(countrySet, COUNTRY_BRAZIL);
        addCountryAndPrintResult(countrySet, COUNTRY_CANADA);
        addCountryAndPrintResult(countrySet, COUNTRY_JAPAN);
    }

    private static void addCountryAndPrintResult(Set<String> countrySet, String countryName) {
        boolean isAdded = countrySet.add(countryName);
        System.out.println("Hasil add(" + countryName + ") : " + isAdded);
    }

    private static void displaySetDetails(Set<String> countrySet) {
        System.out.println("Daftar negara dalam Set : " + countrySet);
        System.out.println("Ukuran akhir Set        : " + countrySet.size());
    }
}
