package ejercicio2; // Declara que esta clase pertenece al paquete "ejercicio2"

import java.util.ArrayList; // Importa la clase ArrayList para manejar listas dinámicas

// Clase principal que simula un mazo de cartas (Deck of Cards)
public class DeckCards {

    public static void main(String[] args) {

        // Array de cadenas que representa los palos de las cartas
        String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
        // Array de cadenas que representa los valores de las cartas
        String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

        // Lista dinámica para almacenar las cartas del mazo
        ArrayList<Card> deck = new ArrayList<Card>();

        // Genera todas las combinaciones de palos y valores para crear un mazo completo
        for (int i = 0; i < suits.length; i++) { // Recorre los palos
            for (int j = 0; j < values.length; j++) { // Recorre los valores
                // Crea una carta con el palo y valor actuales
                Card card = new Card(suits[i], values[j]);
                // Agrega la carta al mazo
                deck.add(card);
            }
        }

        // Baraja las cartas en el mazo
        for (int i = 0; i < deck.size(); i++) {
            // Genera un índice aleatorio entre 0 e i
            int j = (int) Math.floor(Math.random() * i);
            // Intercambia las cartas en las posiciones i y j
            Card tmp = deck.get(i); // Almacena temporalmente la carta de la posición i
            deck.set(i, deck.get(j)); // Reemplaza la carta en la posición i con la de la posición j
            deck.set(j, tmp); // Coloca la carta temporal en la posición j
        }

        // Imprime las primeras 5 cartas del mazo
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i)); // Muestra la carta en la posición i
        }

    }

}

