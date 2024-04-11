package model;

public class Estudante {

	    private String ra;
	    private String nome;
	    private String email;
	    private float mediaNotas;
	    private String qtdAprovacoes;

	    // Construtores
	    public Estudante(String ra, String nome, String email, float mediaNotas, String qtdAprovacoes) {
	        this.ra = ra;
	        this.nome = nome;
	        this.email = email;
	        this.mediaNotas = mediaNotas;
	        this.qtdAprovacoes = qtdAprovacoes;
	    }

	    // Getters e Setters
	    public String getRa() {
	        return ra;
	    }

	    public void setRa(String ra) {
	        this.ra = ra;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public float getMediaNotas() {
	        return mediaNotas;
	    }

	    public void setMediaNotas(float mediaNotas) {
	        this.mediaNotas = mediaNotas;
	    }

	    public String getQtdAprovacoes() {
	        return qtdAprovacoes;
	    }

	    public void setQtdAprovacoes(String qtdAprovacoes) {
	        this.qtdAprovacoes = qtdAprovacoes;
	    }

	    // Métodos adicionais, se necessário
	    public float calcularMedia() {
	    	
	        // Implemente o cálculo da média das notas aqui    	
	    	
	        return 0.0f; // Por enquanto, retorna 0 como exemplo
	    }
	}
