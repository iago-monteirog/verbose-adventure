package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();

    pessoa.cpf = "02624827030";
    pessoa.nome = "Iago";
    pessoa.idade = 23;

    System.out.println(pessoa.printPersonData());
  }
}
