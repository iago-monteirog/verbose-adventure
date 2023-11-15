package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Professor professor = new Professor();

    professor.setCpf("02624827030");
    professor.setNome("Iago");
    professor.setIdade(23);

    professor.setSalario(6000);

    System.out.println(professor.printPersonData());

    Aluno aluno = new Aluno();

    aluno.setNome("Jose");
    aluno.setCpf("1231231223");
    aluno.setIdade(22);
    aluno.setMatricula("23123");

    System.out.println(aluno.printPersonData());
  }
}
