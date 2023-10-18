public class Pessoa {
    public String nomePes;
    public int cpf;
    public String dataNasc;

    public Pessoa(String nomePes, int cpf, String dataNasc) {
        this.nomePes = nomePes;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public String getNomePes() {
        return nomePes;
    }

    public void setNomePes(String nomePes) {
        this.nomePes = nomePes;
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
        System.out.println("Pessoa - Nome: " + nomePes + " CPF: " + cpf + " Data de Nascimento: " + dataNasc);
    }

}
