import java.util.*;

public class MaTranChuNhat {
    public double a[][] = new double[505][505];
    public int row, col;

    public MaTranChuNhat() {

    }

    public MaTranChuNhat(double a[][], int row, int col) {
        this.a = a;
        this.row = row;
        this.col = col;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so hang: ");
        this.row = sc.nextInt();
        System.out.println("Nhap so cot: ");
        this.col = sc.nextInt();

        for (int i = 0; i < this.row; i++) {
            System.out.println("Nhap hang thu " + (i + 1) + ": ");
            for (int j = 0; j < this.col; j++) {
                this.a[i][j] = sc.nextDouble();
            }
        }
    }

    public void output() {
        System.out.println("Ma tran A: ");
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(this.a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void tinhTongTungHang() {
        for (int i = 0; i < this.row; i++) {
            double sum = 0;
            for (int j = 0; j < this.col; j++) {
                sum += this.a[i][j];
            }
            System.out.println("Tong hang thu " + (i + 1) + " la: " + sum);
        }
    }
    // Checked
    public void hangHoacCotCoTongLonNhat() {
        double res = Double.MIN_VALUE;
        double sumCol[] = new double[505];
        double sumRow[] = new double[505];

        for (int i = 0; i < this.row; i++) {
            double sum = 0;
            for (int j = 0; j < this.col; j++) {
                sum += this.a[i][j];
            }
            sumRow[i] = sum;
            res = Math.max(res, sum);
        }

        for (int i = 0; i < this.col; i++) {
            double sum = 0;
            for (int j = 0; j < this.row; j++) {
                sum += this.a[j][i];
            }
            sumCol[i] = sum;
            res = Math.max(res, sum);
        }

        for (int i = 0; i < this.row; i++) {
            if (sumRow[i] == res) {
                System.out.println("Hang co tong lon nhat la: " + (i + 1));
            }
        }

        for (int i = 0; i < this.col; i++) {
            if (sumCol[i] == res) {
                System.out.println("Hang co tong lon nhat la: " + (i + 1));
            }
        }
    }
    // Checked
    public boolean kiemTraMaTranCon(MaTranChuNhat b){
        if (this.row < b.row || this.col < b.col) {
            return false;
        }

        for (int i = 0; i <= this.row - b.row; i++) {
            for (int j = 0; j <= this.col - b.col; j++) {
                boolean check = true;
                for (int k = 0; k < b.row; k++) {
                    for (int l = 0; l < b.col; l++) {
                        if (this.a[i + k][j + l] != b.a[k][l]) {
                            check = false;
                            break;
                        }
                    }
                    if (!check) {
                        break;
                    }
                }
                if (check) {
                    return true;
                }
            }
        }

        return false;
    }

    public MaTranChuNhat maTranChuyenVi() {
        double b[][] = new double[505][505];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                b[j][i] = this.a[i][j];
            }
        }

        return new MaTranChuNhat(b, this.col, this.row);
    }
}