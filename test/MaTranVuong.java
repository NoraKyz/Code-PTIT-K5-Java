import java.util.Scanner;

public class MaTranVuong {
    public double a[][] = new double[505][505];
    public int bac;

    public MaTranVuong() {

    }

    public MaTranVuong(double a[][], int bac) {
        this.a = a;
        this.bac = bac;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap bac cua ma tran: ");
        this.bac = sc.nextInt();

        for (int i = 0; i < this.bac; i++) {
            System.out.println("Nhap hang thu " + (i + 1) + ": ");
            for (int j = 0; j < this.bac; j++) {
                this.a[i][j] = sc.nextDouble();
            }
        }
    }

    public void output() {
        System.out.println("Ma tran A: ");
        for (int i = 0; i < this.bac; i++) {
            for (int j = 0; j < this.bac; j++) {
                System.out.print(this.a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public MaTranVuong add(MaTranVuong o) {
        double b[][] = new double[505][505];
        for (int i = 0; i < this.bac; i++) {
            for (int j = 0; j < this.bac; j++) {
                b[i][j] = this.a[i][j] + o.a[i][j];
            }
        }
        return new MaTranVuong(b, this.bac);
    }

    public MaTranVuong sub(MaTranVuong o) {
        double b[][] = new double[505][505];
        for (int i = 0; i < this.bac; i++) {
            for (int j = 0; j < this.bac; j++) {
                b[i][j] = this.a[i][j] - o.a[i][j];
            }
        }
        return new MaTranVuong(b, this.bac);
    }

    // Checked
    public MaTranVuong mul(MaTranVuong o) {
        double b[][] = new double[505][505];
        for (int i = 0; i < this.bac; i++) {
            for (int j = 0; j < this.bac; j++) {
                b[i][j] = 0;
                for (int k = 0; k < this.bac; k++) {
                    b[i][j] += this.a[i][k] * o.a[k][j];
                }
            }
        }
        return new MaTranVuong(b, this.bac);
    }

    public MaTranVuong mul(double k) {
        double b[][] = new double[505][505];
        for (int i = 0; i < this.bac; i++) {
            for (int j = 0; j < this.bac; j++) {
                b[i][j] = this.a[i][j] * k;
            }
        }
        return new MaTranVuong(b, this.bac);
    }

    public MaTranVuong maTranChuyenVi() {
        double b[][] = new double[505][505];
        for (int i = 0; i < this.bac; i++) {
            for (int j = 0; j < this.bac; j++) {
                b[i][j] = this.a[j][i];
            }
        }
        return new MaTranVuong(b, this.bac);
    }

    public boolean kiemTraMaTranDoiXung() {
        for (int i = 0; i < this.bac; i++) {
            for (int j = 0; j < this.bac; j++) {
                if (this.a[i][j] != this.a[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Checked
    public double tinhDinhThuc() {
        double det = 0;
        if (this.bac == 1) {
            det = this.a[0][0];
        } else if (this.bac == 2) {
            det = this.a[0][0] * this.a[1][1] - this.a[0][1] * this.a[1][0];
        } else {
            for (int i = 0; i < this.bac; i++) {
                double b[][] = new double[505][505];
                for (int j = 1; j < this.bac; j++) {
                    for (int k = 0; k < this.bac; k++) {
                        if (k < i) {
                            b[j - 1][k] = this.a[j][k];
                        } else if (k > i) {
                            b[j - 1][k - 1] = this.a[j][k];
                        }
                    }
                }
                det += Math.pow(-1, i) * this.a[0][i] * new MaTranVuong(b, this.bac - 1).tinhDinhThuc();
            }
        }

        return det;
    }

    // Checked
    public MaTranVuong timMaTranNghichDao() {
        double[][] b = new double[505][505];

        double det = this.tinhDinhThuc();

        if (det == 0) {
            System.out.println("Khong ton tai ma tran nghich dao");
            return null;
        }

        for (int i = 0; i < this.bac; i++) {
            for (int j = 0; j < this.bac; j++) {
                double c[][] = new double[505][505];
                for (int k = 0; k < this.bac; k++) {
                    for (int l = 0; l < this.bac; l++) {
                        if (k < i && l < j) {
                            c[k][l] = this.a[k][l];
                        } else if (k < i && l > j) {
                            c[k][l - 1] = this.a[k][l];
                        } else if (k > i && l < j) {
                            c[k - 1][l] = this.a[k][l];
                        } else if (k > i && l > j) {
                            c[k - 1][l - 1] = this.a[k][l];
                        }
                    }
                }
                b[i][j] = new MaTranVuong(c, this.bac - 1).tinhDinhThuc() * Math.pow(-1, i + j);
            }
        }

        MaTranVuong mt = new MaTranVuong(b, this.bac).maTranChuyenVi().mul(1 / det);  

        return mt;
    }
}
