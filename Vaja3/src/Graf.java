import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class Graf {
	private Map<Object,Tocka> tocke;
	
	public Graf() {
		this.tocke = new HashMap<Object,Tocka>();
	} 
	
	public Tocka tocka(Object ime) {
		return this.tocke.get(ime);
	}
	
	
	public Map<Object, Tocka> getTocke() {
		return tocke;
	}

	public void setTocke(Map<Object, Tocka> tocke) {
		this.tocke = tocke;
	}

	public boolean povezava(Tocka a, Tocka b) {
		return b.getMnozicaSosedov().contains(a);
	}
	
	public void dodajTocko(Tocka a){ 
		if (!this.tocke.containsKey(a.getIme())) {
			this.tocke.put(a.getIme(), a);
		}
	}
	
	public void dodajPovezavo(Tocka a, Tocka b) {
		a.dodajSoseda(b);
	}
	
	public void odstraniPovezavo(Tocka a, Tocka b) {
		a.odstraniSoseda(b);
	}
	
	public void odstraniTocko(Tocka a) {
		Set<Tocka> sosedi = a.getMnozicaSosedov();
		while (!sosedi.isEmpty()){
			Tocka b = sosedi.iterator().next();
			odstraniPovezavo(a, b);
			sosedi.remove(b);
		}
		this.tocke.remove(a.getIme());
	}
	
	public static Graf prazen(int n) {
		Graf a = new Graf();
		for (int i = 0; i < n ;  i++) {
			a.dodajTocko(new Tocka(i));	
		}
		return a;	
	}
	
	public static Graf cikel(int n) {
		Graf a = prazen(n);
		for (int i = 0; i < n - 1; i ++ ) {
			a.dodajPovezavo(a.tocka(i), a.tocka(i+1));
		}
		a.dodajPovezavo(a.tocka(0), a.tocka(n - 1));
		return a;
	}
	
	public static Graf poln(int n) {
		Graf a = prazen(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++ ){
				a.dodajPovezavo(a.tocka(j), a.tocka(i));
			}
		}
		return a;
	}
	
	public static Graf polnDvodelen(int n, int m) {
		Graf a = prazen(m+n);
		for (int i = 0; i < n; i++) {
			for (int j = n; j < n+m; j++ ) {
				a.dodajPovezavo(a.tocka(i), a.tocka(j));
			}
		}
		return a;
	}
	
	public boolean povezan(Graf g) { 
		//poišèeš eno toèko iz grafa, dodaš use sosede v eno množico in to delaš še naprej in pole size in èe je enako število toèk pole je povezan.
		Tocka t = g.tocke.values().iterator().next();
		int i = 0; 
		Vector<Tocka> prehojene = new Vector<Tocka>();
		prehojene.add(t);
		while (prehojene.size()< i) {
			Tocka ti = prehojene.get(i);
			Set<Tocka> sosediti = ti.getMnozicaSosedov();
			for (Tocka a: sosediti) {
				prehojene.add(a);
			}
			i++;
		}
		//samo še preveri èe so enake velikosti 
		return true;
		
		/**		Tocka a = g.tocke.values().iterator().next();
		Set<Tocka> sosedi = new HashSet<Tocka>();
		sosedi.add(a);
		Set<Tocka> sosedia = a.getMnozicaSosedov();
		for (Tocka b: sosedia) {
			sosedi.add(b);
			for (Tocka c: b.getMnozicaSosedov()) {
				sosedi.add(c);
			}
		}
		return (sosedi.size() = g.tocke.values().size()); **/
		return true;
	}
		
	public void razporedi (double x, double y, double r) {
		int stevilo_tock = tocke.size();
		int i = 0;
		for (Tocka t: tocke.values()) {
			double novi_x = x + r * Math.cos(2 * i * Math.PI / stevilo_tock);
			double novi_y = y + r * Math.sin(2 * i * Math.PI / stevilo_tock);
			t.setX(novi_x);
			t.setY(novi_y);
			i++;	
		}
	}
	
}
