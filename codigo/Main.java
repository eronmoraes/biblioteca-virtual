class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro(1, "Ladrão de Raio", 20.90, 5, "Aventura", "Rede", "Jeck");

        livro1.exibirInfo();

        Revista revista1 = new Revista(2, "Veja", 10.90, 7, "", "");

        revista1.exibirInfo();

        HQ hq1 = new HQ(3, "Turma da Monica", 10.00, 10, "", "Mauricio de Sousa Editora", "Mauricio de Sousa");

        hq1.exibirInfo();

        Jornal jornal1 = new Jornal(4, "Super", 2.50, 20, "", "Super");

        jornal1.exibirInfo();

        Manga manga1 = new Manga(5, "Teste", 5.00, 6, "Aventura", "", "Jeck");

        manga1.exibirInfo();

        Curso curso1 = new Curso(6, "Logica de Programação", 20.99, 5, "", "", "Mauricio");

        curso1.exibirInfo();

        Cliente clinte1 = new Cliente("Carlos", 654321, "10/05/2000");

        clinte1.exibirInfo();

        Funcionario func1 = new Funcionario("Bruno", 123456, "27/12/2002", 1, "Gerente");

        func1.exibirInfo();

    }
    
}
