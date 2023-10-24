public class Game {
    private char[][] board;
    private char currentPlayer;
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to X and O (Tic-Tac-Toe) Game!");
        System.out.println("Let's get started.");

        // Main game loop
        while (true) {
            char currentPlayer = game.getCurrentPlayer();
            System.out.println("Current player: " + currentPlayer);
            System.out.print("Enter row (0-2) and column (0-2) to make a move (e.g., 1 1): ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            boolean validMove = game.makeMove(row, col);

            if (!validMove) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            // Check for a win or draw
            char result = game.checkWin();
            if (result == 'X' || result == 'O') {
                System.out.println("Player " + result + " wins!");
                break;
            } else if (result == 'D') {
                System.out.println("It's a draw!");
                break;
            }
        }

        scanner.close();
    }

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
