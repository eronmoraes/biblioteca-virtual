public class Cliente extends Pessoa {

    public Cliente(String nomePes, int cpf, String dataNasc) {
        super(nomePes, cpf, dataNasc);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Cliente - Nome: " + getNomePes() + " CPF: " + getCpf() + " Data de Nascimento: " + getDataNasc());
    }

}
