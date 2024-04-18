package exercicio3;

public class OperacaoController {
    public int operacaoValor(int valor) {
        if (valor < 0) {
            throw new ArithmeticException("O parâmetro não pode ser negativo");
        }
        return (valor % 2 == 0) ? valor * valor : valor * valor * valor;
    }
}
