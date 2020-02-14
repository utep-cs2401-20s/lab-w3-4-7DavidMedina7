import javafx.scene.input.TouchEvent;

public class TorusGameOfLife extends GameOfLife {

    // **Constructors**

    // Default constructor
    public TorusGameOfLife() {}

    // Constructor that takes a size as input
    // (this will be the number of rows as well as the number of columns of your board and previous)
    public TorusGameOfLife(int size) {
        this.size = size;
        gameBoard = new int[size][size];
        previousBoard = new int[size][size];
    }

    // Constructor that takes a 2D array as an input
    // (its size will be the size of the board and previous; its content is to be copied into previous)
    public TorusGameOfLife(int[][] board) {

        // Saving board's size to size: board.length
        this.size = board.length;

        // Initializing previousBoard to boardSize
        previousBoard = new int[this.size][this.size];

        // Nested for loop to copy board (parameter) to previousBoard
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                previousBoard[i][j] = board[i][j];
            }
        }

        // Initializing gameBoard to boardSize
        gameBoard = board;
    }

    // Inherited methods: neighbors(), oneStep(), evolution()
    @Override
    public int neighbors (int row, int col) {
        int numOfNeighbors = 0;

        /*for(int i = row - 1; i <= row + 1; i++) {
            for(int j = col - 1; j <= col + 1; j++) {

                // Checking if coordinate is out of bounds
                if(i < 0 || i >= gameBoard.length || j < 0 || j >= gameBoard[i].length) {
                    // It is out of bound
                    continue;
                }

                // Checking the other wrapping neighbors
                if(gameBoard[i % size][j % size] == 1) {
                    numOfNeighbors++;
                }

                // Ignoring the coordinate we are checking
                if(row == i && col == j) {
                    continue;
                }

                // Checking if it is a live neighbor
                if(gameBoard[i][j] == 1) {
                    numOfNeighbors++;
                }
            }
        }*/

        // Checking the top coordinate
        if(gameBoard[(row - 1 + size) % size][(col + size) % size] == 1) {
            numOfNeighbors++;
        }

        // Checking the bottom coordinate
        if(gameBoard[(row + 1 + size) % size][(col + size) % size] == 1) {
            numOfNeighbors++;
        }

        // Checking the left coordinate
        if(gameBoard[(row + size) % size][(col - 1 + size) % size] == 1) {
            numOfNeighbors++;
        }

        // Checking the right coordinate
        if(gameBoard[(row + size) % size][(col + 1 + size) % size] == 1) {
            numOfNeighbors++;
        }

        // Checking the top left coordinate
        if(gameBoard[(row - 1 + size) % size][(col - 1 + size) % size] == 1) {
            numOfNeighbors++;
        }

        // Checking the top right coordinate
        if(gameBoard[(row - 1 + size) % size][(col + 1 + size) % size] == 1) {
            numOfNeighbors++;
        }

        // Checking the bottom left coordinate
        if(gameBoard[(row - 1 + size) % size][(col + 1 + size) % size] == 1) {
            numOfNeighbors++;
        }

        // Checking the bottom right coordinate
        if(gameBoard[(row + 1 + size) % size][(col + 1 + size) % size] == 1) {
            numOfNeighbors++;
        }

        return numOfNeighbors;
    }

    // Takes no parameter and is a void method
    // Consists in transforming the current board into its next shape (board at next time stamp)
    public void oneStep() {

        /* System.out.print("Current Board:");
        printBoard();

        System.out.print("\n\nPrevious Board:");
        printPrevious(); */

        // Copying current board to previous board
        for(int row = 0; row < gameBoard.length; row++) {
            for(int col = 0; col < gameBoard[row].length; col++) {
                previousBoard[row][col] = gameBoard[row][col];
            }
        }

        // Iterating through previous board
        for(int i = 0; i < previousBoard.length; i++) {
            for(int j = 0; j < previousBoard[i].length; j++){

                // Calling neighbors() method to figure out number of neighbors
                int numOfNeighbors = neighbors(i, j);

                // **Applying the rules of Game of Life**

                // If the cell is alive
                if(previousBoard[i][j] == 1) {

                    // Any live cell with fewer than two live neighbors dies
                    if(numOfNeighbors <= 2) {
                        previousBoard[i][j] = 0;
                    }

                    // Any live cell with two or 3 live neighbors lives
                    if(numOfNeighbors == 2 || numOfNeighbors == 3) {
                        //continue;
                        previousBoard[i][j] = 1;
                    }

                    // Any live cell with more than three live neighbors dies
                    if(numOfNeighbors > 3) {
                        previousBoard[i][j] = 0;
                    }
                }

                // If the cell is dead
                if(previousBoard[i][j] == 0){

                    // Any dead cell with exactly three live neighbors becomes a live cell
                    if(numOfNeighbors == 3) {
                        previousBoard[i][j] = 1;
                    }
                }
            }
        }

        // Updating current board with previous' board information
        for(int x = 0; x < previousBoard.length; x++) {
            for(int y = 0; y < previousBoard[x].length; y++) {
                gameBoard[x][y] = previousBoard[x][y];
            }
        }

        /*System.out.print("\n\nCurrent Board:");
        printBoard();

        System.out.print("\n\nPrevious Board:");
        printPrevious(); */

    }

    // Takes an integer n, which represents t  he number of evolution steps we need to conduct
    // Transforms the board into the board after n steps of evolution
    public void evolution(int n) {

        System.out.print("Generation 0:");
        printBoard();
        int generation = 1;
        // Call oneStep() "n" times to reduce the number of generations to go through
        while(n != 0) {

            oneStep();
            System.out.print("\n\nGeneration " + generation + ":");
            printBoard();

            generation++;
            n--;
        }

    }

    // Prints the current game board
    public void printBoard() {
        for(int i = 0; i < gameBoard.length; i++) {
            System.out.println();
            for(int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
        }
    }

    // Prints the previous game board
    public void printPrevious() {
        for(int i = 0; i < previousBoard.length; i++) {
            System.out.println();
            for(int j = 0; j < previousBoard[i].length; j++) {
                System.out.print(previousBoard[i][j] + " ");
            }
        }
    }
}
