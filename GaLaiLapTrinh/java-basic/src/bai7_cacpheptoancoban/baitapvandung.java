package bai7_cacpheptoancoban;

public class baitapvandung {
  public static void main(String[] args) {
    int i1 = 2;
    int i2 = 5;
    int i3 = -3;

    double d1 = 2.0;
    double d2 = 5.0;
    double d3 = -0.5;

    System.out.println("(a) i1+(i2*i3) = " + (i1 + (i2 * i3)));
    System.out.println("(b) i1*(i2+i3) = " + (i1 * (i2 + i3)));
    System.out.println("(c) i1/(i2+i3) = " + ((double) i1 / (i2 + i3)));
    System.out.println("(e) i1/i2+i3 = " + ((double) i1 / i2 + i3));

    int a1 = 3;
    int a2 = 4;
    int a3 = 5;

    System.out.println("(g) 3+4+5/3 = " + (a1 + a2 + (double) a3 / a1));
    System.out.println("(i) (3+4+5)/3 = " + ((double) (a1 + a2 + a3) / a1));
    System.out.println("(k) d1+(d2*d3) = " + (d1 + (d2 * d3)));
    System.out.println("(l) d1+d2*d3 = " + (d1 + d2 * d3));
    System.out.println("(m) d1/d2-d3 = " + ((double) d1 / d2 - d3));
    System.out.println("(n) d1/(d2-d3) = " + ((double) d1 / (d2 - d3)));
    System.out.println("(o) d1+d2+d3/3 = " + (d1 + d2 + (double) d3 / 3));
    System.out.println("(p) (d1+d2+d3)/3 = " + ((double) (d1 + d2 + d3) / 3));
    System.out.println("(q) d1+d2+(d3/3) = " + (d1 + d2 + ((double) d3 / 3)));
    System.out.println("(r) 3*(d1+d2)*(d1-d3) = " + (3 * (d1 + d2) * (d1 - d3)));
  }
}
