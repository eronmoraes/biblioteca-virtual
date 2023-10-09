public class Funcionario extends Pessoa {
    private int id;
    private String cargo;

    public Funcionario() {
        this.id = 0;
        this.cargo = "";
    }

    public Funcionario(String nome, int cpf, String dataNasc, int id, String cargo) {
        super(nome, cpf, dataNasc);
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

    @Override
    public void exibirInfo() {
    }

}
