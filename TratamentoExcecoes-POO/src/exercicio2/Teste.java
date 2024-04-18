package exercicio2;

public class Teste{
    public static void main(String[] args) {
        System.out.println("Inicio do teste");

        // Criando uma instância da conta
        Conta minhaConta = new Conta();
        minhaConta.deposita(1000); // Depositando um valor inicial de 1000

        try {
            // Tentando sacar um valor maior que o saldo disponível mais o limite
            minhaConta.saca(1500);
            System.out.println("Saque realizado com sucesso.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        System.out.println("Fim do teste");
    }
}
