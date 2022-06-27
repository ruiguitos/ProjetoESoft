package modelo;

import java.awt.event.MouseMotionAdapter;
import java.util.LinkedList;

public class Cliente {

    private String Nome;
    private String Morada;
    private long Nif;
    private long Telemovel;
    private String Mail;
    private Data dataNascimento;
    private LinkedList<Cliente> clientes;

    public Cliente(String nome, String morada, long nif, long telemovel, String mail, Data dataNascimento, LinkedList<Cliente> clientes) {
        Nome = nome;
        Morada = morada;
        Nif = nif;
        Telemovel = telemovel;
        Mail = mail;
        this.dataNascimento = dataNascimento;
        this.clientes = clientes;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getMorada() {
        return Morada;
    }

    public void setMorada(String morada) {
        Morada = morada;
    }

    public long getNif() {
        return Nif;
    }

    public void setNif(long nif) {
        Nif = nif;
    }

    public long getTelemovel() {
        return Telemovel;
    }

    public void setTelemovel(long telemovel) {
        Telemovel = telemovel;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public void ConsultarCliente(Cliente cliente){
       return;
    }
    public void EditarCliente(Cliente cliente){
        return;
    }
    public void TrasacoesCliente(Cliente cliente){
        return;
    }
}

