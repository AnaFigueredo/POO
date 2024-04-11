package contas;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        float limiteTotal = getSaldo() + limite;
        if (valor <= limiteTotal) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Limite de saque excedido.");
        }
    }

    // Implementação do método getCliente para retornar o nome do cliente
    @Override
    public String getCliente() {
        return super.getCliente();
    }

    // Implementação do método getNum_conta para retornar o número da conta
    @Override
    public int getNum_conta() {
        return super.getNum_conta();
    }

    // Implementação do método getLimite para retornar o limite da conta especial
    public float getLimite() {
        return limite;
    }
}
