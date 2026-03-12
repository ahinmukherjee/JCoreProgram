import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateAndTimeShow {
    public static void main(String args[]) {
        SampleFrame sf = new SampleFrame();
        sf.setVisible(true);
        sf.setDefaultCloseOperation(3);
    }
}

class SampleFrame extends JFrame {
    public SampleFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension srcSize = kit.getScreenSize();
        int w = srcSize.width;
        int h = srcSize.height;

        setSize(w / 6, h / 4);
        setLocation(w / 17, h / 7);
        setResizable(false);
        setTitle("Clock");

        FramePanel fp = new FramePanel();
        add(fp);
    }
}

class FramePanel extends JPanel {

    private JLabel dateLabel, timeLabel;
    private JButton exitButton;
    private SimpleDateFormat dateFormat;
    private SimpleDateFormat timeFormat;

    FramePanel() {
        setLayout(null);

        dateLabel = new JLabel();
        dateLabel.setBounds(30, 30, 250, 30);
        dateLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(dateLabel);

        timeLabel = new JLabel();
        timeLabel.setBounds(30, 70, 250, 30);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(timeLabel);

        exitButton = new JButton("Exit");
        exitButton.setBounds(50, 110, 100, 35);
        exitButton.setBackground(Color.BLACK);
        exitButton.setForeground(Color.WHITE);
        add(exitButton);

        dateFormat = new SimpleDateFormat("dd MMM yyyy");
        timeFormat = new SimpleDateFormat("HH:mm:ss");


        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                dateLabel.setText("Date: " + dateFormat.format(now));
                timeLabel.setText("Time: " + timeFormat.format(now));
            }
        });
        timer.start();

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
