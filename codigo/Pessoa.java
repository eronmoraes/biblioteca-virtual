import java.util.Date;

public class Pessoa {
    public String nome;
    public String cpf;
    public Date dataDeNascimento;

    public Pessoa(String nome, String cpf, Date dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public class Funcionario extends Pessoa {
        private int id;
        private String cargo;

        public Funcionario (String nome, String cpf, Date dataDeNascimento) {
            super (nome, cpf, dataDeNascimento);
            this.id = id;
            this.cargo = cargo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }
    }

    public class Cliente extends Pessoa {
        public Cliente (String nome, String cpf, Date dataDeNascimento) {
            super(nome, cpf, dataDeNascimento);
        }
    }

}

