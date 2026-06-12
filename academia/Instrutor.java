package academia;

public class Instrutor extends Pessoa{
     
	private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
	  if(especialidade.isEmpty()) {
		   this.especialidade = especialidade;
	  } else {
		  System.out.println("");
	  }
		this.especialidade = especialidade;
	}
	
	public void exibirInstrutor() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Especialidade: " + getEspecialidade());
    }

    public void avaliarAluno(Aluno aluno) {
        System.out.println(
            "Instrutor " + getNome() +
            " está avaliando o aluno(a) " + aluno.getNome());
  }
}