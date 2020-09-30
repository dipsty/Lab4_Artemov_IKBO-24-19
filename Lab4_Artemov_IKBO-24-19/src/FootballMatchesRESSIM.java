
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class FootballMatchesRESSIM extends JFrame {

    int fmsrACMilanSCORE = 0;
    int fmsrNewMadridSCORE = 0;

    JButton fmsrACMilanButton = new JButton("AC Milan");
    JButton fmsrNewMadridButton = new JButton("New Madrid");

    JLabel fmsrTextOutputRESULT = new JLabel("Result: 0x0");
    JLabel fmsrTextOutputNEWSCORER = new JLabel("New Scorer: N/A");
    JLabel fmsrTextOutputWINNER = new JLabel("Winner: N/A");

    void printStats(){
        fmsrTextOutputRESULT.setText(String.format("Result: %d X %d",fmsrACMilanSCORE, fmsrNewMadridSCORE));

        if(fmsrACMilanSCORE > fmsrNewMadridSCORE) fmsrTextOutputWINNER.setText("Winner: AC Milan");
            else fmsrTextOutputWINNER.setText("Winner: Real Madrid");
    }


FootballMatchesRESSIM() {
    super ("Football Matches Result Simulator");
    super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setLayout(new FlowLayout());
    setSize(300,300);
    setResizable(false);

    add(fmsrACMilanButton);
    add(fmsrNewMadridButton);
    //////////////////////////////////
    add(fmsrTextOutputRESULT);
    add(fmsrTextOutputNEWSCORER);
    add(fmsrTextOutputWINNER);

    fmsrACMilanButton.addActionListener(aq -> {
        fmsrACMilanSCORE++;
        fmsrTextOutputNEWSCORER.setText("Last Scorer: AC Milan");
        printStats();
        });

    fmsrNewMadridButton.addActionListener(aq -> {
        fmsrNewMadridSCORE++;
        fmsrTextOutputNEWSCORER.setText("Last Scorer: Real Madrid");
        printStats();
        });
    }

    public static void main(String[] args) {
        new FootballMatchesRESSIM().setVisible(true);
    }
}
