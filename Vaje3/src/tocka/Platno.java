package tocka;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Set;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Platno extends JPanel {
	private int sirina;
	private int visina;
	private Graf graf;

	public Platno(int sirina, int visina) {
		super();
		this.sirina = sirina;
		this.visina = visina;
		this.graf = null;
		this.setBackground(Color.white);
	}
	
	public void narisi(Graf g) {
		this.graf = g;
		repaint();
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(this.sirina, this.visina);
	}
	
	public static int round (double x){
		return (int)(x + 0.5);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.graf.razporedi(200, 200, 100);
		for (Tocka t: this.graf.getTocke().values()) {
			Set<Tocka> sosedi = t.getMnozicaSosedov();
			for (Tocka h: sosedi){
				g.setColor(Color.DARK_GRAY);
				g.drawLine(round(t.getX()), round(t.getY()), round(h.getX()), round(h.getY()));
			}
			g.setColor(Color.BLUE);
			g.fillOval(round(t.getX())-7, round(t.getY())-7, 14, 14);
		}	
		
	}
	
	public void mouseClicked(MouseEvent e) {
		dodajPikico(new Pikica(e.getX(), e.getY()));
	}
	
}	






