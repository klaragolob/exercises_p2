package tocka;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Okno extends JFrame {
	protected Platno platno;
	
	public Okno(int sirina, int visina) {
		super();
		setTitle("Graf");
		platno = new Platno(sirina, visina);
		this.add(this.platno);
	}

}

