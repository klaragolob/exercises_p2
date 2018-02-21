
public class Collatz {

	public static void main(String[] args) {
		System.out.println(dolzinaZaporedja(6));
		System.out.println(najvecjiClen(6));
	}
	public static int dolzinaZaporedja (int n) {
		int x = 1;
		while (n != 1) {
			  if ((n%2) == 0){
			    x +=1;
			    n = n/2;
		}     else {
			    n = n*3+1;
			    x +=1;
		} }   
		return x;
	}
	public static int najvecjiClen (int n) {
		int x = n;
		while (n != 1) {
			if ((n%2) == 0){
				n = n/2;
			}  
			else {
			  n = n*3+1;
			  if (n > x) {
					x = n;
			  } 
			}  
		} 
		return x;
	}
}

/*Collatzovo zaporedje

Collatzovo zaporedje tvorimo na slede� na�in. Za�nemo z nekim
naravnim �tevilom n, ki ga nato delimo z 2, �e je sodo, ali pa
pomno�imo s 3 in pri�tejemo 1, �e je liho. Postopek ponavljamo,
dokler ne pridemo do �tevila 1 (v tem primeru stvar ni ve� zanimiva,
		saj se za�no ponavljati �tevila 1, 4, 2, 1, 4, 2, 1, ...).
Primer zaporedja, ki se za�ne z 6, je tako 6, 3, 10, 5, 16, 8, 4, 2, 
1. Collatzova domneva, ki trdi, da za poljubno naravno �tevilo
njegovo Collatzovo zaporedje s�asoma dose�e 1, je �e vedno
nere�ena.

    Sestavi funkcijo, ki izra�una dol�ino Collatzovega zaporedja,
    ki se za�ne s �tevilom n.
    Sestavi funkcijo, ki izra�una najve�ji �len v Collatzovem
    zaporedju, ki se za�ne s �tevilom n.
    Sestavi funkcijo, ki izpi�e vse �lene Collatzovega
    zaporedja, ki se za�ne s �tevilom n.*/
