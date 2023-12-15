public class bai2_xuatdulieu {
  public static void main(String[] args) {
    /**
     * - dòng này in ra và xuống hàng. Do có sử dụng println
     * - Tóm lại thì khi kết thúc câu lệnh thì con trỏ chuột nó sẽ xuống hàng, và in ra từng hàng, và mỗi
     * dòng in đó nó sẽ xuống hàng
     */
    System.out.println("dòng 1");
    System.out.println("dòng 2");
    System.out.println("dòng 3");

    /**
     * - dòng này in ra và không xuống hàng -> nằm trên 1 hàng. Do có sử dụng print
     * - Tóm lại thì khi kết thúc câu lệnh thì con trỏ chuột nó sẽ không xuống hàng, mà trỏ đến cuối hàng
     * và ghi chữ tiếp theo vào đó
     */
    System.out.print("dòng 4");
    System.out.print("dòng 5");
    System.out.print("dòng 6");
    System.out.println("\n");

    // Ví dụ về \t
    System.out.println("Cộng hòa xã hội chủ nghĩa Việt Nam");
    System.out.println("\tĐộc lập - Tự do - Hạnh Phúc");

    // \n
    System.out.println("Sông cầu nước chảy lơ thơ\nCó đôi trai gái ngồi hơ quần đùi");

    // dấu nháy "
    System.out.println("Có người nói rằng \"Cho đi là còn mãi\"");
  }
}
