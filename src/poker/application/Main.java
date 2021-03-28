package poker.application;

import poker.entities.DeckOfCards;

//Embaralhando e distribuindo cartas
public class Main {

	public static void main(String[] args) {
		
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); //coloca Cards em ordem aleatoria
		
		//imprime todas as 52 cartas na ordem em que elas são distribuidas
		for (int i=1; i <= 52; i++) {
			
			//distribui e exibe um Card
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			
			if (i % 4 == 0)//gera uma nova linha após cada quarta carta
				System.out.println();
		}

	}

}
