package Minterfaces.dominio;

public interface DataLoader {
    public abstract void load();
     default void checkBancodeDados(){
        System.out.println("Checando Banco de Dados");
    }
}
