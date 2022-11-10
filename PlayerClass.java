import java.util.Scanner;
import java.time.LocalDateTime;
import java.lang.Math;
import java.util.ArrayList;

public class PlayerClass {

  //Player Name
  String name = "";

  public void getPlayerName(String input) {
    name = "[" + input + "]" ;
    
  }

  //Player Stats
  int position = 0; //0 is at GO
  double funds = 1500;

  //Player P roperties
  ArrayList<Integer> property = new ArrayList<Integer>();
  ArrayList<Integer> propertyLevel = new ArrayList<Integer>();
  int numofRail  = 0;

  //Player jail?
  boolean outOfJail = false;

  public String editFunds (String addMinus, double changeAmount) {
    String output = "";
    
    if (addMinus == "+") {
      funds = funds + changeAmount;
      output = name + " collected $" +  + decimalTwo(funds);
    } else {
      funds = funds - changeAmount;
      output = name + " paid $" + decimalTwo(funds);
    }

    funds = decimalTwo(funds);
    return "";
  }

  public String editPosition (String addMinus, int changeAmount) {
    String output = "";
    
    if (addMinus == "+") {
      position = position + changeAmount;
      output = name + " moved forward " + changeAmount;
    } else {
      position = position - changeAmount;
      output = name + " moved backward " + changeAmount;
    }

    //Tests for loop around
    int extra = 0;
    if (position > 23) {
      extra = position - 24;
      position = extra;
      
    } else if (position < 0){
      extra = position * -1;
      position = 24 - extra; 
    }

    funds = decimalTwo(funds);
    return "";
  }
  public double decimalTwo (double input) {
    double output = input *100;
    output = Math. round(output);
    output = output /100;
    return output;
  }

  public void cardChest(int random){
    Graphics g = new Graphics();

    g.print("  >> ");
      
      switch (random) {
        case 1:
          g.pline("Bank error in your favor. Collect $200");
          funds = funds + 200;
          break;
        case 2:
          g.pline("Doctor's fee. Pay $50");
          funds = funds - 50;
          break;
        case 3:
          g.pline("Advance to Go (Collect $200)");
          funds = funds + 200;
          position = 0;
          break;
        case 4:
          g.pline("Get out of Jail Free!");
          outOfJail = true;
          break;
        case 5:
          g.pline("Go Back 3 spaces");
          position = position - 3;
          break;
        case 6:
          g.pline("You have been elected Chairman of the Board. Pay the bank $50");
          funds = funds-50;
          break;
        case 7:
          g.pline("Go to Jail. Go directly to jail, do not pass Go, do not collect $200 - stay in jail for 3 rounds");
          position = 6;
          break;
        case 8:
          g.pline("You have won second prize ina  beauty contest. Collect $10");
          funds = funds + 10;
          break;
        case 9:
          g.pline("Income tax refund. Collect $20");
          funds = funds + 20;
          break;
        case 10:
          g.pline("Pay school tax of $150");
          funds = funds - 150;
          break;
        default:
          g.pline("Nothing much happened, a pretty average day...");
      }
  }
}