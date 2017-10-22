import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static javax.swing.BoxLayout.Y_AXIS;

/**
 * Created by levip on 10/21/2017.
 */
public class GuiVersion {
    private JFrame mainFrame;
    private JPanel mainPanel;
    private JTextArea clock;
    private JLabel title;
    private String time[];
    private AsciiNumbers timeGen;
    public GuiVersion() {
        clock = new JTextArea();
        title = new JLabel("Amazing ASCII Clock");
        mainPanel = new JPanel();
        mainFrame = new JFrame();
        time = new String[7];
        timeGen = new AsciiNumbers(LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
    }
    public void runGUI() {
        time = timeGen.getString();
        clock.setText("");
        mainPanel.add(clock);
        mainFrame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        while (true) {
            timeGen = new AsciiNumbers(LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
            while (true) {
                timeGen.setNumber(LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss")));
                time = timeGen.getString();
                clock.setText("");
                for (int x = 0; x < 7; x++) {
                    clock.append(time[x] + "\n");
                }
            }
        }
    }
}
