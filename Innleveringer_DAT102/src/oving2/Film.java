package oving2;

public class Film {
	
	private int filmNr;
	private String produsent;
	private String tittel;
	private int år;
	private enum sjanger {ACTION, KRIM, KOMEDIE}; //Sikkert feil...
	private String filmSelskap;
	
	public Film () {
		
	}
	
	public Film (int filmNr, String produsent, String tittel, int år, String filmSelskap) { //Mangler enum
		this.filmNr = filmNr;
		this.produsent = produsent;
		this.tittel = tittel;
		this.år = år;
		//ENUM
		this.filmSelskap = filmSelskap;
	}
	
}




