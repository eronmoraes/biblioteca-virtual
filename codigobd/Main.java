import src.config.ConexaoBanco;

import java.sql.SQLException;
import java.sql.ResultSet;

class Main {
    public static void main(String[] args) {

        ConexaoBanco bd01 = new ConexaoBanco();

        bd01.Conectar();

       /* bd01.CriarTabelaProdutos();
          bd01.CriarTabelaPessoas();

          bd01.InserirProduto("O Ladrão de raios", 47.68, 9, "Rick Riordan", "Livro");
          bd01.InserirProduto("O Hobbit", 50.90, 8, "J.R.R. Tolkien", "Livro");

          bd01.InserirProduto("Homem Aranha", 10.47, 15, "Stan Lee", "HQ");
          bd01.InserirProduto("Turma da Mônica", 7.30, 12, "Mauricio de Sousa", "HQ");

          bd01.InserirProduto("One Pice", 13.90, 6, "Eiichiro Oda", "Manga");
          bd01.InserirProduto("Naruto", 11.50, 6, "Masashi Kishimoto", "Manga");

          bd01.InserirProduto("Logica de Programação", 39.99, 10, "Mauricio", "Curso");
          bd01.InserirProduto("Excel", 19.99, 5, "Juliana", "Curso");

          bd01.InserirProduto("Veja", 8.97,5,"André Lopes", "Revista");

          bd01.InserirProduto("O Tempo", 1.50, 20,"Laura Medioli", "Jornal");

          bd01.InserirPessoa("241.065.776-15", "Rafael Silva", "05/01/1995", "rafael_silva@gmail.com", "Avenida Coronel Teixeira 202, Belo Horizonte-MG", "");
          bd01.InserirPessoa("208.953.776-08", "Gabriel Menezes", "10/07/1990", "", "", "Repositor");
          bd01.InserirPessoa("493.111.636-19", "Laura Cavalcanti", "17/10/2000", "laura_cav@gmail.com", "Rua Colina de Goiás 132, Contagem-MG", "");
          bd01.InserirPessoa("195.871.716-91", "Julia Moraes", "20/02/1998", "", "", "Assistente");

          bd01.AtualizarProduto(1, "O Ladrão de raios", 49.90, 20, "Rick Riordan", "Livro");

          bd01.ApagarProduto(1);
          bd01.ApagarProduto(2); */

        try{
            ResultSet rs = bd01.ConsultarProduto();
            System.out.println("\nConsulta de Produtos:\n");
            while(rs.next()){
                System.out.println("ID: " + rs.getInt("Id")
                + " - Nome: " + rs.getString("Nome")
                + " - Autor: " + rs.getString("Autor")
                + " - Estoque: " + rs.getInt("Estoque")
                + " - Preço: " + rs.getDouble("Preco")
                + " - Categoria: " + rs.getString("Categoria")
                + "\n");
            }
        }catch (SQLException e){
            System.out.println("Erro ao consultar os dados!");
        }

        try{
            ResultSet rs = bd01.ConsultarPessoa();
            System.out.println("\nConsulta de Pessoas:\n");
            while(rs.next()){
                System.out.println("CPF: " + rs.getString("CPF")
                        + " - Nome: " + rs.getString("Nome")
                        + " - Data de Nascimento: " + rs.getString("DataNascimento")
                        + " - Email: " + rs.getString("Email")
                        + " - Endereço: " + rs.getString("Endereco")
                        + " - Cargo: " + rs.getString("Cargo")
                        + "\n");
            }
        }catch (SQLException e){
            System.out.println("Erro ao consultar os dados!");
        }
    }
}
