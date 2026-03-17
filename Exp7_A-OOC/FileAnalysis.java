import java.io.*;

public class FileAnalysis {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("sample.txt"));

            String line;
            int vowels = 0, words = 0, countA = 0;

            while ((line = br.readLine()) != null) {

                // Count words
                String[] w = line.split("\\s+");
                words += w.length;

                for (char ch : line.toLowerCase().toCharArray()) {
                    // Count vowels
                    if ("aeiou".indexOf(ch) != -1) {
                        vowels++;
                    }
                    // Count 'a'
                    if (ch == 'a') {
                        countA++;
                    }
                }
            }

            br.close();

            System.out.println("Total Vowels: " + vowels);
            System.out.println("Total Words: " + words);
            System.out.println("Count of 'a': " + countA);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}