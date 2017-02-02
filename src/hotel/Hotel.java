package hotel;

public class Hotel {

	private Recepcao recepcao;

	public Hotel() {
		recepcao = new Recepcao();
	}

	public void CheckIn(String nome, String tipo, int idade, double valor, int dias) {
		recepcao.CheckIn(nome, tipo, idade, valor, dias);
	}

	public void CheckOut(String nome) {
		recepcao.CheckOut(nome);
	}

	public int getNumDeHospedes() {
		return recepcao.getNumDeHospedes();
	}

	public double getLucroTotal() {
		return recepcao.getLucroTotal();
	}

	public String toString() {
		return recepcao.toString();
	}
	
	
}
