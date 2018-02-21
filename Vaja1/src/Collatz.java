
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

Collatzovo zaporedje tvorimo na sledeè naèin. Zaènemo z nekim
naravnim številom n, ki ga nato delimo z 2, èe je sodo, ali pa
pomnožimo s 3 in prištejemo 1, èe je liho. Postopek ponavljamo,
dokler ne pridemo do števila 1 (v tem primeru stvar ni veè zanimiva,
		saj se zaèno ponavljati števila 1, 4, 2, 1, 4, 2, 1, ...).
Primer zaporedja, ki se zaène z 6, je tako 6, 3, 10, 5, 16, 8, 4, 2, 
1. Collatzova domneva, ki trdi, da za poljubno naravno število
njegovo Collatzovo zaporedje sèasoma doseže 1, je še vedno
nerešena.

    Sestavi funkcijo, ki izraèuna dolžino Collatzovega zaporedja,
    ki se zaène s številom n.
    Sestavi funkcijo, ki izraèuna najveèji èlen v Collatzovem
    zaporedju, ki se zaène s številom n.
    Sestavi funkcijo, ki izpiše vse èlene Collatzovega
    zaporedja, ki se zaène s številom n.*/
