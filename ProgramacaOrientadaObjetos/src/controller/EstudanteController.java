package controller;

import model.Estudante;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class EstudanteController {
    // Implementação dos métodos de controle

    // Método para calcular a média de um estudante
    public float calcularMedia(Estudante estudante) {
        // Implemente o cálculo da média das notas aqui
        return estudante.getMediaNotas();
    }

    // Método para verificar se um estudante está aprovado
    public boolean verificarAprovacao(Estudante estudante) {
        // Implemente a lógica para verificar se o estudante está aprovado
        // Por exemplo, considere aprovado se a média de notas for maior ou igual a 7
        return estudante.getMediaNotas() >= 7.0f;
    }

	public boolean verificarAprovacao(EstudanteSuperior estudanteSuperior) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verificarAprovacao(EstudanteTecnico estudanteTecnico) {
		// TODO Auto-generated method stub
		return false;
	}
}
