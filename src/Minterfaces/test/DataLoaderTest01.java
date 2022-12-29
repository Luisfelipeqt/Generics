package Minterfaces.test;

import Minterfaces.dominio.DatabaseLoader;
import Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();
        fileLoader.checkBancodeDados();
        databaseLoader.checkBancodeDados();
        fileLoader.chegandoRemocao();
        databaseLoader.chegandoRemocao();
    }
}
