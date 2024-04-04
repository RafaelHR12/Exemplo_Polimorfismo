import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escolha a figura geométrica para calcular a área:");
        System.out.println("1. Círculo");
        System.out.println("2. Quadrado");
        System.out.println("3. Triângulo");
        int escolha = sc.nextInt();       
    	
        switch (escolha) {
        case 1:
            System.out.println("Digite o raio do círculo (em metros): ");
            double raio = sc.nextDouble();
            FormaGeometrica circulo = new Circulo(raio);
            System.out.println("Área do círculo: " + circulo.calcularArea());
            break;
        case 2:
            System.out.println("Digite o lado do quadrado (em metros): ");
            double lado = sc.nextDouble();
            FormaGeometrica quadrado = new Quadrado(lado);
            System.out.println("Área do quadrado: " + quadrado.calcularArea());
            break;
        case 3:
            System.out.println("Digite a base do triângulo (em metros): ");
            double base = sc.nextDouble();
            System.out.println("Digite a altura do triângulo (em metros): ");
            double altura = sc.nextDouble();
            FormaGeometrica triangulo = new Triangulo(base, altura);
            System.out.println("Área do triângulo: " + triangulo.calcularArea());
            break;
        default:
            System.out.println("Opção inválida!");
    }
        
	}

}
