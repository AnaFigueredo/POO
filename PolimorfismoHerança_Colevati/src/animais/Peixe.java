package animais;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe() {
        super();
        setPatas(0); // Peixe tem 0 patas por padrão
        setAmbiente("Mar"); // Ambiente padrão é o mar
        setCor("Cinzenta"); // Cor padrão é cinzenta
    }

    protected void setCor(String string) {
		// TODO Auto-generated method stub
		
	}

	// Método setPatas vazio para suprimir o aviso da IDE
    public void setPatas(int patas) {
        // Este método não faz nada, já que os peixes não têm patas
    }

	public void alteraCaracteristica(String string) {
		// TODO Auto-generated method stub
		
	}

    // Outros métodos da classe Peixe...
}
