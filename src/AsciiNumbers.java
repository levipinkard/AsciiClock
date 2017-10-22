/*
    Written by Levi Pinkard
    10/22/2017
    Takes in a string of numbers (or a semicolon)
    Outputs an Ascii-style version as a 7 row String array for easy printout
    Supported characters look as follows
     XXX     X     XXX    XXX   X   X  XXXXX   XXX   XXXXX   XXX    XXX
    X   X   XX    X   X  X   X  X   X  X      X   X      X  X   X  X   X    X
    X   X  X X       X       X  X   X  XXXX   X         X   X   X  X   X    X
    X   X    X      X     XXX   XXXXX      X  XXXX     X     XXX    XXXX
    X   X    X     X         X      X      X  X   X   X     X   X      X    X
    X   X    X    X      X   X      X  X   X  X   X   X     X   X      X    X
     XXX   XXXXX  XXXXX   XXX       X   XXX    XXX    X      XXX    XXX
    Characters are 5 columns wide, 7 rows long
 */
public class AsciiNumbers {
    private String startString;
    //All possible ascii styled characters as string arrays, with the index being the row number
    private String[] oneAscii;
    private String[] twoAscii;
    private String[] threeAscii;
    private String[] fourAscii;
    private String[] fiveAscii;
    private String[] sixAscii;
    private String[] sevenAscii;
    private String[] eightAscii;
    private String[] nineAscii;
    private String[] zeroAscii;
    private String[] colonAscii;
    public AsciiNumbers(String numbersIn) {
        //String to turn into ASCII style
        startString = numbersIn;
        //Sets up ascii stylized versions of all numbers/characters, each array member is a row of the character (formatted for easy understanding)
        oneAscii = new String[]{"  X  ",
                                " XX  ",
                                "X X  ",
                                "  X  ",
                                "  X  ",
                                "  X  ",
                                "XXXXX"};

        twoAscii = new String[]{" XXX ",
                                "X   X",
                                "   X ",
                                "  X  ",
                                " X   ",
                                "X    ",
                                "XXXXX"};

        threeAscii = new String[]{" XXX ",
                                  "X   X",
                                  "    X",
                                  " XXX ",
                                  "    X",
                                  "X   X",
                                  " XXX "};

        fourAscii = new String[]{"X   X",
                                 "X   X",
                                 "X   X",
                                 "XXXXX",
                                 "    X",
                                 "    X",
                                 "    X"};

        fiveAscii = new String[]{"XXXXX",
                                 "X    ",
                                 "XXXX ",
                                 "    X",
                                 "    X",
                                 "X   X",
                                 " XXX "};

        sixAscii = new String[]{" XXX ",
                                "X   X",
                                "X    ",
                                "XXXX ",
                                "X   X",
                                "X   X",
                                " XXX "};

        sevenAscii = new String[]{"XXXXX",
                                  "    X",
                                  "   X ",
                                  "  X  ",
                                  " X   ",
                                  " X   ",
                                  " X   "};

        eightAscii = new String[]{" XXX ",
                                  "X   X",
                                  "X   X",
                                  " XXX ",
                                  "X   X",
                                  "X   X",
                                  " XXX "};

        nineAscii = new String[]{" XXX ",
                                 "X   X",
                                 "X   X",
                                 " XXXX",
                                 "    X",
                                 "    X",
                                 " XXX "};

        zeroAscii = new String[]{" XXX ",
                                 "X   X",
                                 "X   X",
                                 "X   X",
                                 "X   X",
                                 "X   X",
                                 " XXX "};

        colonAscii = new String[]{"     ",
                                  "  X  ",
                                  "  X  ",
                                  "     ",
                                  "  X  ",
                                  "  X  ",
                                  "     "};
    }
    //Asscifies numbers, returns results as String array
    public String[] getString() {
        return asciify(startString);
    }
    //Sets number string to be asscified (startString) to string inputted
    public void setNumber(String numberIn) {
        startString = numberIn;

    }
    //Turns string of numbers into pretty ascii-style text, returns it as a string array with each member being a row of characters
    public String[] asciify(String stringIn) {
        //Creates temporary holding variable for output
        String[] numbersOut = new String[7];
        //Initializes array members to avoid any errors when adding to array
        for (int z = 0; z < 7; z++) {
            numbersOut[z] = "";
        }
        //Goes through string of numbers one character at a time
        for (int y = 0; y < stringIn.length(); y++) {
            for (int x = 0; x < 7; x++) {
                String tempNumber = "";
                //Gets row number x for whichever number/character y is pointing to
                switch (stringIn.substring(y, y + 1)) {
                    case "1": tempNumber = oneAscii[x]; break;
                    case "2": tempNumber = twoAscii[x]; break;
                    case "3": tempNumber = threeAscii[x]; break;
                    case "4": tempNumber = fourAscii[x]; break;
                    case "5": tempNumber = fiveAscii[x]; break;
                    case "6": tempNumber = sixAscii[x]; break;
                    case "7": tempNumber = sevenAscii[x]; break;
                    case "8": tempNumber = eightAscii[x]; break;
                    case "9": tempNumber = nineAscii[x]; break;
                    case "0": tempNumber = zeroAscii[x]; break;
                    case ":": tempNumber = colonAscii[x]; break;
                }
                //Adds row of current letter to rest of the whole row, with two spaces between
                numbersOut[x] += tempNumber + "  ";
            }
        }
        //Returns whole printout array
        return numbersOut;
    }
}
