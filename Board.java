public class Board {
  public void p(Object printedLine) { // Prints line
    System.out.println(printedLine);
  }
  public void a(Object printedLine) { // Prints line
    System.out.print(printedLine);
  }

    public String[] properties = { "<<GO>>", "Baltic Ave.", "Community Chest", "Reading Railroad", "Chance",
      "Vermont Ave.", "<JAILHOUSE>", "St.Charles Place", "Community Chest", "Pennyslvania Railroad", "Chance",
      "St.James Place", "<PARKING>", "Atlantic Ave.", "Community Chest", "B&O Railroad", "Chance", "Marvin Garden",
      "<<GO TO JAIL>>", "Pacific Ave", "Community Chest", "Short Line Railroad", "Chance", "Boardwalk" }; // 0 ~ 23

  public void printBoard() {
    p(" _________________________________________________________________________________________________________________________________");
    p("|                   |  ATLANTIC AVE   | COMMUNITY CHEST |   B&0 RAILROAD  |      CHANCE     | MARVIN GARDENS  |                   |");
    p("|      ALWAYS       |_________________|_________________|_________________|_________________|_________________|         GO        |");
    p("|       FREE        |                 |                 |                 |                 |                 |         TO        |");
    p("|      PARKING      |                 |       ___       |                 |        ?        |                 |        JAIL       |");
    p("|                   |      $260       |      |___|      |       $200      |                 |       $280      |                   |");
    p("|___________________|_________________|_________________|_________________|_________________|_________________|___________________|");
    p("|   NEW YORK AVE    |                                                                                         |    PACIFIC AVE    |");
    p("|___________________|                                                                                         |___________________|");
    p("|                   |                                                                                         |                   |");
    p("|       $200        |                                                                                         |        $300       |");
    p("|___________________|           ????????????   ???????????? ????????????????????? ????????????   ????????? ????????????????????? ?????????????????????  ????????????????????? ?????????  ?????????   ?????????        |___________________|");
    p("|      CHANCE       |           ??????????????? ?????????????????????????????????????????????????????????  ????????????????????????????????????????????????????????????????????????????????????????????????  ???????????? ????????????        |  COMMUNITY CHEST  |");
    p("|___________________|           ??????????????????????????????????????????   ??????????????????????????? ??????????????????   ??????????????????????????????????????????   ??????????????????   ?????????????????????         |___________________|");
    p("|                   |           ??????????????????????????????????????????   ????????????????????????????????????????????????   ?????????????????????????????? ?????????   ??????????????????    ???????????????          |        ___        |");
    p("|         ?         |           ????????? ????????? ????????????????????????????????????????????? ??????????????????????????????????????????????????????     ????????????????????????????????????????????????????????????           |       |___|       |");
    p("|___________________|           ?????????     ????????? ????????????????????? ?????????  ??????????????? ????????????????????? ?????????      ????????????????????? ?????????????????????????????????           |___________________|");
    p("| PENNYSLVANIA RAIL.|                                                                                         |SHORT LINE RAILROAD|");
    p("|___________________|                                                                                         |___________________|");
    p("|                   |                                                                                         |                   |");
    p("|       $200        |                                                                                         |        $200       |");
    p("|___________________|         __________________________                    __________________________        |___________________|");
    p("| COMMUNITY CHEST   |        |                          |                  |                          |       |       CHANCE      |");
    p("|___________________|        |                          |                  |                          |       |___________________|");
    p("|        ___        |        |        COMMUNITY         |                  |          CHANCE          |       |                   |");
    p("|       |___|       |        |          CHEST           |                  |                          |       |         ?         |");
    p("|___________________|        |                          |                  |                          |       |___________________|");
    p("| ST.CHARLES PLACE  |        |__________________________|                  |__________________________|       |     BOARDWALK     |");
    p("|___________________|                                                                                         |___________________|");
    p("|                   |                                                                                         |                   |");
    p("|       $140        |                                                                                         |        $400       |");
    p("|_________________________________________________________________________________________________________________________________|");
    p("|                   |   VERMONT AVE   |     CHANCE      |READING RAILROAD | COMMUNITY CHEST |   BALTIC AVE    |                   |");
    p("|                   |_________________|_________________|_________________|_________________|_________________|        GO         |");
    p("|       JAIL        |                 |                 |                 |                 |                 |        <--        |");
    p("|                   |                 |        ?        |                 |       ___       |                 |                   |");
    p("|                   |       $100      |                 |       $200      |      |___|      |       $60       |                   |");
    p("|___________________|_________________|_________________|_________________|_________________|_________________|___________________|");
  }

  public String margin() {
    String output = "";
    return output;
  }

  public void listBoard(String P1n, String P2n, String P3n, String P4n, int P1p, int P2p, int P3p, int P4p, Integer[] ownership, Integer[] level, Integer[] price, Integer[] rent) {
    p("????????????   ???????????? ????????????????????? ????????????   ????????? ????????????????????? ?????????????????????  ????????????????????? ?????????  ?????????   ?????????");
    p("??????????????? ?????????????????????????????????????????????????????????  ????????????????????????????????????????????????????????????????????????????????????????????????  ???????????? ????????????");
    p("??????????????????????????????????????????   ??????????????????????????? ??????????????????   ??????????????????????????????????????????   ??????????????????   ????????????????????? ");
    p("??????????????????????????????????????????   ????????????????????????????????????????????????   ?????????????????????????????? ?????????   ??????????????????    ??????????????? ");
    p("????????? ????????? ????????????????????????????????????????????? ??????????????????????????????????????????????????????     ???????????????????????????????????????????????????????????? ");
    p(" ");

    
    for (int i = 1; i <= 23; i++) {

      if (i )
      String numProperty = i + ".  " + properties[i-1];

      String ownedBy = "";
      
      String playerName = 
    }
    p(" ");
  } //End of listBoard()