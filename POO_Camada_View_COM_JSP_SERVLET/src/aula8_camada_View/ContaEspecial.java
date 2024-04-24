package aula8_camada_View;

public class ContaEspecial extends ContaBancaria1 {

    private float limite;

    public ContaEspecial(String cliente, int numConta, float saldoInicial, float limite) {
        super(cliente, numConta, saldoInicial);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (valor <= saldo + limite) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
            } else {
                float valorExcedeSaldo = valor - saldo;
                saldo = 0;
                limite -= valorExcedeSaldo;
                System.out.println("Saque realizado com uso do limite! Novo saldo: " + saldo + " Limite disponível: " + limite);
            }
        } else {
            System.out.println("Saldo insuficiente e limite indisponível para saque.");
        }
    }
}
