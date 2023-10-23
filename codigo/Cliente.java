public class Cliente {
    public String nome;
    public int cpf;
    public String dataNasc;

    public Cliente(String nome, int cpf, String dataNasc) {
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

    public void exibirInfo() {
        System.out.println("Pessoa - Nome: " + nome + " CPF: " + cpf + " Data de Nascimento: " + dataNasc);
    }

}
