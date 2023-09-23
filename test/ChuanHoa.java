import java.util.*;

public class ChuanHoa {
    public String xau;

    public void input() {
        Scanner sc = new Scanner(System.in);
        this.xau = sc.nextLine().trim().toLowerCase();
    }

    public void output() {
        System.out.println(this.xau);
    }

    public String chuanHoaTenTiengViet() {
        String res = "";
        String[] s = this.xau.split(" ");

        for (String it : s) {
            res += it.toUpperCase().charAt(0) + it.substring(1) + " ";
        }

        return res.trim();
    }

    public String chuanHoaTenTiengAnh() {
        String res = "";
        String[] s = this.xau.split(" ");

        for (int i = 1; i < s.length; i++) {
            res += s[i].toUpperCase().charAt(0) + s[i].substring(1) + " ";
        }
        res = res.trim();

        res += ", ";

        res += s[0].toUpperCase();

        return res;
    }

    public String taoDiaChiEmail() {
        String res = "";
        String[] s = this.xau.split(" ");

        res += s[s.length - 1];

        for (int i = 0; i < s.length - 1; i++) {
            res += s[i].substring(0, 1);
        }

        res += "@ptit.edu.vn";

        return res;
    }
}
