package br.com.petshop;

import java.util.ArrayList;
import java.util.Scanner;

 public class Petshop {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			ArrayList<Animal> animais = new ArrayList<>();
			int opcao;
		
			
			do {
			
				System.out.println("\n===MENU===");
				System.out.println("1- Cadastrar Cachorro");
				System.out.println("2- Cadastrar Gato");
				System.out.println("3- Cadastrar Passaro");
				System.out.println("4- Exibir Animais");
				System.out.println("5- Sair");
				System.out.println("Escola uma opção");
				opcao = scanner.nextInt();
				scanner.nextLine(); 
				
				switch(opcao) {
				case 1:
						System.out.println("Nome do cachorro:");
						String nomeCachorro = scanner.nextLine();
						System.out.println("Idade do cachorro:");
						int idadeCachorro = scanner.nextInt();
						scanner.nextLine();
						System.out.println("Raca do cachorro:");
						String raca = scanner.nextLine();
						animais.add(new Cachorro(nomeCachorro, idadeCachorro, raca));
						System.out.println("Cachorro cadastrado com sucesso.");
						break;
					
			
			case 2:
				System.out.println("Nome do gato: ");
				String nomeGato = scanner.nextLine();
				System.out.println("Idade do gato: ");
				int idadeGato = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Cor do pelo do gato: ");
				String corDoPelo = scanner.nextLine();
				animais.add(new Gato(nomeGato, idadeGato, corDoPelo));
				System.out.println("Gato cadastrado com sucesso!");
				break;
					
				
			case 3:
			    System.out.println("Nome do Passaro: ");
				String nomePassaro = scanner.nextLine();
				System.out.println("Idade do Passaro: ");
				int idadePassaro = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Cor das penas do Passaro: ");
				String corDapena = scanner.nextLine();
				animais.add(new Passaro(nomePassaro, idadePassaro, corDapena));
				System.out.println("Passaro cadastrado com sucesso!");
				break;
				
				
			case 4:
				System.out.println("\nLista de Animais");
				for(Animal animal : animais )
					animal.exibirInfo();
					break;
				
				
					
				case 5:
					System.out.println("Voltar ao MENU...");
					break;
					default:
					System.out.println("Opção invalida! Tente novamente.");
					break;
				}
			} 
			while(opcao != 5);
		}
	}
 }