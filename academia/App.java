package academia;

public class App {

    public static void main(String[] args) {

		Aluno aluno = new Aluno();
	    aluno.setNome("Josué");
        aluno.setIdade(18);
        aluno.setPlano("Mensal");

        Instrutor instrutor = new Instrutor();
        instrutor.setNome("Michelder");
		instrutor.setIdade(22);
		instrutor.setEspecialidade("Musculação");

		aluno.exibirAluno();
		System.out.println();

		instrutor.exibirInstrutor();
		 System.out.println();

	    instrutor.avaliarAluno(aluno);
		}	
	}
