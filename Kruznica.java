package application;

public class Kruznica {
	public double r;
	public double o;
	public double p;

	public Kruznica(double r) {
		this.r = r;
		this.opseg();
		this.povrsina();
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
		this.opseg();
		this.povrsina();
	}
	
	public void opseg() {
		this.o = 2 * r * Math.PI;
	}
	public double getO() {
		return o;
	}
	public void povrsina() {
		this.p = r * r * Math.PI;
	}
	public double getP() {
		return p;
	}
}
