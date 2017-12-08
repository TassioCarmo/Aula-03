package figuras2d;
import estrutura.Diagonal;
import estrutura.Poligono;

public class Retangulo extends Poligono implements Diagonal {
	
	private double area;
	private double perimetro;
	public Retangulo(double base, double altura) {
		super(base, altura);
		
	}

	
	@Override
	public double area() {
		
		area = (getBase()*getAltura());
		
		return area;
	}
	

	@Override
	public double perimetro() {
		
		perimetro = 2*getBase() + 2*getAltura();
		
		return perimetro;
	}

	
	@Override
	public double diagonal() {
		
		double diagonal = Math.sqrt( Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
		
		return diagonal;
	}

}
