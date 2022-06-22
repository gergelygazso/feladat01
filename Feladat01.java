


public class Feladat01 {

	//a program a sz�nek sz�m�val megegyez� sz�m� param�tert v�r
	public static void main(String[] args) {
		
		//TEST
		//String[] szinek = {"piros", "k�k", "z�ld"}; //3 elem�
		//String[] szinek = new String[]{}; //�res
		//String[] szinek = {"piros"}; //1 elem�
		//String[] szinek = {"piros", "k�k"}; //2 elem�
		//System.out.println(feladat01(szinek));
		
		
		String[] szinek = args;
		System.out.println(feladat01(szinek));
		
		
	}
	
	//egy n elem� halmaz hatv�nyhalmaz�nak elemeinek sz�ma 2^n
	//ebb�l m�g ki kell vonni az �res halmazt
	//illetve az egy elem� elemeket
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
