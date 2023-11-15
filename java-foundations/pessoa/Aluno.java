package pessoa;

public class Aluno extends Pessoa {
  private String matricula;

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  String printPersonData() {
    System.out.println(super.printPersonData());
    return "Você é aluno.";
  }

}
