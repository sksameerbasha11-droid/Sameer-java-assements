import java.util.HashMap;

public class Population {
    public static void main(String[] args) {

        // Create a HashMap to store place and population
        HashMap<String, Long> population = new HashMap<>();

        // Store population
        population.put("India", 1400000000L);
        population.put("Chennai", 7000000L);

        // Print population
        System.out.println("Population of India: " + population.get("India"));
        System.out.println("Population of Chennai: " + population.get("Chennai"));
    }
}
