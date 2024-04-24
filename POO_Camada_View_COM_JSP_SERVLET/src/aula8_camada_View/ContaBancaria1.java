package aula8_camada_View;

public class ContaBancaria1 {

    private String cliente;
    private int numConta;
    public float saldo;

    public ContaBancaria1(String cliente, int numConta, float saldoInicial) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldoInicial;
    }

    public void ContaBancaria(String cliente2, int numConta2, float saldoInicial) {
		// TODO Auto-generated constructor stub
	}

	public void sacar(float valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso! Novo saldo: " + saldo);
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
