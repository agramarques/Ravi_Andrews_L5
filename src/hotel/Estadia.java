package hotel;

public class Estadia {

	private Animal animal;
	private double valor;
	private int dias;

	public Estadia(Animal animal, double valor, int dias) {

		this.animal = animal;
		this.valor = valor;
		this.dias = dias;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String getTipo() {
		return animal.getTipo();
	}

	public int getIdade() {
		return animal.getIdade();
	}

	public String getNome() {
		return animal.getNome();
	}

	@Override
	public String toString() {
		return animal.getNome() + "," + animal.getTipo() + "," + this.getDias() + " dias com o preço de R$ "
				+ this.getValor();
	}

}
