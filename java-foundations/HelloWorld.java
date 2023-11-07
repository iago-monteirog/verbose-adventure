// HelloWorld = my class name
// public = access type
// class = class type

public class HelloWorld {
  public static void main(String[] args) {
    int dataTypeInt = 10;
    double dataTypeDouble = 3.14;
    float dataTypeFloat = 3.14f;
    long dataTypeLong = 123123123L;
    String dataTypeString = "Put a text here.";
    boolean dataTypeBoolean = false;

    if (dataTypeInt == 10) {
      // sysout
      System.out.println("Entrou no if do 10");
    } else if (dataTypeInt == 11) {
      System.out.println("Entrou no if do 11");
    } else {
      System.out.println("Entrou no else");
    }

    int startValue = 0;
    while (startValue < 3) {
      System.out.println("O valor inicial e menor que 3");
      startValue++;
    }

    for (int i = 0; i <= 10; i++) {
      System.out.println("O valor doi é: " + i);
    }
  }
}