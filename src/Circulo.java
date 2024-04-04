
public class Circulo extends FormaGeometrica {

	double raio;
	
	Circulo(double raio) {
        this.raio = raio;
    }
	
	@Override
	double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * raio * raio;
	}

}
