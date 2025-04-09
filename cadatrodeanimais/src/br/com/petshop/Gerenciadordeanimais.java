package br.com.petshop;

public class Gereniadordeanimais {

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe responsável por gerenciar  veículos
 public class Gerenciadordeanimais {
	private List<Animal> listaAnimal; // Lista para armazenar os veículos
	private Scanner scanner;

	// Construtor da classe
	public Gerenciadordeanimais() {
		this.listaanimal = new ArrayList<>();
		this.scanner = new Scanner(System.in);
	}

	// Método para cadastrar um carro
	public void cadastrarcachoro() {
		System.out.print("Digite a raca do cachorro: ");
		String raca = scanner.nextLine();
		System.out.print("Digite a idade do cachorro: ");
		int idade = scanner.nextInt();
		System.out.print("Digite o nome: ");
		int nome = scanner.nextInt();
		scanner.nextLine(); // Limpa o buffer

		cachorro chachorro = new Cachorro(raca, idade, nome);
		listaCachorro.add(cachorrp);
		System.out.println("✅ Cachorro cadastrado com sucesso!");
	}

	// Método para cadastrar uma moto
	public void cadastrarGato() {
		System.out.print("Digite a raca do gato: ");
		String raca = scanner.nextLine();
		System.out.print("Digite a idade do gato: ");
		int idade = scanner.nextInt();
		System.out.print("digite o nome do gato ");
		scanner.nextLine(); // Limpa o buffer

		Gato gato = new gato(raca, idade, nome);
		listaAnimais.add(gato);
		System.out.println("✅ Gato cadastrada com sucesso!");
	}

	// Método para cadastrar um caminhão
	public void cadastrarPassaro() {
		System.out.print("Digite a raca do Passaro: ");
		String raca = scanner.nextLine();
		System.out.print("Digite a idade do Passaro: ");
		int idade  = scanner.nextInt();
		System.out.print("Digite o nome do Passaro: ");
		int nome = scanner.nextInt();
		scanner.nextLin	e(); // Limpa o buffer

		Passaro passaro = new passaro(raca, idade, nome);
		listaPassaro.add(passaro);
		System.out.println("✅ Passaro cadastrado com sucesso!");
	}
	
	// Método para exibir todos os veículos cadastrados
	public void exibirAnimais() {
		if (listaAnimal.isEmpty()) {
			System.out.println("⚠ Nenhum animal cadastrado!");
		} else {
			System.out.println("\n LISTA DE ANIMAIS CADASTRADOS ");
			for (Animal v : listaanimal) {
				v.exibirInfo();
				System.out.println("--------------------------");
			}
		}
	}

	// Método para localizar um veículo por marca
	public void localizarAnimal() {
		System.out.print("Digite o nome do Animal que deseja localizar: ");
		String busca = scanner.nextLine();
		boolean encontrado = false;

		System.out.println("\n🔎 RESULTADO DA BUSCA:");
		for (Animal v : listaAnimal) {
			if (v.getMarca().equalsIgnoreCase(busca)) {
				v.exibirInfo();
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("⚠ Nenhum Animal encontrado com a nome '" + busca + "'.");
		}
	}
}