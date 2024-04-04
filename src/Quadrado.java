
public class Quadrado extends FormaGeometrica {

	double lado;
	
	Quadrado(double lado) {
        this.lado = lado;
    }
	
	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

}
