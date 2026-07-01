import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class NumberGuess {
	public static void main(String args[]){
		FrameTest ft= new FrameTest();
		ft.setVisible(true);
		ft.setDefaultCloseOperation(0);   	
	} 
}   
    
class FrameTest extends JFrame{
	public FrameTest(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension scrsize = kit.getScreenSize();
		int w = scrsize.width;
		int h = scrsize.height;
		setSize(380,300);
		setLocation(w/6, h/6);
		setTitle("Game");
		setResizable(false);
		FramePanels fp = new FramePanels();
		add(fp);
	}
} 
    
class FramePanels extends JPanel implements ActionListener{
	JLabel title,label,attemptsLabel, result;
	JTextField numberField;
	JButton clickButton, restartButton, exitButton;

	int number;
	int attempts=0, maxAttempts=5;
	FramePanels(){
		setLayout(null);
		title= new JLabel("Guess the number");
		title.setFont(new Font("Segoe UI", Font.BOLD, 22));
		title.setForeground(new Color(0, 70, 140));
		title.setBounds(10,30,250, 25);
		add(title);

		label= new JLabel("Enter number:");
		label.setBounds(30,70,120, 25);
		add(label);

		numberField= new JTextField();
		numberField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		numberField.setBackground(Color.WHITE);
		numberField.setBorder(BorderFactory.createLineBorder(new Color(180,180,180)));
		numberField.setBounds(150,70,150, 25);
		add(numberField);

		clickButton=new JButton("Click me!");
		clickButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
		clickButton.setBackground(new Color(0, 120, 215));
		clickButton.setForeground(Color.WHITE);
		clickButton.setFocusPainted(false);
		clickButton.setBounds(30,120,100,45);

		restartButton=new JButton("Restart");
		restartButton.setBounds(150,120,80,45);

		exitButton=new JButton("Exit");
		exitButton.setBackground(new Color(60, 60, 60));
		exitButton.setForeground(Color.WHITE);
		exitButton.setBounds(250,120,65,45);

		attemptsLabel= new JLabel("Attempts left: 5");
		attemptsLabel.setBounds(30,200,100, 25);
		add(attemptsLabel);
		
		result= new JLabel("Result:");
		result.setBounds(150,200,200, 25);
		add(result);

		exitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
            				System.exit(0);
    			}
		});

		add(clickButton);
		add(restartButton);
		add(exitButton);

		clickButton.addActionListener(this);
		restartButton.addActionListener(this);
		
		startGame();
	}	
	public void startGame() {
		number = new Random().nextInt(100) + 1;
        		attempts = 0;

        		numberField.setText("");
        		result.setText("New Game Started!");
        		attemptsLabel.setText("Attempts left: " + maxAttempts);

        		numberField.setEnabled(true);
    		clickButton.setEnabled(true);
	}

	public void checkGuess() {
		try {
			int guess = Integer.parseInt(numberField.getText());
            			attempts++;

            			if (guess > number) {
                				result.setText("Too High!");
        				} 
			else if (guess < number) {
                				result.setText("Too Low!");
        				} 
			else {
                				result.setText("Correct!");
				clickButton.setEnabled(false);
    				numberField.setEnabled(false);
    				return;
        			}
			attemptsLabel.setText("Attempts left: " + (maxAttempts - attempts));

			if (attempts >= maxAttempts) {
				result.setText("Game Over! Number was " + number);
				clickButton.setEnabled(false);
				numberField.setEnabled(false);
				}
			numberField.setText("");
		} 
		catch (Exception ex) {
			result.setText("Enter the valid number!");
		}
    }
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==clickButton){
			checkGuess();
			}                    
		if(ae.getSource()==restartButton){
			startGame();
			}
    }
}		

