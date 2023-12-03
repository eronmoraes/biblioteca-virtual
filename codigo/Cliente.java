public class Cliente {
    public String nome;
    public int cpf;
    public String email;

    public Cliente(String nome, int cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirInfo() {
        System.out.println("Pessoa - Nome: " + nome + " CPF: " + cpf + " Email: " + email);
    }

}
