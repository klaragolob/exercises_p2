
public class RazcepNaravnegaStevila {

	public static void main(String[] args) {
		razcep(420);
		razcep(1024);
		razcep(5761665);

	}
	
	public static void razcep(int n) {
		int stevilo = n;
		char op = '=';
		
		System.out.print(stevilo);
		
		for (int i = 2; i * i < n; i++) {
			int faktor = i;
			int kolicina = 0;
			while (stevilo % i == 0) {
				stevilo = stevilo / i;
				kolicina++;
			}
			if(kolicina == 0) {
				continue;
			}else if (kolicina == 1) {
				System.out.print(" " + op + ' ' + faktor);	
			}else {
				System.out.print(" " + op + ' ' + faktor + '^' + kolicina);	
			}
			if (kolicina != 0 && op == '=') {
				op = '*';
			}
			if (stevilo == 1) {
				break;
			}
		}
	
	}

}
