package com.kayky.registrationsystem.sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    Scanner scan = new Scanner(System.in);

    private String nome;
    private String marca;

    private int id;
    public static int cont = -1;

    public Produto() {
        cont++;
        this.id = cont;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public static ArrayList<Produto> cadastrarProduto(Scanner scan, int quant) {
        String nome;
        String marca;

        ArrayList<Produto> produtos = new ArrayList<Produto>();

        for(int i=0; i<quant; i++) {
            Produto produto = new Produto();

            System.out.println("[PRODUTO " + (i) + "]:");

            System.out.println("- NOME:");
            nome = scan.nextLine();
            System.out.println("- MARCA:");
            marca = scan.nextLine();

            produto.setNome(nome);
            produto.setMarca(marca);

            produtos.add(produto);
        }

        return produtos;
    }

    @Override
    public String toString() {
        return "PRODUTO: " + "{ID: " + id +
                ", NOME='" + nome + '\'' +
                ", MARCA='" + marca + '\'' +
                '}';
    }
}