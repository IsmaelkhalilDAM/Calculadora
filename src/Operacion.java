import java.lang.Math.*;

@SuppressWarnings("unused")
public class Operacion {
	private double a;
	private double b;

	public Operacion(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double suma(Operacion a) {
		double suma = 0;
		suma = getA() + getB();
		return suma;
	}

	public double resta(Operacion a) {
		double resta = 0;
		resta = getA() - getB();
		return resta;
	}

	public double multiplicacion(Operacion a) {
		double mult = 0;
		mult = getA() * getB();
		return mult;
	}

	public double division(Operacion a) {
		double div = 0;
		div = getA() / getB();
		return div;
	}

	public double potenciacion(Operacion a) {
		double pot = 0;
		pot = Math.pow(getA(), getB());

		return pot;
	}
	public double raiz(Operacion a) {
		double raiz = 0 ;
		raiz = Math.pow(getA(), 1/getB());
		return raiz;
	}
}
