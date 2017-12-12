package kaffe;

public class Kaffee {

	// Variablen - Attribute
	private int koffeingehalt;
	private String farbe;
	private String herkunft;
	
	//KONSTRUKTOR - Public [Name von Klasse]
	public Kaffee(){
		
	}
	
	public Kaffee(int koffeingehalt, String farbe, String herkunft){
		
		this.koffeingehalt = koffeingehalt;
		this.farbe = farbe;
		this.herkunft = herkunft;
	}

	public Kaffee(String farbe, String herkunft){
		this.koffeingehalt = -1;
		this.farbe = farbe;
		this.herkunft = herkunft;
		
	}
	
	
	//FUNKTIONEN
	public void einschenken(){
		System.out.println("Kaffee von " + this.getHerkunft() + " wird ausgeschenkt");
	}
	
	
	
	// Getter Setter
	public int getKoffeingehalt() {
		return koffeingehalt;
	}

	public void setKoffeingehalt(int koffeingehalt) {
		this.koffeingehalt = koffeingehalt;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public String getHerkunft() {
		return herkunft;
	}

	public void setHerkunft(String herkunft) {
		this.herkunft = herkunft;
	}


	
}
