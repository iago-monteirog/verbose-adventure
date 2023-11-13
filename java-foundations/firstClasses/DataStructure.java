package firstClasses;

import java.util.ArrayList;
import java.util.List;

public class DataStructure {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();

    names.add("Iago");
    names.add("Dani");
    names.add("Vini");
    names.add("Ana");

    // System.out.println(names.get(2));

    // for (String name : names) {
    // System.out.println("O nome é " + name);
    // }

    names.forEach(name -> System.out.println("The name is: " + name));
  }
}
