package contas;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String cliente, int num_conta, float saldo, int diaRendimento) {
        super(cliente, num_conta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxaRendimento) {
        setSaldo(getSaldo() * (1 + taxaRendimento / 100));
        System.out.println("Novo saldo após rendimento: " + getSaldo());
    }

    @Override
    public String getCliente() {
        return super.getCliente();
    }

    @Override
    public int getNum_conta() {
        return super.getNum_conta();
    }
}
