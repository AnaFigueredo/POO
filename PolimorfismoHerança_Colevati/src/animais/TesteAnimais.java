package animais;

public class TesteAnimais {
    public static void main(String[] args) {
        // Criando um camelo
        Mamifero camelo = new Mamifero();
        camelo.alteraNome("Caramelo");
        camelo.alteraComprimento(150);
        camelo.alteraCor("Amarelo");
        camelo.alteraVelocidade(2.0f);
        camelo.alteraAlimento("Vegetais");

        // Criando um tubarão
        Peixe tubarao = new Peixe();
        tubarao.alteraNome("Nemo");
        tubarao.alteraComprimento(300);
        tubarao.alteraVelocidade(1.5f);
        tubarao.alteraCaracteristica("Barbatanas e cauda");

        // Criando um urso-do-canadá
        Mamifero urso = new Mamifero();
        urso.alteraNome("Urso-do-Canadá");
        urso.alteraComprimento(180);
        urso.alteraCor("Vermelho");
        urso.alteraVelocidade(0.5f);
        urso.alteraAlimento("Mel");

        // Exibindo os dados dos animais
        System.out.println("Animal: Camelo");
        camelo.dados();
        System.out.println("-----------------------------");

        System.out.println("Animal: Tubarão");
        tubarao.dados();
        System.out.println("-----------------------------");

        System.out.println("Animal: Urso-do-Canadá");
        urso.dados();
        System.out.println("-----------------------------");
    }
}
