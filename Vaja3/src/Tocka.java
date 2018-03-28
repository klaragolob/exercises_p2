import java.util.HashSet;
import java.util.Set;

public class Tocka {
	private Object ime;
	private Set<Tocka> mnozicaSosedov;
	private double x;
	private double y;
	
	
	/**
	 * Konstruktor, ki ustvari toèko z danim imenom brez sosedov
	 * @param ime 
	 */
	public Tocka(Object ime) {
		this.ime = ime;
		this.mnozicaSosedov = new HashSet<Tocka>();
		this.x = 0;
		this.y = 0;
	}
	
	public Tocka(Object ime, double x, double y) {
		this.ime = ime;
		this.x = x;
		this.y = y;
	}
	
	public Tocka(Object ime, Set<Tocka> mnozicaSosedov, double x, double y) {
		super();
		this.ime = ime;
		this.mnozicaSosedov = mnozicaSosedov;
		this.x = x;
		this.y = y;
	}

	public int stopnja() {
		return this.mnozicaSosedov.size();
	}

	public Set<Tocka> getMnozicaSosedov() {
		return mnozicaSosedov;
	}

	public void setMnozicaSosedov(Set<Tocka> mnozicaSosedov) {
		this.mnozicaSosedov = mnozicaSosedov;
	}

	public Object getIme() {
		return ime;
	}

	public void setIme(Object ime) {
		this.ime = ime;
	}

	public void dodajSoseda(Tocka b) {
		Set<Tocka> sosedia= this.getMnozicaSosedov();
		Set<Tocka> sosedib = b.getMnozicaSosedov();
		sosedia.add(b);
		sosedib.add(this);
	}

	public void odstraniSoseda(Tocka b) {
		this.getMnozicaSosedov().remove(b);
		b.getMnozicaSosedov().remove(this);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	
	
}
	
	

