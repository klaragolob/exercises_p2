import java.io.*;

public class steviloBesed {

	public static void main(String[] args)throws IOException {
		int a = stBesed("Hisa_marije_pomoènice.txt", "Izpis");
		System.out.println(a);

	}
	public static int stBesed (String imeVhod, String imeIzhod) throws IOException {
		BufferedReader vhod = new BufferedReader(new FileReader(imeVhod));
		PrintWriter izhod = new PrintWriter(new FileWriter(imeIzhod)); 
		int x = 0;
		while (vhod.ready()){
			String vrstica = vhod.readLine().trim();
			if(vrstica.equals("")) continue;
			String[] besede = vrstica.split(" +");
			for (String i : besede){
				x += 1;
				izhod.println(i);
			}

		}
		vhod.close();
		izhod.close();
		return x;
	}	
		
}
