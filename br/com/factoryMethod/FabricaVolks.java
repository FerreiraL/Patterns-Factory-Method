package br.com.factoryMethod;

public class FabricaVolks implements FabricaDeCarro{

	@Override
	public Carro criarCarro() {
		return new Gol();
	}

}
