package controller;


import model.EstudanteSuperior;

public class EstudanteSuperiorController extends EstudanteController {
    // Implementação específica para curso superior aqui

    // Método para calcular a média ponderada de um estudante superior
    public float calcularMediaPonderada(EstudanteSuperior estudanteSuperior) {
        // Implemente o cálculo da média ponderada das notas aqui
        return estudanteSuperior.getMediaNotas() * 0.7f + 1.0f; // Exemplo simples
    }

    // Método para verificar se um estudante superior está aprovado
    @Override
    public boolean verificarAprovacao(EstudanteSuperior estudanteSuperior) {
        // Implemente a lógica para verificar se o estudante superior está aprovado
        // Por exemplo, considere aprovado se a média ponderada for maior ou igual a 7
        return calcularMediaPonderada(estudanteSuperior) >= 7.0f;
    }
}
