/*
    AsciiClock program
    Written by Levi Pinkard on 10/21/2017-10/22/2017 (Late at night)
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        //Prints greeting
        System.out.println("Welcome to the Ascii Clock! Written by Levi Pinkard");
        //Defines string array for holding of the time before printout, not kept
        String[] tempTime;
        //Supplies initial time to timeGen object, in the AM/PM hour:minute:second format (change hh to HH for 24 hour)
        AsciiNumbers timeGen = new AsciiNumbers(LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        while (true) {
            //Sets timeGens number to be processed to the current time, in the AM/PM hour:minute:second format (change hh to HH for 24 hour)
            timeGen.setNumber(LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
            //Sets tempTime to the whole clock printout from the AsciiNumbers timeGen object, index is the row of the printout
            tempTime = timeGen.getString();
            //Adds buffer between each printout
            for (int y = 0; y < 50; y++) {
                System.out.println();
            }
            //Prints all seven rows of total time array
            for (int x = 0; x < 7; x++) {
                System.out.println(tempTime[x]);
            }
            //Stops constant printout, only prints once per second (need to watch for drifting)
            Thread.sleep(1000);
        }
    }
}
