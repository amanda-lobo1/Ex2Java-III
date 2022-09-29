package carro;

import java.util.List;

public class Garagem {
    protected String id;
    List<Veiculo> listaDeVeiculos;

    public Garagem(String id, List<Veiculo> listaDeVeiculos) {
        this.id = id;
        this.listaDeVeiculos = listaDeVeiculos;
    }
}
