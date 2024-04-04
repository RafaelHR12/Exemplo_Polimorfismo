
public class Triangulo extends FormaGeometrica {

	double base;
	double altura;
	
	Triangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		return (base * altura) / 2;
	}

}
