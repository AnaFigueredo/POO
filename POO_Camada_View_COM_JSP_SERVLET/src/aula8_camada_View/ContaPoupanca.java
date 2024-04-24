package aula8_camada_View;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria1 {

    private int diaRendimento;

    public ContaPoupanca(String cliente, int numConta, float saldoInicial, int diaRendimento) {
        super(cliente, numConta, saldoInicial);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxaRendimento) {
        // Simulando rendimento diário
        float rendimentoDiario = saldo * (taxaRendimento / 100);
        if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == diaRendimento) {
            saldo += rendimentoDiario;
            System.out.println("Rendimento diário creditado! Novo saldo: " + saldo);
        }
    }
}
