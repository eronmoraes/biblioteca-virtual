public class Funcionario extends Pessoa {
    private int id;
    private String cargo;

    public Funcionario(String nome, int cpf, String dataNascimento, int id, String cargo) {
        super(nome, cpf, dataNascimento);
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
