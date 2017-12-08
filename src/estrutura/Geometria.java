package estrutura;

import java.util.ArrayList;

import figuras2d.Circulo;
import figuras2d.Losango;
import figuras2d.Quadrado;
import figuras2d.Retangulo;
import figuras2d.Trapezio;
public class Geometria {
	
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Losango(5,4));
		figuras.add(new Quadrado(3,2));
		figuras.add(new Retangulo(4,7));
		figuras.add(new Trapezio(8,6,5));
		figuras.add(new Circulo(8));
		
		//figuras.add(new triangulo("Maria Pereira", 1500.00, 5000.00));*/
		//figuras.add(new Comissionado("Maria Pereira", 1500.00, 5000.00));*/
		//figuras.add(new Comissionado("Maria Pereira", 1500.00, 5000.00));*/

		for(Figura fig:figuras){
			System.out.println(fig.area());
			
		
	
		}
	}

	

}
