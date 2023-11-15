package exceptions;

public class Exceptions {
  public static void main(String[] args) {
    try {
      validarNumero();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void validarNumero() throws Exception {
    int numero = 10;

    if (numero < 100) {
      throw new Exception("O numero é menor que 100");
    }
  }
}
