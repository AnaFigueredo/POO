package contas;

public class Contas {
    public static void main(String[] args) {
        // Criando uma conta poupança
        ContaPoupanca poupanca = new ContaPoupanca("Colevati", 1234, 1000.0f, 10);

        // Criando uma conta especial
        ContaEspecial especial = new ContaEspecial("Cristina", 5678, 2000.0f, 500.0f);

        // Sacando um valor de uma conta
        poupanca.sacar(500.0f);
        especial.sacar(300.0f);

        // Sacando um valor maior que o saldo
        poupanca.sacar(2000.0f);

        // Depositando um valor em uma conta
        poupanca.depositar(300.0f);
        especial.depositar(100.0f);

        // Calculando o novo saldo da conta poupança com base na taxa de rendimento
        poupanca.calcularNovoSaldo(0.5f); // 0.5% de rendimento

        // Mostrando os dados das contas
        System.out.println("Dados da conta poupança:");
        System.out.println("Cliente: " + poupanca.getCliente());
        System.out.println("Número da conta: " + poupanca.getNum_conta());
        System.out.println("Saldo: " + poupanca.getSaldo());

        System.out.println("Dados da conta especial:");
        System.out.println("Cliente: " + especial.getCliente());
        System.out.println("Número da conta: " + especial.getNum_conta());
        System.out.println("Saldo: " + especial.getSaldo());
        System.out.println("Limite: " + especial.getLimite());
    }
}
