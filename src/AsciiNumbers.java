/**
 * Created by levip on 10/21/2017.
 */
public class AsciiNumbers {
    private String startString;
    private String[] wholeNum;
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
    private String[] commaAscii;
    public AsciiNumbers(String numbersIn) {
        startString = numbersIn;
        wholeNum = new String[7];
        oneAscii = new String[]{"  X  "," XX  ", "X X  ","  X  ", "  X  ", "  X  ", "XXXXX"};
        twoAscii = new String[]{" XXX ", "X   X", "   X ", "  X  ", " X   ", "X    ","XXXXX"};
        threeAscii = new String[]{" XXX ","X   X","    X"," XXX ","    X", "X   X", " XXX "};
        fourAscii = new String[]{"X   X","X   X", "X   X", "XXXXX", "    X", "    X", "    X"};
        fiveAscii = new String[]{"XXXXX","X    ","XXXX ", "    X", "    X", "X   X", " XXX "};
        sixAscii = new String[]{" XXX ", "X   X", "X    ", "XXXX ", "X   X","X   X", " XXX "};
        sevenAscii = new String[]{"XXXXX","    X","   X ","  X  "," X   "," X   "," X   "};
        eightAscii = new String[]{" XXX ","X   X","X   X"," XXX ","X   X","X   X"," XXX "};
        nineAscii = new String[]{" XXX ", "X   X","X   X", " XXXX", "    X", "    X", " XXX "};
        zeroAscii = new String[]{" XXX ","X   X","X   X","X   X","X   X","X   X"," XXX "};
        commaAscii = new String[]{"     ", "  X  ", "  X  ", "     ", "  X  ", "  X  ", "     "};
        for (int z = 0; z < 7; z++) {
            wholeNum[z] = "";
        }
        for (int y = 0; y < startString.length(); y++) {
            for (int x = 0; x < 7; x++) {
                String tempNumber = "";
                switch (startString.substring(y, y + 1)) {
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
                    case ":":  tempNumber = commaAscii[x]; break;
                }
                wholeNum[x] += tempNumber + "  ";
            }
        }
    }
    public String[] getString() {
        return wholeNum;
    }
    public void setNumber(String numberIn) {
        startString = numberIn;
        for (int z = 0; z < 7; z++) {
            wholeNum[z] = "";
        }
        for (int y = 0; y < startString.length(); y++) {
            for (int x = 0; x < 7; x++) {
                String tempNumber = "";
                switch (startString.substring(y, y + 1)) {
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
                    case ":":  tempNumber = commaAscii[x]; break;
                }
                wholeNum[x] += tempNumber + "  ";
            }
        }
    }
}
