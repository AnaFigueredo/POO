package contas;

public class ContaBancaria {
    private String cliente;
    private int num_conta;
    private float saldo;

    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.setSaldo(saldo);
    }

    public void sacar(float valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    public void depositar(float valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito de " + valor + " realizado com sucesso!");
    }

	public float getSaldo() {
		return saldo;
	}

	protected void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNum_conta() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getCliente() {
		// TODO Auto-generated method stub
		return null;
	}
}
