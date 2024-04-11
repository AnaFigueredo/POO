package controller;

import model.EstudanteTecnico;

public class EstudanteTecnicoController extends EstudanteController {
    // Implementação específica para curso técnico aqui

    // Método para calcular a média ponderada de um estudante técnico
    public float calcularMediaPonderada(EstudanteTecnico estudanteTecnico) {
        // Implemente o cálculo da média ponderada das notas aqui
        return estudanteTecnico.getMediaNotas() * 0.6f + 1.0f; // Exemplo simples
    }

    // Método para verificar se um estudante técnico está aprovado
    @Override
    public boolean verificarAprovacao(EstudanteTecnico estudanteTecnico) {
        // Implemente a lógica para verificar se o estudante técnico está aprovado
        // Por exemplo, considere aprovado se a média ponderada for maior ou igual a 6
        return calcularMediaPonderada(estudanteTecnico) >= 6.0f;
    }
}
