
public class Main {
    public static void main(String[] args) {
        Position start = new Position(4, 4);
                Reine reine = new Reine(start);

                Position target = new Position(5, 6); // déplacement en diagonale
                if (reine.isValidMove(target)) {
                    System.out.println("Yes, I can move there.");
                } else {
                    System.out.println("Nope, can't do!");

        }
    }
}