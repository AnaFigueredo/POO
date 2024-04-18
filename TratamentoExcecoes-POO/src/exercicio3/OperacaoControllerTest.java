package exercicio3;

public class OperacaoControllerTest {
    public static void main(String[] args) {
        OperacaoController controller = new OperacaoController();
        try {
            int resultado1 = controller.operacaoValor(4); // Deveria retornar o quadrado de 4 (16)
            int resultado2 = controller.operacaoValor(3); // Deveria retornar o cubo de 3 (27)
            System.out.println("Resultado 1: " + resultado1);
            System.out.println("Resultado 2: " + resultado2);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

