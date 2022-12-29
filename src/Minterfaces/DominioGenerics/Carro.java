package Minterfaces.DominioGenerics;

public class Carro {
    private String nome;

    public Carro() {
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
