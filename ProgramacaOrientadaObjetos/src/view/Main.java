package view;

import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class Main {
    public static void main(String[] args) {
        EstudanteTecnico estudanteTecnico = new EstudanteTecnico(null, null, null, 0, null);
        estudanteTecnico.setRa("12345");
        estudanteTecnico.setNome("João");
        estudanteTecnico.setEmail("joao@example.com");
        estudanteTecnico.setMediaNotas(7.5f);
        estudanteTecnico.setQtdAprovacoes("3");

        EstudanteSuperior estudanteSuperior = new EstudanteSuperior(null, null, null, 0, null, null, 0);
        estudanteSuperior.setRa("54321");
        estudanteSuperior.setNome("Maria");
        estudanteSuperior.setEmail("maria@example.com");
        estudanteSuperior.setMediaNotas(8.5f);
        estudanteSuperior.setQtdAprovacoes("5");
        estudanteSuperior.setInstituicaoSegundoGrau("Escola X");
        estudanteSuperior.setAnoConclusaoSegundoGrau(2018);

        System.out.println("Percentual de rendimento do estudante técnico: " + estudanteTecnico.percentualRendimento());
        System.out.println("Percentual de progressão do estudante técnico: " + estudanteTecnico.percentualProgressao());

        System.out.println("Percentual de rendimento do estudante superior: " + estudanteSuperior.percentualRendimento());
        System.out.println("Percentual de progressão do estudante superior: " + estudanteSuperior.percentualProgressao());
    }
}
