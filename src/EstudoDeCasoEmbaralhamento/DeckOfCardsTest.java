package EstudoDeCasoEmbaralhamento;

public class DeckOfCardsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); // Embaralha as cartas
		for (int i = 0; i < 13; i++) {
			System.out.printf("%-20s%-20s%-20s%-20s\n",myDeckOfCards.dealCard(),myDeckOfCards.dealCard(),myDeckOfCards.dealCard(),myDeckOfCards.dealCard());
		}

	}

}
