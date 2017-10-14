package footballTeam;

import javax.swing.*;
import java.awt.*;

public class FootballTeam extends JFrame {

    FootballTeam() {
        setTitle("My Team");
        setLayout(new GridLayout(11, 2, 15, 4));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    void addJLabel(Player player) {
        add(new JLabel("" + player.getName()));
        add(new JLabel("" + player.getPosition().name()));
    }

    void finish() {
        pack();
        setVisible(true);
    }

}
