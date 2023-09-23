
public class BienDoi {
    public static double PI(double epsilon){
        double pi = 0;
        double i = 1;
        double s = 1;
        while (s > epsilon){
            pi += s;
            i += 2;
            s = 1.0 / i;
        }
        return pi;
    }

    public static void main(String[] args) {
        System.out.println(PI(0.0001));
    }
}
