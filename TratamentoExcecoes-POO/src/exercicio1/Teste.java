package exercicio1;

public class Teste {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (ArithmeticException e) {
            System.out.println("Erro no main: " + e.getMessage());
        }
        System.out.println("Fim do main");
    }

    public static void metodo1() {
        System.out.println("Inicio do método 1");
        try {
            metodo2();
        } catch (ArithmeticException e) {
            System.out.println("Erro no método 1: " + e.getMessage());
        }
        System.out.println("Fim do método 1");
    }

    public static void metodo2() {
        System.out.println("Inicio do método 2");
        int[] vetor = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                vetor[i] = i;
                System.out.println(i);
                if (i == 9) {
                    int vlr = vetor[i] / vetor[0];
                    System.out.println(vlr);
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro no método 2: Divisão por zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro no método 2: " + e.getMessage());
        }
        System.out.println("Fim do método 2");
    }
}




