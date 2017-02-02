package hotel;

import java.util.HashMap;

public class Recepcao {

	private HashMap<String, Estadia> estadias = new HashMap<String, Estadia>();
	
	public Recepcao() {

	}
	
	public void CheckIn(String nome, String tipo, int idade, double valor, int dias){
		Animal novoAnimal = new Animal(nome, tipo, idade);
		Estadia novaEstadia = new Estadia(novoAnimal, valor, dias);
		estadias.put(nome, novaEstadia);
	}
	
	public void CheckOut(String nome){
		estadias.remove(nome);
	}
	
	public int getNumDeHospedes(){
		return estadias.size();
	}
	
	public double getLucroTotal(){
		double lucro = 0;
		for(String n:estadias.keySet()){
			Estadia i = estadias.get(n);
			lucro += i.getValor() * i.getDias();
		}
		return lucro;
	}

	@Override
	public String toString() {
		return "Recepcao [estadias=" + estadias + "]";
	}

	
	
}
