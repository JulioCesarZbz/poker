package poker.entities;

//A classe card representa uma carta do baralho
public class Card {
	private final String face; //face da carta("Ace", "Deuce", etc...)
	private final String suit; //naipe da carta ("Hearts", "Diamonds", etc...)
	
	//construtor de dois argumentos, inicializa face e naipe da carta
	public Card(String cardFace, String cardSuit) {
		super();
		this.face = cardFace;
		this.suit = cardSuit;
	}

	//retorna representação String de card
	@Override
	public String toString() {
		return face + " of " + suit;
	}
}
