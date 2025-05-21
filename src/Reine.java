public class Reine extends Piece {

    public Reine(Position position) {
        super(position);
    }

     public boolean isValidMove(Position newPosition) {

         int rowDiff = Math.abs(newPosition.row - this.position.row);
         int colDiff = Math.abs(newPosition.column - this.position.column);
         // déplacement de la reine
         if (newPosition.row == this.position.row ||
                 newPosition.column == this.position.column ||
                 rowDiff == colDiff) {
            return true;
        } else {
            return false;
        }
    }
}
