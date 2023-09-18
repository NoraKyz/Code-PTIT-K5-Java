import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class XauConLonNhat {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s = br.readLine();
    
    String res = "";
    int max = s.charAt(s.length() - 1);

    for(int i = s.length() - 1; i >= 0; i--) {
      max = Math.max(max, s.charAt(i));
      if(max == s.charAt(i)) {
        res = s.charAt(i) + res;
      }
    }

    System.out.println(res);
  }
}