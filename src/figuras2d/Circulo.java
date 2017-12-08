package figuras2d;
import estrutura.Figura;

public class Circulo extends Figura
{

	private double area;
	private double raio;
	private double perimetro;
	
	public Circulo(double raio) {
		this.raio= raio;
	}

	
	
	public double getRaio() {
		return raio;
	}



	public void setRaio(double raio) {
		this.raio = raio;
	}

	
	@Override
	public double area() {
		
		area = Math.PI*Math.pow(raio,2);
		
		return area;
	}

	@Override
	public double perimetro() {
		perimetro = Math.PI*raio*2;
		return perimetro;
	}

}
