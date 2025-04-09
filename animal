package br.com.petshop;

public class Animal {
	private static int contadorId = 1; // ID autoincremental
	private String nome;
	private String raca;
	private int idade;

	public Animal(String nome, int idade, String raca) {
		this.idade = contadorId++; // Cada veículo terá um ID único
		this.raca = raca;
		this.nome = nome;
	}

	public String getnome() {
		return nome;
	}

	public int getidade() {
		return idade;
	}

	public String getraca() {
		return raca;
	}

	public void exibirInfo() {
		System.out.println("Nome: " + nome + " | Raca: " + raca + ", idade: " + idade);
	}
}
