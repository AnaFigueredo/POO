package exercicio2;

public class Conta {
    private int agencia;
    private int codigo;
    private float saldo;
    private float limite;

    // Construtor default
    public Conta() {
        this.agencia = 0;
        this.codigo = 0;
        this.saldo = 0;
        this.limite = 0;
    }

    // Getters e Setters
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    // Método deposita
    public void deposita(float valor) {
        this.saldo += valor;
    }

    // Método saca com tratamento de exceção
    public void saca(float valor) throws IllegalArgumentException {
        if (valor > this.saldo + this.limite) {
            throw new IllegalArgumentException("Valor de saque excede o saldo disponível mais o limite. Limite total de saque: " + (this.saldo + this.limite));
        } else {
            this.saldo -= valor;
        }
    }
}

