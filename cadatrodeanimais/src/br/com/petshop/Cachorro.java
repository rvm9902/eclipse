package br.com.petshop;

import br.com.petshop.Animal;

//Carro HERDA de Veiculo
public class Cachorro extends Animal {
	private int portas;

	// Construtor que chama o da superclasse com "super"
	public Cachorro(String nome, int idade, int raca) {
		super(raca, idade);
		this.nome = nome;
	}

	// POLIMORFISMO: Modificando exibirInfo para adicionar quantidade de portas
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("nome: " + nome);
	}
}
