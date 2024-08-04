package Ejercicio22;

import java.util.Random;
import java.util.Scanner;

class GameOf21 {
    private static final int MAX_POINTS = 21;
    private static final int DEALER_STAND_THRESHOLD = 17;
    private Random random;
    private Scanner scanner;

    // constructor
    public GameOf21() {
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    private int getCard() {
        return random.nextInt(10) + 1;  // Devuelve un número entre 1 y 10
    }

    private int calculateTotal(int[] hand) {
        int total = 0;
        for (int card : hand) {
            total += card;
        }
        return total;
    }

    private int[] addCard(int[] hand) {
        int[] newHand = new int[hand.length + 1];
        System.arraycopy(hand, 0, newHand, 0, hand.length);
        newHand[newHand.length - 1] = getCard();
        return newHand;
    }

    private boolean playerTurn(int[] playerHand) {
        boolean playerTurn = true;
        while (playerTurn) {
            int playerTotal = calculateTotal(playerHand);
            System.out.println("Tu puntuación actual: " + playerTotal);
            System.out.print("¿Quieres pedir otra carta? (sí/no): ");
            String decision = scanner.nextLine().trim().toLowerCase();
            if (decision.equals("sí")) {
                playerHand = addCard(playerHand);
                if (calculateTotal(playerHand) > MAX_POINTS) {
                    System.out.println("Te has pasado de 21. ¡Pierdes!");
                    return false;  // Termina el turno del jugador
                }
            } else {
                playerTurn = false;
            }
        }
        return true;
    }

    private void dealerTurn(int[] dealerHand) {
        while (calculateTotal(dealerHand) < DEALER_STAND_THRESHOLD) {
            dealerHand = addCard(dealerHand);
        }
    }

    public void startGame() {
        int[] playerHand = { getCard(), getCard() };
        int[] computerHand = { getCard(), getCard() };

        // turno del jugador
        if (!playerTurn(playerHand)) {
            return;  // El jugador se pasó de 21, termina el juego
        }

        // turno del dealer
        dealerTurn(computerHand);

        // resultados finales
        int playerTotal = calculateTotal(playerHand);
        int computerTotal = calculateTotal(computerHand);
        System.out.println("Tu puntuación final: " + playerTotal);
        System.out.println("Puntuación final de la computadora: " + computerTotal);

        if (playerTotal > MAX_POINTS) {
            System.out.println("Te has pasado de 21. ¡Pierdes!");
        } else if (computerTotal > MAX_POINTS || playerTotal > computerTotal) {
            System.out.println("¡Ganaste!");
        } else if (playerTotal < computerTotal) {
            System.out.println("¡Perdiste!");
        } else {
            System.out.println("¡Es un empate!");
        }
    }

    public static void main(String[] args) {
        GameOf21 game = new GameOf21();
        game.startGame();
    }
}
