package XTI;

public class Cubo implements VolumeCalculavel, AreaCalculavel {

	double lado;
	public Cubo(double lado) {
		this.lado = lado;
	}
	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return 6 * lado * lado;
	}

	@Override
	public double calcularVolume() {
		// TODO Auto-generated method stub
		return lado * lado * lado;
	}
}
