package kaffe;

public class Kaffeemaschine {

	
	public static void main(String[] args) {
		
		
		int x;
		//DATENTYP, NAME = new DATENTYP();
		Kaffee dallmayerkaffe =  new Kaffee(3, "blau", "austria");
		Kaffee neu = new Kaffee("blau","deutschland");
		
		dallmayerkaffe.einschenken();
		neu.einschenken();
		
		
	}
	
	
	
}
