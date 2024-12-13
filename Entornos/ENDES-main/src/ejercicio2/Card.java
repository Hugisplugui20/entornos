package ejercicio2; // Declara que esta clase pertenece al paquete "ejercicio2"

// Clase que representa una carta de un mazo de cartas
public class Card {

    // Atributos que representan el palo y el valor de la carta
    public String suit;  // El palo de la carta (por ejemplo, "Hearts", "Spades", etc.)
    public String value; // El valor de la carta (por ejemplo, "Ace", "2", "King", etc.)
    
    // Constructor que inicializa una nueva carta con el palo y el valor proporcionados
    public Card(String suit, String value) {
        this.suit = suit;   // Asigna el palo de la carta
        this.value = value; // Asigna el valor de la carta
    }
    
    // Método que devuelve una representación en cadena de la carta
    @Override
    public String toString() {
        // Devuelve una cadena con el formato "palo-valor", por ejemplo "Hearts-Ace"
        return (this.suit + "-" + this.value);
    }
}
