package view;

import model.Paralelogramo;
import model.Trapezio;

public class TesteQuadrilateros {

	    public static void main(String[] args) {
	    	
	        // Criando um paralelogramo com base 5 e altura 5	    	
	        Paralelogramo paralelogramo = new Paralelogramo(7, 5);
	        
	        // Calculando e imprimindo a área e o perímetro do paralelogramo
	        System.out.println("Área do paralelogramo: " + paralelogramo.calcularArea());
	        System.out.println("Perímetro do paralelogramo: " + paralelogramo.calcularPerimetro());

	        // Criando um trapézio com base maior 10, base menor 8 e altura 6
	        Trapezio trapezio = new Trapezio(10, 8, 6);
	        
	        // Calculando e imprimindo a área e o perímetro do trapézio
	        System.out.println("Área do trapézio: " + trapezio.calcularArea());
	        System.out.println("Perímetro do trapézio: " + trapezio.calcularPerimetro());
	    }
	}
