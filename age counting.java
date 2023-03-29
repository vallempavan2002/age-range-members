
import java.util.HashMap;

public class PassengerAgeRange {
    public static void main(String[] args) {
        // Create a HashMap to store the age range counts
        HashMap<String, Integer> ageRangeCounts = new HashMap<String, Integer>();
        ageRangeCounts.put("0-10", 0);
        ageRangeCounts.put("10-20", 0);
        ageRangeCounts.put("20-30", 0);
        ageRangeCounts.put("30-40", 0);
        ageRangeCounts.put("40-50", 0);
        ageRangeCounts.put("50+", 0);

        // Passenger information
        String[][] passengers = {{"Jhon", "31"},{"James", "22"}, {"Mary", "19"},{"Pavan", "37"}};

        // Loop through each passenger and update the age range counts
        for (String[] passenger : passengers) {
            int age = Integer.parseInt(passenger[1]);
            if (age >= 0 && age <= 10) {
                ageRangeCounts.put("0-10", ageRangeCounts.get("0-10") + 1);
            } else if (age > 10 && age <= 20) {
                ageRangeCounts.put("10-20", ageRangeCounts.get("10-20") + 1);
            } else if (age > 20 && age <= 30) {
                ageRangeCounts.put("20-30", ageRangeCounts.get("20-30") + 1);
            } else if (age > 30 && age <= 40) {
                ageRangeCounts.put("30-40", ageRangeCounts.get("30-40") + 1);
            } else if (age > 40 && age <= 50) {
                ageRangeCounts.put("40-50", ageRangeCounts.get("40-50") + 1);
            } else {
                ageRangeCounts.put("50+", ageRangeCounts.get("50+") + 1);
            }
        }

        // Print the age range counts
        System.out.println("Age Range Counts:");
        for (String ageRange : ageRangeCounts.keySet()) {
            System.out.println(ageRange + ": " + ageRangeCounts.get(ageRange));
        }
    }
}
