package firstClasses;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {
  public static void main(String[] args) {
    Set<Integer> numbers = new HashSet<>();

    numbers.add(10);
    numbers.add(11);
    numbers.add(12);
    numbers.add(13);

    // numbers.remove(12);

    // for (Integer element : numbers) {
    // System.out.println(element);
    // }
    boolean hasNumber = numbers.contains(13);
    System.out.println(hasNumber);
  }
}
