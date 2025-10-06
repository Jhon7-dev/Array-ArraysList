package EstudoDeCasoEmbaralhamento;

import java.util.Random;

public class DeckOfCards {
	private Card deck[]; // array de objetos
	private int currentCard; // índice do próximo Card a ser disctribuído
	private final int NUMBER_OF_CARDS = 52; // número constante de cartas
	private Random randomNumbers;

	public DeckOfCards() {
		String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eigth", "Nine", "Ten", "Jack",
				"Queen", "King" };
		String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

		deck = new Card[NUMBER_OF_CARDS]; // cria array de objetos Card
		currentCard = 0;
		randomNumbers = new Random(); // cria um sorteador

		// preenche o baralho com objetos Card

		for (int count = 0; count < deck.length; count++) {
			deck[count] = new Card(faces[count % 13], suits[count / 13]);

		}

	}

	public void shuffle() { // embaralha as cartas com um algoritmo de uma passagem
		// depois de embaralhar, a distribuição deve iniciar em deck[0] novamente
		currentCard = 0;

		// para cada Card, seleciona outro Card aleatório e os compara
		for (int first = 0; first < deck.length; first++) {
			// seleciona um número aleatório de 0-51

			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

			Card temp = deck[first];
			deck[first] = deck[second];
		}

	}

	public Card dealCard() {
		if (currentCard < deck.length) {
			return deck[currentCard++];
		} else {
			return null;
		}
	}

}
