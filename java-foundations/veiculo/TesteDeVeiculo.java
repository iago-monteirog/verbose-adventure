package veiculo;

public class TesteDeVeiculo {
  public static void main(String[] args) {
    Veiculo veiculoCarro = new Carro();
    Veiculo veiculoMoto = new Moto();

    veiculoCarro.acelerar();
    veiculoCarro.frear();

    veiculoMoto.acelerar();
    veiculoMoto.frear();
  }
}
