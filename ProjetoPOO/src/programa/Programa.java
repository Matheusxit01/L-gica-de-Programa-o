package programa;

public class  Programa {

	public static void main(String[] args) {
		 Garrafa g1 = new Garrafa();
				
		 g1.marca = "TermicaX";
		 g1.capacidade = 500;
		 g1.material = "Plastico";
				
		 g1.abrir();
		 g1.mostrarEstado();
	 }

}

class Garrafa {
	String marca;
	double capacidade;
	String material;
	boolean tampaAberta;
			
	void abrir() {
		tampaAberta = true;
		System.out.println("A garrafa foi aberta.");
	}
			
	void fechar() {
		tampaAberta = false;
	    System.out.println("A garrafa foi fechada.");
	}
			
	void mostrarEstado() {
	    System.out.println("Marca: " + marca);
		System.out.println("Capacidade: " + capacidade + " ml");
		System.out.println("Material: " + material);
		System.out.println("Tampa aberta: " + tampaAberta);			
				
	}
			
}
