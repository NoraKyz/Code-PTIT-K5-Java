import java.util.*;

public class DaThuc {
    int bac;
    int[] heSo;

    public DaThuc() {

    }

    public DaThuc(int bac, int heSo[]) {
        this.bac = bac;
        this.heSo = heSo;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap bac cua da thuc: ");
        this.bac = sc.nextInt();

        this.heSo = new int[bac + 1];
        for (int i = 0; i <= bac; i++) {
            System.out.print("Nhap he so cua x^" + i + ": ");
            this.heSo[i] = sc.nextInt();
        }
    }

    public void output() {
        for (int i = this.bac; i > 0; i--) {
            if (this.heSo[i] != 0) {
                System.out.print(this.heSo[i] + "x^" + i + " + ");
            }
        }

        if (this.heSo[0] != 0) {
            System.out.print(this.heSo[0]);
        }

        System.out.println();
    }

    public int tinhGiaTriTaiX(int x) {
        int res = 0;
        for (int i = 0; i <= this.bac; i++) {
            res += this.heSo[i] * (int) Math.pow(x, i);
        }
        return res;
    }

    public int tinhDaoHamBac1TaiX(int x) {
        int res = 0;
        for (int i = 1; i <= this.bac; i++) {
            res += i * this.heSo[i] * (int) Math.pow(x, i - 1);
        }
        return res;
    }

    public DaThuc add(DaThuc b) {
        int maxBac = Math.max(this.bac, b.bac);
        int[] res = new int[maxBac + 1];
        for (int i = 0; i <= maxBac; i++) {
            if (i <= this.bac && i <= b.bac) {
                res[i] = this.heSo[i] + b.heSo[i];
            } else if (i <= this.bac) {
                res[i] = this.heSo[i];
            } else {
                res[i] = b.heSo[i];
            }
        }
        return new DaThuc(maxBac, res);
    }

    public DaThuc sub(DaThuc b) {
        int maxBac = Math.max(this.bac, b.bac);
        int[] res = new int[maxBac + 1];
        for (int i = 0; i <= maxBac; i++) {
            if (i <= this.bac && i <= b.bac) {
                res[i] = this.heSo[i] - b.heSo[i];
            } else if (i <= this.bac) {
                res[i] = this.heSo[i];
            } else {
                res[i] = -b.heSo[i];
            }
        }
        return new DaThuc(maxBac, res);
    }

    public DaThuc mul(DaThuc b) {
        int maxBac = this.bac + b.bac;
        int[] res = new int[maxBac + 1];
        for (int i = 0; i <= this.bac; i++) {
            for (int j = 0; j <= b.bac; j++) {
                res[i + j] += this.heSo[i] * b.heSo[j];
            }
        }
        return new DaThuc(maxBac, res);
    }
}
