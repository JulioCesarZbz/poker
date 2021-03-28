package poker.entities;
// A classe eck of cards representa o baralho

import java.security.SecureRandom;

public class DeckOfCards {
	
	private Card[] deck; //Array de objetos card
	private int currentCard; //Indice da proxima Card a ser distribuida(0-51)
	private static final int NUMBER_OF_CARDS = 52; //numero constante de cartas
	
	//gerador de numero aleatório
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	//Construtor preenche baralho de cartas
	public DeckOfCards() {
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
	
		deck = new Card[NUMBER_OF_CARDS]; //Cria array de objetos card
		currentCard = 0;//a primeira card distibuida será o deck [0]
		
		//preenche baralho com objetos card
		for(int count = 0; count < deck.length; count++)
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
	}
	
	//embaralha as cartas com algoritmo de passagem
	public void shuffle() {
		//a proxima chamada para o metodo dealCard deve começar no deck[0] novamente
		currentCard = 0;
		
		//para cada Card, seleciona outra Card aleatoria (0-51) e as compara
		for(int first=0; first < deck.length; first++) {
			
		//seleciona um numero aleatorio entre 1 e 51
		int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
		
		//compara Card atual com Card aleatoriamente selecionada
		Card temp = deck[first];
		deck[first] = deck[second];
		deck[second] = temp;
		
		}
	}
	
	//distrubui uma Card
	public Card dealCard() {
		//determina se ainda há cartas a serem distribuidas
		if (currentCard < deck.length)
			return deck[currentCard++];//retorna Card atual no array
		else
			return null;//retorna nulo para indir que todas as Cards foram distribuidas
	}
}//fim da classe DeckOfCards
