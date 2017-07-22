package application;

public class Pravokutnik {
	public double a;
	public double b;
	public double o;
	public double p;
	
	public Pravokutnik(double a, double b) {
		this.a = a;
		this.b = b;
		this.opseg();
		this.povrsina();
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
		this.opseg();
		this.povrsina();
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
		this.opseg();
		this.povrsina();
	}

	public double getO() {
		return o;
	}

	public double getP() {
		return p;
	}
	
	public void opseg() {
		this.o = 2 * a + 2 * b;
	}
	
	public void povrsina() {
		this.p = a * b;
	}
	
}
