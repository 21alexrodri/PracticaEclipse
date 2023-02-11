
public class Cercle {
	/**
	 * radi del cercle:
	 */
	double radi;
	
	/**
	 * Constructor, assigna al cercle el radi indicat
	 * @param r  radi del cercle:
	 */
	Cercle(double r) {
		radi=r;
	}
	
	public String toString() {
		return ""+radi;
	}
	
	/**
	 * Calcula l'àrea del cercle segons Pi*radi^2
	 * @return l'àrea calculada:
	 */
	double area() {
		return Math.PI*Math.pow(radi, 2);
	}
}

/**
 * Defineix una Corona Circular
 *
 */
class Corona {
	/**
	 * Cercle intern
	 */
	Cercle petit;
	/**
	 * Cercle extern
	 */
	Cercle gran;
	
	/**
	 * Assigna els cercles a la Corona
	 * @param p  intern petit
	 * @param g  extern gran
	 */
	Corona(Cercle p, Cercle g) {
		petit=p;
		gran=g;
	}
	
	public String toString() {
		return "cercle gran "+gran+" cercle petit "+petit;
	}
	
	/**
	 * Calcula l'àrea de la Corona
	 * @return el valor obtingut
	 */
	double area() {
		return gran.area()-petit.area();
	}
}
