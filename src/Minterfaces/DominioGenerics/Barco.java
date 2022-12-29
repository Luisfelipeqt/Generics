package Minterfaces.DominioGenerics;

public class Barco {
    private String nome;

    public Barco() {
    }

    public Barco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
