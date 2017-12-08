package figuras2d;

import estrutura.Poligono;

public class Trapezio extends Poligono {

	private double area;
	private double baseMenor;
	
	public Trapezio(double base, double altura,double baseMenor) {
		super(base, altura);
		
		this.baseMenor = baseMenor;
		
	}
	@Override
	public double area() {
		
		area = ((getBase()*baseMenor) *getAltura())/2;
		
		return area;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	@Override
	public double perimetro() {

		return 0;
	}

}
