package in.ineuron;
import java.io.*;
import java.io.IOException;
import java.util.*;
public class CSVValueCounter {

    public static void main(String[] args) {
        String csvFile = "your_file.csv"; 
        String csvDelimiter = ",";
        int colIndex = 2; 

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            HashMap<String, Integer> valueCounts = new HashMap<>();

            while ((line = br.readLine()) != null) {
                String[] columns = line.split(csvDelimiter);

                if (colIndex < columns.length) {
                    String colValue = columns[colIndex].trim();

                    valueCounts.put(colValue, valueCounts.getOrDefault(colValue, 0) + 1);
                }
            }

         
            System.out.println("Occurrences of values in col3:");
            for (String value : valueCounts.keySet()) {
                System.out.println(value + ": " + valueCounts.get(value));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}