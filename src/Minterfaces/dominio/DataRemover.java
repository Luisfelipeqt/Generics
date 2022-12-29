package Minterfaces.dominio;

public interface DataRemover {
    public abstract void remove();
    default void chegandoRemocao(){
        System.out.println("Chegando remoção na interface.");
    }
}
