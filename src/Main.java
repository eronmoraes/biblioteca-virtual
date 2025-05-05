import model.cliente.Cliente;
import model.pedido.Carrinho;
import model.pedido.Pedido;
import model.produtos.*;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        //Produtos //

        Livro livro1 = new Livro(1, "O Ladrão de raios", 47.68, 9, "Rick Riordan");
        Livro livro2 = new Livro(2, "O Hobbit", 50.90, 8, "J.R.R. Tolkien");

        HQ hq1 = new HQ(3, "Homem Aranha", 10.47, 15, "Stan Lee");
        HQ hq2 = new HQ(4, "Turma da Mônica", 7.30, 12, "Mauricio de Sousa");

        Manga manga1 = new Manga(5, "One Pice", 13.90, 6, "Eiichiro Oda");
        Manga manga2 = new Manga(6, "Naruto", 11.50, 6, "Masashi Kishimoto");

        Curso curso1 = new Curso(7, "Logica de Programação", 39.99, 10, "Mauricio");
        Curso curso2 = new Curso(8, "Excel", 19.99, 5, "Juliana");

        Revista revista1 = new Revista(9, "Veja", 8.97,5,"André Lopes");

        Jornal jornal1 = new Jornal(10, "O Tempo", 1.50, 20,"Laura Medioli");

        //Clientes //

        Cliente cliente1 = new Cliente("", "", "");
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome1 = sc.nextLine();
        cliente1.setNome(nome1);

        System.out.println("Insira seu CPF: ");
        String cpf1 = sc.nextLine();
        cliente1.setCpf(cpf1);

        System.out.println("Insira seu Email: ");
        String email1 = sc.nextLine();
        cliente1.setEmail(email1);

        System.out.println("\nEscolha seus model.model.produtos: ");
        System.out.print("1. "); livro1.exibirInfo();
        System.out.print("2. "); livro2.exibirInfo();
        System.out.print("3. "); hq1.exibirInfo();
        System.out.print("4. "); hq2.exibirInfo();
        System.out.print("5. "); manga1.exibirInfo();
        System.out.print("6. "); manga2.exibirInfo();
        System.out.print("7. "); curso1.exibirInfo();
        System.out.print("8. "); curso2.exibirInfo();
        System.out.print("9. "); revista1.exibirInfo();
        System.out.print("10. "); jornal1.exibirInfo();

        Carrinho carrinho1 = new Carrinho();
        Pedido pedido1 = new Pedido();

        while (true) {
            System.out.print("Escolha o produto (1/2/3...) ou digite '0' para finalizar: ");
            int escolha = sc.nextInt();
            if (escolha == 0) {
                break;
            }

            switch (escolha) {
                case 1:
                    carrinho1.adicionarProduto(livro1);
                    pedido1.adicionarProduto(livro1);
                    break;
                case 2:
                    carrinho1.adicionarProduto(livro2);
                    pedido1.adicionarProduto(livro2);
                    break;
                case 3:
                    carrinho1.adicionarProduto(hq1);
                    pedido1.adicionarProduto(hq1);
                    break;
                case 4:
                    carrinho1.adicionarProduto(hq2);
                    pedido1.adicionarProduto(hq2);
                    break;
                case 5:
                    carrinho1.adicionarProduto(manga1);
                    pedido1.adicionarProduto(manga1);
                    break;
                case 6:
                    carrinho1.adicionarProduto(manga2);
                    pedido1.adicionarProduto(manga2);
                    break;
                case 7:
                    carrinho1.adicionarProduto(curso1);
                    pedido1.adicionarProduto(curso1);
                    break;
                case 8:
                    carrinho1.adicionarProduto(curso2);
                    pedido1.adicionarProduto(curso2);
                    break;
                case 9:
                    carrinho1.adicionarProduto(revista1);
                    pedido1.adicionarProduto(revista1);
                    break;
                case 10:
                    carrinho1.adicionarProduto(jornal1);
                    pedido1.adicionarProduto(jornal1);
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
        }

        sc.close();

        System.out.println("\nmodel.model.produtos.pedido.Pedido de " + cliente1.getNome());
        System.out.println("Itens no model.model.produtos.pedido.Carrinho de Compras: " + carrinho1.getItens().size());
        System.out.println("Total do model.model.produtos.pedido.Pedido: R$" + pedido1.calcularTotal());
    }
}
