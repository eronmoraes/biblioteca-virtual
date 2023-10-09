class Main {
    public static void main(String[] args) {

        Produto prod1 = new Produto(1, "teste", "teste", 50, 1, "teste", "teste");

        System.out.println(prod1.getNome());
        System.out.println(prod1.getIdProduto());


        Livro liv1 = new Livro(2, "Ladrão de Raio", "aaaaa", 20.99, 5, "Aventura", "Rede", "Jeck");

        System.out.println(liv1.getNome());
        System.out.println(liv1.getIdProduto());


        Funcionario func1 = new Funcionario("Carlos", 123456, "12/02/1990", 1, "Gerente");

        System.out.println(func1.getNome());
        System.out.println(func1.getId());

        Cliente clinte1 = new Cliente("Bruno", 123456, "27/12/2002");

        System.out.println(clinte1.getNome());
        System.out.println(clinte1.getCpf());
        clinte1.exibirInfo();
    
    }
}
