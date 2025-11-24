package br.com.gabriel.cadastro.model;

import java.time.LocalDate;

public class Cliente {
    public int id;
    public String nome;
    public String email;
    public LocalDate dataNascimento;

    public void exibirCliente(){
        System.out.println("ID: " + id);
        System.out.println("NOME: " + nome);
        System.out.println("EMAIL: " + email);
        System.out.println("DATA NASCII: " + dataNascimento);
    }

}

