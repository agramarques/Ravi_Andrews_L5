package hotel;

import java.util.ArrayList;

public class Recepcao {

	private HashMap<String, Estadias> estadias;
	
	public Recepcao() {
		estadias = new HashMap();
	
	}
	
	public void CheckIn(String nome, String tipo, int idade, double valor, int dias){
		Animal novoAnimal = new Animal(tipo, idade, nome);
		Estadia novaEstadia = new Estadia(novoAnimal, valor, dias);
		estadias.put(nome, novaEstadia);
	}
	
	public void CheckOut(String nome){
		estadias.remove(nome);
	}
	
}
