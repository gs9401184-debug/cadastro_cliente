package br.com.gabriel.cadastro.ui;

import java.util.Scanner;

public class CadastroUI {

    public int opcao;

    public void criarMenu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("CADASTRO DE CLIENTES");
        System.out.println("-------------------------");
        System.out.println("1- Cadastrar");
        System.out.println("2- Listar todos");
        System.out.println("3- Exibir cliente");
        System.out.println("4- Excluir cliente");
        System.out.println("5- Atualizar cliente");
        System.out.println("6- Sair");
        System.out.println("-------------------------");
        System.out.println();
        System.out.print("Escolha uma opcao (1-6): ");

        opcao = sc.nextInt();

        switch (opcao) {
            case 1:

                break;
            case 2:
                System.out.println("listar todos");
                break;
            case 3:
                System.out.println("Exibir cliente");
                break;
            case 4:
                System.out.println("Excluir cliente");
                break;
            case 5:
                System.out.println("Atualizar cliente");
                break;
            case 6:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção invalida! Escolha entre 1 e 6 somente!");
                criarMenu();
                break;

        }
    }

    private void cadastrarCliente() {


    }

}
