import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DocFileVanBan {

  public static void main(String[] args) {
    String filePath = "DATA.in";

    try {
      FileReader fileReader = new FileReader(filePath);

      BufferedReader bufferedReader = new BufferedReader(fileReader);

      String line;

      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

      bufferedReader.close();
    } catch (IOException e) {
      System.out.println("Lỗi đọc tệp: " + e.getMessage());
    }
  }
}