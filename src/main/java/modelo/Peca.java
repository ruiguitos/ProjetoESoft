package modelo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Peca {
    private String nome;
    private boolean tipo;
    private ArrayList<Marca> marcas;
    private ArrayList<Filiar> filiais;
    private int quantidade;
    private ArrayList<Peca> pecas;


    public Peca(String nome, boolean tipo, ArrayList<Marca> marcas, ArrayList<Filiar> filiais, int quantidade, ArrayList<Peca> pecas) {
        this.nome = nome;
        this.tipo = tipo;
        this.marcas = marcas;
        this.filiais = filiais;
        this.quantidade = quantidade;
        this.pecas = pecas;
    }

    public String getNome() {
        return nome;
    }

    public boolean isTipo() {
        return tipo;
    }

    public ArrayList<Marca> getMarcas() {
        return marcas;
    }

    public ArrayList<Filiar> getFiliais() {
        return filiais;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public ArrayList<Peca> getPecas() {
        return pecas;
    }
}
