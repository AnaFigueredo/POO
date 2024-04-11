package model;

public class EstudanteTecnico extends Estudante implements OperacoesEstudante {
    // Construtor
    public EstudanteTecnico(String ra, String nome, String email, float mediaNotas, String qtdAprovacoes) {
        super(ra, nome, email, mediaNotas, qtdAprovacoes);
    }

    @Override
    public float percentualRendimento() {
        return getMediaNotas() * Float.parseFloat(getQtdAprovacoes()) * 0.931f;
    }

    @Override
    public float percentualProgressao() {
        return Float.parseFloat(getQtdAprovacoes()) / 3.0f;
    }
}

