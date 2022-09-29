package carro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> listaDeVeiculos = new ArrayList<>();

        listaDeVeiculos.add(new Veiculo("Fiesta", "Ford", 1000));
        listaDeVeiculos.add(new Veiculo("Focus", "Ford", 1200));
        listaDeVeiculos.add(new Veiculo("Explorer", "Ford", 2500));
        listaDeVeiculos.add(new Veiculo("Uno", "Fiat", 500));
        listaDeVeiculos.add(new Veiculo("Cronos", "Fiat", 1000));
        listaDeVeiculos.add(new Veiculo("Torino", "Fiat", 1250));
        listaDeVeiculos.add(new Veiculo("Aveo", "Chevrolet", 1250));
        listaDeVeiculos.add(new Veiculo("Spin", "Chevrolet", 2500));
        listaDeVeiculos.add(new Veiculo("Corola", "Toyota", 1200));
        listaDeVeiculos.add(new Veiculo("Fortuner", "Toyota", 3000));
        listaDeVeiculos.add(new Veiculo("Logan", "Renault", 950));

        System.out.println("Todos os veiculos:");
        listaDeVeiculos.forEach(System.out::println);

        System.out.println("\nVeiculos ordenados por preço crescente:");
        listaDeVeiculos.stream()
                .sorted(Comparator.comparing(Veiculo::getPreco))
                .forEach(System.out::println);

        System.out.println("\nVeiculos ordenados por marca:");
        listaDeVeiculos.stream()
                .sorted(Comparator.comparing(Veiculo::getMarca))
                .forEach(System.out::println);

        System.out.println("\nVeiculos com preço não superior a $1000:");
        listaDeVeiculos.stream()
                .filter(veiculo -> veiculo.getPreco()<1000)
                .forEach(System.out::println);

        System.out.println("\nVeiculos com preço maior ou igual a $1000:");
        listaDeVeiculos.stream()
                .filter(veiculo -> veiculo.getPreco()>=1000)
                .forEach(System.out::println);

        System.out.println("\nMédia de preço dos veiculos:");
        double mediaPreco = listaDeVeiculos.stream()
                .mapToDouble(veiculo -> veiculo.getPreco())
                .average().getAsDouble();
        System.out.println(mediaPreco);
    }
}
