class Main {
    public static void main(String[] args) {

        //Produtos //

        Livro livro1 = new Livro(1, "O Ladrão de raios", 47.68, 9, "Rick Riordan", "Mitologia grega");
        Livro livro2 = new Livro(2, "O Hobbit", 50.90, 8, "J.R.R. Tolkien", "Literatura fantástica");

        HQ hq1 = new HQ(3, "Homem Aranha", 10.47, 15, "Stan Lee", "Super Heróis");
        HQ hq2 = new HQ(4, "Turma da Mônica", 7.30, 12, "Mauricio de Sousa", " ");

        Manga manga1 = new Manga(5, "One Pice", 13.90, 6, "Eiichiro Oda", " ");
        Manga manga2 = new Manga(6, "Naruto", 11.50, 6, "Masashi Kishimoto", " ");

        Curso curso1 = new Curso(7, "Logica de Programação", 60.99, 5, "Mauricio", "");
        Curso curso2 = new Curso(8, "Excel", 19.99, 5, "Juliana", " ");

        Revista revista1 = new Revista(9, "Veja", 8.97,5,"André Lopes", "Informação");
        Revista revista2 = new Revista(10, "Vogue", 35.50,4,"Arthur Baldwin", "Moda");


        //Clientes //

        Cliente cliente1 = new Cliente("Carlos", 123456, "10/05/2000");
        Cliente cliente2 = new Cliente("Rafael", 654321, "15/07/2002");


        //1° Pedido //

        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
        carrinho1.adicionarProduto(livro1);
        carrinho1.adicionarProduto(hq1);
        carrinho1.adicionarProduto(revista1);

        Pedido pedido1 = new Pedido(1, cliente1);
        pedido1.adicionarProduto(livro1);
        pedido1.adicionarProduto(hq1);
        pedido1.adicionarProduto(revista1);

        System.out.println("\n1° Pedido:\n Itens no Carrinho de Compras: " + carrinho1.getItens().size());
        System.out.println("Total do Pedido: R$" + pedido1.calcularTotal());


        //2° Pedido //
    
        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras();
        carrinho2.adicionarProduto(livro2);
        carrinho2.adicionarProduto(manga1);
        carrinho2.adicionarProduto(curso1);

        Pedido pedido2 = new Pedido(2, cliente2);
        pedido2.adicionarProduto(livro1);
        pedido2.adicionarProduto(manga1);
        pedido2.adicionarProduto(curso1);

        System.out.println("\n2° Pedido:\nItens no Carrinho de Compras: " + carrinho2.getItens().size());
        System.out.println("Total do Pedido: R$" + pedido2.calcularTotal());
        
    }
    
}
