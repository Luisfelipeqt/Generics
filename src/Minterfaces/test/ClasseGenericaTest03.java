package Minterfaces.test;

import Minterfaces.DominioGenerics.Barco;
import Minterfaces.DominioGenerics.Carro;
import Minterfaces.DominioGenerics.service.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {

         List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
         List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
         RentavelService<Carro> rentalService = new RentavelService<>(carrosDisponiveis);
         Carro carro = rentalService.buscarObjetoDisponivel();
         System.out.println("Usando o carro por um mês...");
         rentalService.retornarObjetoAlugado(carro);

        System.out.println("------------------------------------");

        RentavelService<Barco> rentalServiceBarco = new RentavelService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);


    }
}
