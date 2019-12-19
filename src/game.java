import java.util.Scanner;

public class game {
    private gameBoard board;

    public game(){
        board = new gameBoard();
    }

    public static void main(String argv[]) {
        game g = new game();
        boolean gameFinished = false;

        while (!gameFinished) {
            g.board.printBoard();

            Scanner nextMove = new Scanner(System.in);
            System.out.println("Enter the row of your move: ");
            int row = nextMove.nextInt();
            System.out.println("Enter the col of your move: ");
            int col = nextMove.nextInt();
            g.board.updateBoard(row, col,"X");
            g.board.printBoard();

            /* temporary assignment so no infinite loop */
            gameFinished = true;
        }
    }
}
