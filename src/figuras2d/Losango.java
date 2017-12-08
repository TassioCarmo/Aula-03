package figuras2d;
import estrutura.Poligono;

public class Losango extends Poligono {
	
	private double area;
	private double perimetro;
	public Losango(double base, double altura) {
		super(base,altura);
		
		
	}

	@Override
	public double area() {
		
		area = (getBase()*getAltura())/2;
		
		return area;
	}

	@Override
	public double perimetro() {
		
		perimetro = 2*getBase() + 2*getAltura();
		
		return perimetro;
	}

}
