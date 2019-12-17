public class game {
    private gameBoard board;

    public game(){
        board = new gameBoard();
    }

    public static void main(String argv[]) {
        game g = new game();
        g.board.printBoard();
    }
}
