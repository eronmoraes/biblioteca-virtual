public class Cliente extends Pessoa {

    public Cliente(String nome, int cpf, String dataNasc) {
        super(nome, cpf, dataNasc);
    }

    @Override
    public void exibirInfo() {
      System.out.println("Nome: " + getNome() + ", CPF: " + cpf);
    }

}
