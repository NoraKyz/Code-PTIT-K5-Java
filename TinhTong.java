import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TinhTong {

    public static void main(String[] args) {
        String filePath = "DATA.in";

        try {
            FileReader fileReader = new FileReader(filePath);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            long sum = 0;

            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(" ");

                for (String word : words) {
                    try {
                        int number = Integer.parseInt(word);
                        sum += number;
                    } catch (NumberFormatException e) {
                        
                    }
                }
            }

            System.out.println(sum);

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc tệp: " + e.getMessage());
        }
    }
}