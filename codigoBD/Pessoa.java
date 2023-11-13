public class Pessoa {
    public String nome;
    public int cpf;
    public String dataNascimento;

    public Pessoa(String nome, int cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
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
        return dataNascimento;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNascimento = dataNasc;
    }
}
