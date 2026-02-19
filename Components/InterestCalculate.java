import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InterestCalculate{
	public static void main(String args[]){
		SampleFrame sf= new SampleFrame();
		sf.setVisible(true);
		sf.setDefaultCloseOperation(0);	
	}
}

class SampleFrame extends JFrame{
	public SampleFrame(){
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension srcSize= kit.getScreenSize();
		int w= srcSize.width;
		int h= srcSize.height;
		setSize(w/2, h/2);
		setLocation(w/7, h/5);
		setResizable(false);
		setTitle("Maturity Amount Calcuate");
		FramePanel fp = new FramePanel();
        	add(fp);
	}
}

class FramePanel extends JPanel implements ActionListener{
	public void paintComponent(Graphics g){
        	super.paintComponent(g);
          	setBackground(new Color(255, 144, 255));
          	Font f1 = new Font("serif",Font.BOLD+Font.ITALIC,32);
          	setFont(f1);
		setForeground(Color.white);
          	g.drawString("Plz enter the Click me! button for result",20,50);
          	//g.setColor(Color.blue);
	}
	
	JLabel amount, interest, time;
	JTextField amountField, interestField, timeField;
	JButton resultButton, exitButton;
	JLabel message;
	FramePanel(){
		setLayout(null);
		amount= new JLabel("Enter amount :: ");
		interest= new JLabel("Enter interest rate :: ");
		time= new JLabel("Enter time :: ");
		
		amount.setBounds(30,100,120, 25);
		interest.setBounds(30,140,120, 25);
		time.setBounds(30,180,120, 25);

		amountField= new JTextField();
		interestField= new JTextField();
		timeField= new JTextField();

		amountField.setBounds(150,100,150, 25);
		interestField.setBounds(160,140,150, 25);
		timeField.setBounds(160,180,150, 25);
	
		add(amount);
		add(interest);
		add(time);

		add(amountField);
		add(interestField);
		add(timeField);

		
		resultButton = new JButton("Click me!");
		Font f2 = new Font("serif",Font.BOLD+Font.ITALIC,18);
		resultButton.setFont(f2);
		resultButton.setBounds(85,230,150,45);
		resultButton.setBackground(Color.yellow);
		resultButton.setForeground(Color.black);
		
		exitButton = new JButton("Exit");
		exitButton.setBounds(250,230,65,45);
		exitButton.setBackground(Color.black);
		exitButton.setForeground(Color.white);
				
	
		add(resultButton);
		add(exitButton);

		message= new JLabel("");
		message.setBounds(50,290,500,25);
		message.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,20));
		add(message);

		resultButton.addActionListener(this);
        	ExitAction ea = new ExitAction();
        	exitButton.addActionListener(ea);
   	 }
	public void actionPerformed(ActionEvent ae) {
		if(amountField.getText().isEmpty() && interestField.getText().isEmpty() && timeField.getText().isEmpty()){
			message.setText("Field cannot be empty");
		}
		else{
			try{
				double initialAmount= Double.parseDouble(amountField.getText());
				double interestRate= Double.parseDouble(interestField.getText());
				int time= Integer.parseInt(timeField.getText());

				double maturity= initialAmount* Math.pow(1+(interestRate/(4 *100.0)), 4 * time);
				message.setText("Your Maturity Amount is: Rs." +maturity);
			}
			catch(NumberFormatException nfe){
				JOptionPane.showMessageDialog(null,"Plz enter valid values");
			}
		}
		
	}
    
}

class ExitAction implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
            System.exit(0);
    }
}




