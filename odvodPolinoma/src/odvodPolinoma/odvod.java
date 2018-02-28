package odvodPolinoma;

public class odvod {

	public static void main(String[] args) {
		double[] a = {1, 2, 3, 4, 5};
		double[] b = odvodPolinoma(a, 3);
		for (double i : b){
			System.out.println(i);
		}
	}
	public static double[] odvodPolinoma(double[] p, int n){
		int i = 1;
		while (i <= n){
			p = prviOdvodPolinoma(p);
			i += 1;		
		}
		return p;
	}
	public static double[] prviOdvodPolinoma(double[] p){
		int x = 1;
		double[] t = new double[p.length - 1];
		while (x < p.length){
			t[x-1] = (x)*p[x];
			x += 1;
		}
		return t;
	}

}

