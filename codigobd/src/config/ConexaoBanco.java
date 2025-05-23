package src.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexaoBanco {
    private Connection conn;
    
    //acesso ao banco01
    public boolean Conectar(){
        String url = "jdbc:postgresql://localhost:5432/bibliotecavirtual";
        String usuario = "postgres";
        String senha = "123456";

        try{
            this.conn = DriverManager.getConnection(url, usuario, senha);
        }catch(SQLException e){
            System.err.println("Erro ao conectar ao banco:  " + e.getMessage());
            return false;
        }
        System.out.println("Banco de dados conectado!");
        return true;
    }
    
    //fechando acesso ao banco
    public boolean Desconectar(){
        try{
            if(this.conn.isClosed()==false){
                this.conn.close();
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return false;
        }
        System.out.println("Banco de dados desconectado!");
        return true;
    }
    
    // método para criar tabela no banco
    public boolean CriarTabelaProdutos(){
        final String SQL = "CREATE TABLE IF NOT EXISTS Produtos ("
        +"ID SERIAL PRIMARY KEY,"
        +"Nome VARCHAR(120),"
        +"Preco DOUBLE PRECISION,"
        +"Estoque INTEGER,"
        +"Autor VARCHAR(120),"
        +"Categoria VARCHAR(120)"
        +");";

        try{
            this.Conectar();
            PreparedStatement pstmt = this.conn.prepareStatement(SQL);
            pstmt.execute();
            pstmt.close();
            System.out.println("Tabela PRODUTOS criada com sucesso!");
            this.Desconectar();
            return true;
        }catch (SQLException e){
            System.out.println("Erro ao criar tabela: " + e.getMessage());
            return false;
        }
    }

    public boolean CriarTabelaPessoas(){
        final String SQL = "CREATE TABLE IF NOT EXISTS Pessoas ("
                +"CPF VARCHAR(14) PRIMARY KEY,"
                +"Nome VARCHAR(120),"
                +"DataNascimento VARCHAR(120),"
                +"Email VARCHAR(120),"
                +"Endereco VARCHAR(120),"
                +"Cargo VARCHAR(120)"
                +");";

        try{
            this.Conectar();
            PreparedStatement pstmt = this.conn.prepareStatement(SQL);
            pstmt.execute();
            pstmt.close();
            System.out.println("Tabela PESSOAS criada com sucesso!");
            this.Desconectar();
            return true;
        }catch (SQLException e){
            System.out.println("Erro ao criar tabela: " + e.getMessage());
            return false;
        }
    }
    
    //metodo CRUD - inserir dados na tabela 
    public boolean InserirProduto(String name, double price, int estoque, String autor, String categoria){
        final String SQL = "INSERT INTO Produtos ("
                + "nome,preco,estoque,autor,categoria)"
                + "VALUES (?,?,?,?,?)";

        try{    
            this.Conectar();
            PreparedStatement pstmt = this.conn.prepareStatement(SQL);
            pstmt.setString(1, name);
            pstmt.setDouble(2, price);
            pstmt.setInt(3, estoque);
            pstmt.setString(4, autor);
            pstmt.setString(5, categoria);
            pstmt.execute();
            pstmt.close();
            System.out.println("Registro inserido com Sucesso!");
            this.Desconectar();
            return true;
        }catch (SQLException e) {
            System.out.println("Erro ao inserir dados na tabela: " + e.getMessage());
            return false;
        }
    }

    public boolean InserirPessoa(String cpf, String name, String dataNascimento, String email, String endereco, String cargo){
        final String SQL = "INSERT INTO Pessoas ("
                + "cpf,nome,datanascimento,email,endereco,cargo)"
                + "VALUES (?,?,?,?,?,?)";

        try{
            this.Conectar();
            PreparedStatement pstmt = this.conn.prepareStatement(SQL);
            pstmt.setString(1, cpf);
            pstmt.setString(2, name);
            pstmt.setString(3, dataNascimento);
            pstmt.setString(4, email);
            pstmt.setString(5, endereco);
            pstmt.setString(6, cargo);
            pstmt.execute();
            pstmt.close();
            System.out.println("Registro inserido com Sucesso!");
            this.Desconectar();
            return true;
        }catch (SQLException e) {
            System.out.println("Erro ao inserir dados na tabela: " + e.getMessage());
            return false;
        }
    }
    
    //método CRUD - Atualizar dados na tabela
    public boolean AtualizarProduto(int idprod, String name, double price, int estoque, String autor, String categoria){
        final String SQL = "UPDATE Produtos SET "
                + "nome=?,"
                + "preco=?,"
                + "estoque=?,"
                + "autor=?,"
                + "categoria=?"
                + "WHERE id=?";
        try{
            this.Conectar();
            PreparedStatement pstmt = this.conn.prepareStatement(SQL);
            pstmt.setString(1, name);
            pstmt.setDouble(2, price);
            pstmt.setInt(3, estoque);
            pstmt.setString(4, autor);
            pstmt.setString(5, categoria);
            pstmt.setInt(6, idprod);
            pstmt.execute();
            pstmt.close();
            System.out.println("Registro atualizado com sucesso!");
            this.Desconectar();
            return true;
        }catch(SQLException e){
            System.out.println("Erro ao atualizar dados na tabela: " + e.getMessage());
            return false;
        }
    }

    public boolean AtualizarPessoa(String cpf, String name, String dataNascimento, String email, String endereco, String cargo){
        final String SQL = "UPDATE Pessoas SET "
                + "cpf=?,"
                + "nome=?,"
                + "datanascimento=?,"
                + "email=?,"
                + "endereco=?,"
                + "cargo=?"
                + "WHERE cpf=?";
        try{
            this.Conectar();
            PreparedStatement pstmt = this.conn.prepareStatement(SQL);
            pstmt.setString(1, name);
            pstmt.setString(2, dataNascimento);
            pstmt.setString(3, email);
            pstmt.setString(3, endereco);
            pstmt.setString(3, cargo);
            pstmt.setString(3, cpf);
            pstmt.execute();
            pstmt.close();
            System.out.println("Registro atualizado com sucesso!");
            this.Desconectar();
            return true;
        }catch(SQLException e){
            System.out.println("Erro ao atualizar dados na tabela: " + e.getMessage());
            return false;
        }
    }
    
    //método CRUD - apagar dados na tabela
    public boolean ApagarProduto(int idprod){
        final String SQL = "DELETE FROM Produtos WHERE id=?";
        try{
            this.Conectar();
            PreparedStatement pstmt = this.conn.prepareStatement(SQL);
            pstmt.setInt(1, idprod);
            pstmt.execute();
            pstmt.close();
            System.out.println("Registro apagado com sucesso!");
            return true;
        }catch(SQLException e){
            System.out.println("Erro ao apagar dados na tabela: " + e.getMessage());
            return false;
        }
    }

    public boolean ApagarPessoa(int cpf){
        final String SQL = "DELETE FROM Pessoas WHERE cpf=?";
        try{
            this.Conectar();
            PreparedStatement pstmt = this.conn.prepareStatement(SQL);
            pstmt.setInt(1, cpf);
            pstmt.execute();
            pstmt.close();
            System.out.println("Registro apagado com sucesso!");
            return true;
        }catch(SQLException e){
            System.out.println("Erro ao apagar dados na tabela: " + e.getMessage());
            return false;
        }
    }
    
    //metodo CRUD consultar dados na tabela
    public ResultSet ConsultarProduto(){
        final String SQL = "SELECT id, nome, preco, estoque, autor, categoria FROM Produtos";
        try{
            this.Conectar();
            PreparedStatement pstmt = this.conn.prepareStatement(SQL);
            ResultSet rs = pstmt.executeQuery();
            System.out.println("Consulta realizada com sucesso!");
            return rs;
        }catch(SQLException e){
            System.out.println("Erro ao consultar dados na tabela: " + e.getMessage());
            return null;
        }
    }

    public ResultSet ConsultarPessoa(){
        final String SQL = "SELECT cpf, nome, datanascimento, email, endereco, cargo FROM Pessoas";
        try{
            this.Conectar();
            PreparedStatement pstmt = this.conn.prepareStatement(SQL);
            ResultSet rs = pstmt.executeQuery();
            System.out.println("Consulta realizada com sucesso!");
            return rs;
        }catch(SQLException e){
            System.out.println("Erro ao consultar dados na tabela: " + e.getMessage());
            return null;
        }
    }
}