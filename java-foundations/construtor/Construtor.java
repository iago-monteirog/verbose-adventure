package construtor;

public class Construtor {
  private int numero;
  private String texto;

  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Construtor(int numero, String texto) {
    this.numero = numero;
    this.texto = texto;
  }

}
