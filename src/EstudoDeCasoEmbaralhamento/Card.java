package EstudoDeCasoEmbaralhamento;

public class Card {
	private String face; // face da carta
	private String suit; // naipe da carta
	
	public Card(String cardFace,String cardSuit) {
		face = cardFace;
		suit = cardSuit;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String toString() {
		return face + " of " + suit;
	}

}
