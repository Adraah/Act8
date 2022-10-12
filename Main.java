import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CardsDeck Deck = new CardsDeck();

        Deck.reset();
        System.out.println("Se mezclo el deck!");
        System.out.println("Primera carta: "+ Deck.getFirst());
        Deck.cardsLeft();
        System.out.println("Carta al azar: "+ Deck.pullRandom());
        Deck.cardsLeft();
        System.out.println("Mano:" + Arrays.toString(Deck.hand().toArray()));
        Deck.cardsLeft();
    }
}