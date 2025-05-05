public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String cpf, String dataNascimento, String cargo) {
        super(nome, cpf, dataNascimento);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
