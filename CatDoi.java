import java.util.*;

public class CatDoi {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Integer t;   
      String s;

      t = sc.nextInt();
      sc.nextLine();
      
      while(t-- > 0)
      {
        String result = "";
        Boolean check = false;

        s = sc.nextLine();  

        for(Character c : s.toCharArray()) {
          String tmp = cut(c);
          if(tmp == "null") {
            result = "INVALID";
            break;
          } else {
            result += tmp;
          }
        } 

        if(result == "INVALID") {
          System.out.println(result);
          continue;
        }

        for(Character c : result.toCharArray()) {
          if(c != '0') {
            check = true;
          }
        }

        if(check == false) {
          System.out.println("INVALID");
        } else {
          System.out.println(Long.valueOf(result));
        }
    
      }  

      sc.close();
  }

  public static String cut(Character s) {
    if (s == '0') {
      return "0";
    }

    if (s == '1') {
      return "1";
    }

    if (s == '8') {
      return "0";
    }

    if (s == '9') {
      return "0";
    }

    return "null";
  }
}