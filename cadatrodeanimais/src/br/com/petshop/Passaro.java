package br.com.petshop;

public class Passaro extends Animal {
    private String corPena;


    public Passaro(String nome, int idade, String corPena) {
        super(nome, idade); 
        this.corPena = corPena;
    }


    public void cantar() {
        System.out.println(getNome() + " estÃ¡ cantando: fiu fiu fiu!");
    }

    
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor das penas: " + corPena);
    }
}