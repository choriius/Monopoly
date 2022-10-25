import java.util.Scanner;
import java.time.LocalDateTime;
import java.lang.Math;
import java.util.ArrayList;

public class PlayerClass {

  //Player Na me
  String name = "";

  public void getPlayerName(String input) {
    name = "[" + input + "]" ;
    
  }

  //Player Stats
  int position = 0; //0 is at GO
  double funds = 1500;

  //Player P roperties
  ArrayList<Integer> property = new ArrayList<Integer>();
  int numofRail  = 0;

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

  public double decimalTwo (double input) {
    double output = input *100;
    output = Math. round(output);
    output = output /100;
    return output;
  }
}