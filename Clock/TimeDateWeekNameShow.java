import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDateWeekNameShow {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SampleFrame());
    }
}

class SampleFrame extends JFrame {

    public SampleFrame() {
        setTitle("Digital Clock");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setResizable(false);

        add(new ClockPanel());
        setVisible(true);
    }
}

class ClockPanel extends JPanel {

     JLabel timeLabel;
     JLabel dateLabel;
     JLabel dayLabel;
     JButton exitButton;

     SimpleDateFormat timeFormat;
     SimpleDateFormat dateFormat;
     SimpleDateFormat dayFormat;

    ClockPanel() {

        setLayout(new GridLayout(4, 1, 5, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        setBackground(new Color(30, 30, 30));

      
        timeFormat = new SimpleDateFormat("h:mm a");
        dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dayFormat = new SimpleDateFormat("EEEE");

        
        timeLabel = createLabel(28, new Color(0, 255, 120));
        dateLabel = createLabel(20, Color.WHITE);
        dayLabel = createLabel(20, Color.LIGHT_GRAY);

        exitButton = new JButton("Exit");
        exitButton.setFocusPainted(false);
        exitButton.setBackground(new Color(200, 50, 50));
        exitButton.setForeground(Color.WHITE);

        add(timeLabel);
        add(dateLabel);
        add(dayLabel);
        add(exitButton);

        Timer timer = new Timer(1000, e -> {
            Date now = new Date();
            timeLabel.setText(timeFormat.format(now));
            dateLabel.setText(dateFormat.format(now));
            dayLabel.setText(dayFormat.format(now));
        });
        timer.start();

        exitButton.addActionListener(e -> System.exit(0));
    }

    public JLabel createLabel(int fontSize, Color color) {
        JLabel label = new JLabel("", SwingConstants.CENTER);
        label.setFont(new Font("Segoe UI", Font.BOLD, fontSize));
        label.setForeground(color);
        return label;
    }
}