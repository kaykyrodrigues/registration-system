package com.kayky.registrationsystem.sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        obterMenu(scan);
    }

    public static void obterMenu(Scanner scan) {
        boolean validarEntrada = false;
        int opc;
        int id;
        int qntdProdutos;
        ArrayList<Produto> listaDeProdutos = null;

        while (!validarEntrada) {

            System.out.println("======= MENU DE PRODUTOS =======");
            System.out.println("[0] - Cadastrar");
            System.out.println("[1] - Listar");
            System.out.println("[2] - Buscar");
            System.out.println("[3] - Remover");
            System.out.println("[4] - Sair");
            opc = scan.nextInt();
            scan.nextLine();

            try {

                if (opc != 0 && opc != 1 && opc != 2 && opc != 3 && opc != 4) {
                    System.out.println("OPÇÃO INVÁLIDA.");
                    validarEntrada = true;
                }


                if (opc == 0) {
                    System.out.println("Quantos produtos deseja cadastrar?");
                    qntdProdutos = scan.nextInt();
                    scan.nextLine();
                    listaDeProdutos = Produto.cadastrarProduto(scan, qntdProdutos);
                }

                if (opc == 1) {
                    System.out.println();
                    if (listaDeProdutos == null) {
                        System.out.println("Lista de produtos vazia.");
                    } else {
                        System.out.println(listaDeProdutos);
                    }
                    System.out.println();
                }

                if (opc == 2) {
                    System.out.println();
                    System.out.println("Digite o ID para buscar o produto:");
                    id = scan.nextInt();
                    System.out.println(listaDeProdutos.get(id));
                    System.out.println();
                }

                if (opc == 3) {
                    System.out.println();
                    System.out.println("Digite o ID para remover o produto:");
                    id = scan.nextInt();
                    System.out.println("[REMOVIDO] - " + listaDeProdutos.remove(id));
                    System.out.println();
                }

                if (opc == 4) {
                    System.out.println("ENCERRANDO MENU...");
                    break;
                }

            } catch (Exception e) {
                System.out.println("Ação não realizada:" + e);
            }
        }
    }
}
