import java.io.*;

public class ReadFileOutside {
    public static void main(String[] args) {
        try {
            // Give full path of file (outside project folder)
            File file = new File("C:/Users/YourName/Documents/sample.txt");

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            System.out.println("File Content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}