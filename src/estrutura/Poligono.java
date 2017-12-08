package estrutura;

public abstract class Poligono extends Figura {
	
	private double base;
	private double altura;

	
	public Poligono(double base, double altura) {
		
		this.altura=altura;
		this.base = base;
	
			
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public abstract double area();
	
	
	@Override
	public abstract double perimetro();

}
