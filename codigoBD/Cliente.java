public class Cliente extends Pessoa {
    private String email;
    private String endereco;

    public Cliente(String nome, int cpf, String dataNascimento, String email, String endereco) {
        super(nome, cpf, dataNascimento);
        this.email = email;
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
