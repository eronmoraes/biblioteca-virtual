public abstract class Pessoa {
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

    public void setNomeP(String nome) {
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

  public abstract void exibirInfo();

}
