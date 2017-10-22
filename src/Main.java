import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Welcome to ASCII CLOCK! Press C to Exit");
        boolean exit = false;
        String[] tempTime;
        AsciiNumbers timeGen = new AsciiNumbers(LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        while (true) {
            timeGen.setNumber(LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
            tempTime = timeGen.getString();
            for (int x = 0; x < 7; x++) {
                System.out.println(tempTime[x]);
            }
            Thread.sleep(1000);
        }
    }
}
