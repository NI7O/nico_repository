package circle;

public class Circle {

	String mColor;
	private double mRadius;


	// Konstruktor
	public Circle(String mColor, double mRadius) {
		this.mColor = mColor;
		this.mRadius = mRadius;
	}

	// Getter und Setter
	public String getColor() {
		return mColor;
	}

	public double getRadius() {
		return mRadius;
	}

	public void setRadius(double mRadius) {
		this.mRadius = mRadius;
	}


	// Funktionen
	// Fläche berechnen
	public double calculateArea(){
		return this.mRadius*this.mRadius * Math.PI;
	}

	// Flächendifferenz berechnen
	public double calculateAreaDifference(Circle c) {
		return Math.abs(this.calculateArea() - c.calculateArea());
	}

	// Kreisfarben vergleichen
	public boolean hasColorAs(Circle c){

		if(this.getColor().equals(c.getColor())){
			return true;	
		}
		else {
			return false;
		}

	}

	// print Informations
	public void printInfo(){
		System.out.println("Der Kreis mit der Farbe " + 
				this.mColor + " und dem Radius " + this.getRadius() +
				" hat die Fläche " + this.calculateArea());
	}


}