import java.util.Scanner;
import java.time.LocalDateTime;
import java.lang.Math;
import java.util.ArrayList;

public class Main {

  static String[] properties = {"<<GO>>", "Baltic Ave.", "??? Chest", "Reading Railroad", "Chance", "Vermont Ave.", "<JAILHOUSE>", "St.Charles Place", "??? Chest", "Pennyslvania Railroad", "??? Chest", "St.James Place", "<PARKING>", "Kentucky Ave.", "Chance", "B&O Railroad", "Chance", "Marvin Garden", "<<GO TO JAIL>>", "Park Place", "??? Chest", "Short Line", "Chance", "Boardwalk"}; //0 ~ 23


  public String landProperty (String addMinus, double changeAmount, int gotPaid, int paid, int index) {
    return "10";
  }
  
  public static void main(String[] args) {
    Graphics g = new Graphics(); // Creates graphic Obj
    Scanner userin = new Scanner(System.in); // Creates Scanner Obj
    Board board = new Board();
   //Variables
      
    int numberOfPlayers = 0;

    // <<<TITLE SCREEN>>>//
    g.clearScreen();
    board.printBoard();
    g.enter(2);

    //GET PLAYER NUMBERS
    boolean correctIN = false;
    while (correctIN == false) {
      g.print("How many players? (2 ~ 4)  >   ");
      numberOfPlayers = userin.nextInt();
      if (numberOfPlayers < 2 || numberOfPlayers > 4) {
        g.pline("  **Please input a number from 2 to 4!");
        g.enter(1);
      } else {
        PlayerClass P1 = new PlayerClass();
        PlayerClass P2 = new PlayerClass();
        if (numberOfPlayers >= 3) {
          PlayerClass P3 = new PlayerClass();
        } if (numberOfPlayers == 4) {
          PlayerClass P4 = new PlayerClass();
        }
          correctIN = true;
      }
    }

    //GET PLAYER NAMES
    g.print("Player 1: What's your name?  >  ");
      P1.name = userin.nextLine();
    enter(1);
    g.print("Player 2: What's your name?  >  ");
      P2.name = userin.nextLine();
    enter(1);
      if (numberOfPlayers >= 3) {
        g.print("Player 3: What's your name?  >  ");
          P3.name = userin.nextLine();
        enter(1);
      } if (numberOfPlayers == 4) {
        g.print("Player 1: What's your name?  >  ");
          P4.name = userin.nextLine();
        enter(1);
      }
    //g.clearScreen();


    
  }//ARGS
}//class
