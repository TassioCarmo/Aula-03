package figuras2d;
import estrutura.Poligono;

public class Triangulo extends Poligono {
	
	private double area;
	private double lado2;
	private double lado3;
	private double perimetro;
	
	public Triangulo(double base, double altura) {
		super(base, altura);

	}
		
	@Override
	public double area() {
		
		area = (getBase()*getAltura())/2;
		
		return area;
	}
	@Override
	public double perimetro() {

		perimetro = getBase() + lado2 + lado3;
		
		return perimetro;
	}
	
	

}
