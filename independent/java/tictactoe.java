import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int size = 3;
    int turnsCounter = 0;
    String[][] grid = new String[size][size];
    Scanner scanner = new Scanner(System.in);
    String playerTurn = "X";
    
    System.out.println("Welcome to Tic-Tac-Toe! Enter the number on the board to place your mark.");
    System.out.println();
    initGrid(grid);
    printGrid(grid);
    System.out.println();
    
    while (true) {
      System.out.print("Player " + playerTurn + " turn, please enter a number: ");
      turnsCounter++;
      int inputNumber = scanner.nextInt();
      updateGrid(grid, inputNumber, playerTurn);
      System.out.println();
      printGrid(grid);
      System.out.println();

      if (checkRows(grid) || checkColumns(grid) || checkDiagonals(grid)) {
        System.out.println("Player " + playerTurn + " wins!");
        break;
      }
      
      if (turnsCounter == size * size) {
        System.out.println("It's a draw, game over!");
        break;
      }
      
      if (playerTurn.equals("X")) {
        playerTurn = "O";
      } else {
        playerTurn = "X";
      }
    }
    
    scanner.close();
  }

  public static void initGrid(String[][] grid) {
    int nr = 1;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        grid[i][j] = String.valueOf(nr);
        nr++;
      }
    }
  }

  public static void printGrid(String[][] grid) {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        System.out.print(grid[i][j] + " | ");
      }
      System.out.println();
    }
  }

  public static void updateGrid(
      String[][] grid,
      int inputNumber,
      String playerMark) {
    int nr = 1;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (inputNumber == nr) {
          grid[i][j] = playerMark;
        }
        nr++;
      }
    }
  }

  public static boolean checkRows(String[][] grid) {
    for (int i = 0; i < 3; i++) {
      if (grid[i][0].equals(grid[i][1])
          && grid[i][2].equals(grid[i][1])) {
        return true;
      }
    }

    return false;
  }

  public static boolean checkColumns(String[][] grid) {
    for (int i = 0; i < 3; i++) {
      if (grid[0][i].equals(grid[1][i])
          && grid[2][i].equals(grid[1][i])) {
        return true;
      }
    }
    
    return false;
  }

  public static boolean checkDiagonals(String[][] grid) {
    if (grid[0][0].equals(grid[1][1])
        && grid[2][2].equals(grid[1][1])) {
      return true;
    }
    if (grid[0][2].equals(grid[1][1])
        && grid[2][0].equals(grid[1][1])) {
      return true;
    }
    
    return false;
  }
}
