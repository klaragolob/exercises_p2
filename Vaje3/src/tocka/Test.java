package tocka;
public class Test {

	public static void main(String[] args) {
		Graf g = new Graf();
		Tocka t = new Tocka(1);
		Tocka h = new Tocka(2);
		g.dodajTocko(t);
		g.dodajTocko(h);
		g.dodajPovezavo(t, h);
		Okno glavnoOkno = new Okno(500, 500);
		glavnoOkno.pack();
		glavnoOkno.setVisible(true);
		glavnoOkno.platno.narisi(g);

	}

}

