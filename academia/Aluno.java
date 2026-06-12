package academia;

public class Aluno extends Pessoa{
   
	private String plano;
	
	public String getPlano() {
		return plano;
	}
	 public void setPlano(String plano) {
       if (plano == null || plano.trim().isEmpty()) {
          System.out.printf ("O plano não pode ser vazio.");
     }
      this.plano = plano;
	 }
	  public void exibirAluno() {
	        System.out.println("Nome: " + getNome());
	        System.out.println("Idade: " + getIdade());
	        System.out.println("Plano: " + plano);
	 }
}