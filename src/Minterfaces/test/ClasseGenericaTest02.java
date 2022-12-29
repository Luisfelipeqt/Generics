package Minterfaces.test;

import Minterfaces.DominioGenerics.Barco;
import Minterfaces.DominioGenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {

        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcosDisponivel();
        System.out.println("Usando o carro por um mês...");
        barcoRentavelService.retornarBarcosAlugado(barco);

    }
}
