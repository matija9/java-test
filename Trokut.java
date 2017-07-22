package application;


public class Trokut {
	private double a;
	private double b;
	private double c;
	private double o;
	private double p;
	
	
	
	public Trokut(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.opseg();
		this.povrsina();
	}
	
	public double getA() {
		return a;
		
	}
	public void setA(int a) {
		this.a = a;
		this.opseg();
		this.povrsina();
	}
	public double getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
		this.opseg();
		this.povrsina();
	}
	public double getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
		this.opseg();
		this.povrsina();
	}
	public void opseg() {
		this.o = this.a + this.b + this.c;
	}	
	public double getO() {
		return o;
	}
	public void povrsina() {
		double s = (this.a + this.b + this.c) / 2;
		this.p = Math.sqrt(s*(s - this.a)*(s - this.b)*(s - this.c));
	}
	public double getP() {
		return p;
	}
}
