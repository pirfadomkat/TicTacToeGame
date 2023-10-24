public class Game {
    private char[][] board;
    private char currentPlayer;

    public Game() {
        board = new char[3][3];
        currentPlayer = 'X';
    }

    public Game(char[][] board, char currentPlayer) {
        this.board = board;
        this.currentPlayer = currentPlayer;
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean makeMove(int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != 0) {
            return false;
        }
        board[row][col] = currentPlayer;
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        return true;
    }

    public char checkWin() {
        // Implement win-checking logic
        // Return 'X' if X wins, 'O' if O wins, 'D' for draw, or 'N' for no result yet
        return 'N';
    }

    public void reset() {
        // Reset the game
        board = new char[3][3];
        currentPlayer = 'X';
    }
}