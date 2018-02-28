
public class cleniZaporedja {

	public static void main(String[] args) {
		System.out.println(cleniZaporedja("121212"));

	}
	public static String cleniZaporedja (String s){
		String t = "";
		int i = 0;
		while (i < s.length()) {
			while (i < s.length() && s.charAt(i) == s.charAt(i+1)){
				i += 1;
			}
			int k = i;
			t += k + s.charAt(i);

		}
		return t;
	}

}
