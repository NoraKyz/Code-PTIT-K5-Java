import java.io.File;
import java.io.IOException;
import java.util.*;

class WordSet {
  private Set<String> mySet = new TreeSet<>();

  public WordSet(String s) throws IOException {
    Scanner sc = new Scanner(new File(s));
    while (sc.hasNext())
      mySet.add(sc.next().toLowerCase());
  }

  @Override
  public String toString() {
    String res = "";
    for (String i : mySet)
      res += i + "\n";
    return res;
  }
}

public class LietKeTuKhacNhau {

  public static void main(String[] args) throws IOException {
    WordSet ws = new WordSet("VANBAN.in");
    System.out.println(ws);
  }
}