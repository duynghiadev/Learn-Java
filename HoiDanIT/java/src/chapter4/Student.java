package chapter4;

public class Student {
  // class attribute
  String name;
  int age;

//  public Student() {
//
//  }

  public Student(String name1, int age1) {
    this.name = name1; // name1 là value, this.name là biến mà mình đã khai báo ở trên
    this.age = age1; // age1 là value, this.age là biến mà mình đã khai báo ở trên
  }

  // class method
  private void learnJava() {
    System.out.println("Learn Java with youtube Hỏi Dân IT");
  }

  String getAge() {
    return "Duy Nghia Dev";
  }
}
