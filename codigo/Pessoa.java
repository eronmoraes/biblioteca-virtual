//import java.util.Date;

public class Pessoa {
    public String nome;
    public int cpf;
    public String dataNasc;

    public Pessoa() {
        this.nome = "";
        this.cpf = 0;
        this.dataNasc = "";
    }

    public Pessoa(String nome, int cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public class Funcionario extends Pessoa {
        private int id;
        private String cargo;

        public Funcionario() {
            this.id = 0;
            this.cargo = "";
        }

        public Funcionario (String nome, int cpf, String dataNasc, int id, String cargo){
            super (nome, cpf, dataNasc);
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
        public Cliente (String nome, int cpf, String dataNasc) {
            super(nome, cpf, dataNasc);
        }
    }

}
