import java.util.Scanner;
import java.time.LocalDateTime;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;

public class Main {

  static String[] properties = { "<<GO>>", "Baltic Ave.", "Community Chest", "Reading Railroad", "Chance", "Vermont Ave.", 
                                "<JAILHOUSE>", "St.Charles Place", "Community Chest", "Pennyslvania Railroad", "Chance", "St.James Place", 
                                "<PARKING>", "Atlantic Ave.", "Community Chest", "B&O Railroad", "Chance", "Marvin Garden", 
                                "<<GO TO JAIL>>", "Pacific Ave", "Community Chest", "Short Line Railroad", "Chance", "Boardwalk" }; // 0 ~ 23
  
  static Integer[] level = { -1, 0, -3, -2, -3,0, 
                            -1, 0, -3, -2, -3, 0, 
                            -1, 0, -3, -2, -3, 0,
                            -1, 0, -3, -2, -3, 0 }; // 0 ~ 23

  static Integer[] ownership = { -1, 0, -3, 0, -3,0, 
                                -1, 0, -3, 0, -3, 0, 
                                -1, 0, -3, 0, -3, 0,
                                -1, 0, -3, 0, -3, 0 }; // 0 ~ 23

  static Integer[] price = { -1, 60, -3, 200, -3, 100, 
                             -1, 140, -3, 200, -3, 200, 
                             -1, 260, -3, 200, -3, 280,
                             -1, 300, -3, 200, -3, 400 };

  static Integer[] rent = { -1, 36, -3, 25, -3, 60, 
                            -1, 84, -3, 25, -3, 120, 
                            -1, 16, -3, 25, -3, 168,
                            -1, 180, -3, 25, -3, 240 };
  
  public String landProperty(String addMinus, double changeAmount, int gotPaid, int paid, int index) {
    return "10";
  }

  public static void main(String[] args) {
    Graphics g = new Graphics(); // Creates graphic Obj
    Scanner userin = new Scanner(System.in);// Creates Scanner Obj
      String userEnter = ""; //used for enter to continue
    // Scanner userin2 = new Scanner(System.in);
    // Scanner userin3 = new Scanner(System.in);
    // Scanner userin4 = new Scanner(System.in);
    Board board = new Board();
    Random rng = new Random();
    PlayerClass P1 = new PlayerClass();
    PlayerClass P2 = new PlayerClass();
    PlayerClass P3 = new PlayerClass();
    PlayerClass P4 = new PlayerClass();
    PlayerClass T = new PlayerClass();
    // Variables
    int dicenum = 0;
    int numberOfPlayers = 0;

    // <<<TITLE SCREEN>>>//
    g.clearScreen();
    board.printBoard();
    g.enter(2);

    // GET PLAYER NUMBERS
    boolean correctIN = false;
    while (correctIN == false) {
      g.print("How many players? (2 ~ 4)  >   ");
      numberOfPlayers = userin.nextInt();
      if (numberOfPlayers < 2 || numberOfPlayers > 4) {
        g.pline("  **Please input a number from 2 to 4!");
        g.enter(1);
      } else {
        correctIN = true;
      }
      g.enter(1);
    }
    // GET PLAYER NAMES
    Scanner userin1 = new Scanner(System.in);
    g.print("Player 1: What's your name?  >  ");
    P1.getPlayerName(userin1.nextLine());
    g.enter(1);

    Scanner userin2 = new Scanner(System.in);
    g.print("Player 2: What's your name?  >  ");
    P2.getPlayerName(userin2.nextLine());
    g.enter(1);

    if (numberOfPlayers >= 3) {
      Scanner userin3 = new Scanner(System.in);
      g.print("Player 3: What's your name?  >  ");
      P3.getPlayerName(userin3.nextLine());
      g.enter(1);
    }
    if (numberOfPlayers == 4) {
      Scanner userin4 = new Scanner(System.in);
      g.print("Player 4: What's your name?  >  ");
      P4.getPlayerName(userin4.nextLine());
      g.enter(1);
    }
    g.clearScreen();

    int activePlayer = 1;
    boolean gameOnGoing = true;
    Scanner userEnterRoll = new Scanner(System.in);
    while (gameOnGoing == true) {
      //<<Resets Board>>//
      g.clearScreen();
      //board.listBoard();

      //Import player data
      switch (activePlayer) {
        case 1:
          T.name = P1.name;
          T.position = P1.position; //0 is at GO
          T.funds = P1.funds;
          T.property = P1.property;
          T.propertyLevel = P1.propertyLevel;
          T.outOfJail = P1.outOfJail;   
          break;
        case 2 :
          T.name = P2.name;
          T.position = P2.position; //0 is at GO
          T.funds = P2.funds;
          T.property = P2.property;
          T.propertyLevel = P2.propertyLevel;
          T.outOfJail = P2.outOfJail;   
          break;
        case 3:
          T.name = P3.name;
          T.position = P3.position; //0 is at GO
          T.funds = P3.funds;
          T.property = P3.property;
          T.propertyLevel = P3.propertyLevel;
          T.outOfJail = P3.outOfJail;   
          break;
        case 4:
          T.name = P4.name;
          T.position = P4.position; //0 is at GO
          T.funds = P4.funds;
          T.property = P4.property;
          T.propertyLevel = P4.propertyLevel;
          T.outOfJail = P4.outOfJail;   
          break;
      }
      
      //Shows cycled player
      g.print(g.CYAN_U);
      g.pline("<<It is Player " + activePlayer + "'s turn! [Enter] to roll the dice!>>");
      g.print(g.RESET);      

      //Rolls Dice
      userEnter = userEnterRoll.nextLine();
      dicenum = rng.nextInt(6) + 1;
      g.pline("You rolled a " + dicenum + "!  Move forward " + dicenum + " spaces.");
      T.editPosition("+", dicenum);
      g.pline("  >  Player "+activePlayer+" landed on [" + T.position + ". " + properties[T.position]+"]");
      g.enter(1);
      
      //if Chance or Community Chest -> display card (make array of stuff to say in the card)
      //if house, ask to purchase
      //if railroad, ask to purchase
      //Jail and GO
      
      if ((T.position == 2) || (T.position == 4) || (T.position == 8) || (T.position == 10)||(T.position == 14) || (T.position == 16) || (T.position == 20) || (T.position == 22)) {
        T.cardChest(rng.nextInt(10)+1);
      } else if ((T.position == 0)){
        T.funds = T.funds + 200;
      } else if ((T.position == 18)){
        T.position = 6;
      } else {
        //checks to see if purchased -- if it is, pay up -- if not then continue to ask
        if (ownership[T.position] == 0) {
          if(T.funds >= price[T.position]){ //non purchased
            Scanner useraskPurchase = new Scanner(System.in);
           
            g.pline("Would you like to purchase "+ properties[T.position]+"? (Y/N)");
            String purchaseLand = useraskPurchase.nextLine();
           
            if (purchaseLand.equalsIgnoreCase("y")){
              Scanner userenterPurchase = new Scanner(System.in);
              g.pline("Press enter to purchase");
              String enterPurchase = userenterPurchase.nextLine();
              T.funds = T.funds - price[T.position];
              ownership[T.position]= activePlayer;
              if ((T.position ==3)
            } else {
                g.pline("Okay");
            }
           } else {
              g.pline("You do not have enough funds to purchase this property :(");
           }
          
        } else if (ownership[T.position]>0) { //purchased and pay up
          g.pline("You landed on someone else's property");
          Scanner userenterRent = new Scanner(System.in);
          g.pline("Enter to pay Rent for "+properties[T.position]+": "+rent[T.position]);
          String enterRent = userenterRent.nextLine();
        }
      }   
      }

      //<<Exports Data>>//
      switch (activePlayer) {
        case 1:
          P1.name = T.name;
          P1.position = T.position; //0 is at GO
          P1.funds = T.funds;
          P1.property = T.property;
          P1.propertyLevel = T.propertyLevel;
          P1.outOfJail = T.outOfJail;   
          break;
        case 2 :
          P2.name = T.name;
          P2.position = T.position; //0 is at GO
          P2.funds = T.funds;
          P2.property = T.property;
          P2.propertyLevel = T.propertyLevel;
          P2.outOfJail = T.outOfJail;   
          break;
        case 3:
          P3.name = T.name;
          P3.position = T.position; //0 is at GO
          P3.funds = T.funds;
          P3.property = T.property;
          P3.propertyLevel = T.propertyLevel;
          P3.outOfJail = T.outOfJail;   
          break;
        case 4:
          P4.name = T.name;
          P4.position = T.position; //0 is at GO
          P4.funds = T.funds;
          P4.property = T.property;
          P4.propertyLevel = T.propertyLevel;
          P4.outOfJail = T.outOfJail;   
          break;
      }
      
      //Continues to next player
      g.enterCont();
      activePlayer++;

      if (activePlayer > numberOfPlayers) {
        activePlayer = 1;
      }
    } // gameOnGoing

  }// AtruerueGS
}// class

//goes through each with switch cases, if position = there prints the [player]
//use a b c d and 1 2 3 together to mark who is where and owns what