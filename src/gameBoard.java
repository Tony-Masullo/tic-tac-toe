public class gameBoard {
    private String[][] theBoard = new String[3][3];

    public gameBoard() {
        for (int row=0; row < theBoard.length; row++)
            for (int col = 0; col < theBoard[row].length; col++) {
                this.theBoard[row][col] = "*";
            }
    }

    public void printBoard(){
        for (int row=0; row < this.theBoard.length; row ++){
            for (int col = 0; col < this.theBoard[row].length; col++) {
                System.out.print("|__" + this.theBoard[row][col] + "__|");
            }
            System.out.println("");
        }
    }

    public void updateBoard(int row, int col, String piece){
        this.theBoard[row][col] = piece;
    }
}