package br.com.factoryMethod;

public class Palio implements Carro{

	@Override
	public void exibirInfo() {
		System.out.println("Modelo: Palio" + System.lineSeparator() + "Fabricante: Fiat");
	}

}
