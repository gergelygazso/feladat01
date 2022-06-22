


public class Feladat01 {

	//a program a színek számával megegyezõ számú paramétert vár
	public static void main(String[] args) {
		
		//TEST
		//String[] szinek = {"piros", "kék", "zöld"}; //3 elemû
		//String[] szinek = new String[]{}; //üres
		//String[] szinek = {"piros"}; //1 elemû
		//String[] szinek = {"piros", "kék"}; //2 elemû
		//System.out.println(feladat01(szinek));
		
		
		String[] szinek = args;
		System.out.println(feladat01(szinek));
		
		
	}
	
	//egy n elemû halmaz hatványhalmazának elemeinek száma 2^n
	//ebbõl még ki kell vonni az üres halmazt
	//illetve az egy elemû elemeket
	public static int feladat01(String[] szinek) {
		int hossz = szinek.length;
		return (int)Math.pow(2, hossz)-1-hossz;
	}
	
	public static int power(int szam, int kitevo) {
		int retVal = szam;
		
		if (kitevo == 0) {
			return 1;
		}
		
		for (int i = 1; i < kitevo; i++) {
			szam = szam * szam;
		}
		
		return retVal;
	}
	
	

}
