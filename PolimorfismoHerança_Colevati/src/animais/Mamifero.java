package animais;

//Classe Mamifero
public class Mamifero extends Animal {
 private String alimento;

 public Mamifero() {
     super();
     setAmbiente("Terra"); // Ambiente padrão é a terra
 }

 // Métodos getters e setters

 public void alteraAlimento(String alimento) {
     this.alimento = alimento;
 }

 public String alimento() {
     return alimento;
 }

 public void dados() {
     super.dados(); // Chama o método dados da classe Animal
     System.out.println("Alimento: " + alimento);
 }
}
