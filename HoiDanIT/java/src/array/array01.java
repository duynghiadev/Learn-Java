package array;

import java.util.Arrays;

public class array01 {
  public static void main(String[] args) {
    String[] clubs = { "MU", "Mancity", "Liverpool" };
    System.out.println(Arrays.toString(clubs));

    System.out.println("============================");

    int[] group = { 5, 10, 1, 4, 6 };
    System.out.println("group: " + group);

    Arrays.sort(group);
    System.out.println("group sort: " + Arrays.toString(group));

    System.out.println("============================");

    int[] team = { 5, 8, 7, 6, 33, 87 };
    for (int i = 0; i < team.length - 1; i++) {
      for (int j = i + 1; j < team.length; j++) {
        if (team[i] > team[j]) {
          int temp = team[i];
          team[i] = team[j];
          team[j] = temp;
        }
      }
    }
    System.out.println("Arrays.toString(team) sorted: " + Arrays.toString(team));
  }
}
