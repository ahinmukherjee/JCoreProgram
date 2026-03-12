import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentNormalForm{
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
		setTitle("Student Form");
		FramePanel fp = new FramePanel();
        add(fp);
	}
}

class FramePanel extends JPanel{
	public void paintComponent(Graphics g){
        	super.paintComponent(g);
          	setBackground(new Color(215, 154, 155));
          	Font f1 = new Font("serif",Font.BOLD+Font.ITALIC,32);
          	setFont(f1);
		    setForeground(Color.white);
          	g.drawString("Plz enter the Click me! button for result",20,50);
          	//g.setColor(Color.blue);
	}

    JLabel name, dob, emailId, phoNo, sub;
	JTextField nameField, dobField, emailIdField, phoNoField, subField;
	JButton resultButton, exitButton;
    FramePanel(){
		setLayout(null);
		name= new JLabel("Enter name :: ");
		dob= new JLabel("Enter date of brith :: ");
		emailId= new JLabel("Enter email Id :: ");
		phoNo= new JLabel("Enter phone no :: ");
		sub= new JLabel("Enter sub :: ");
		
		name.setBounds(30,100,120, 25);
		dob.setBounds(30,140,120, 25);
		emailId.setBounds(30,180,120, 25);
        phoNo.setBounds(30,220,120,25);
        sub.setBounds(30,260,120,25);


		nameField= new JTextField();
		dobField= new JTextField();
		emailIdField= new JTextField();
		phoNoField= new JTextField();
		subField= new JTextField();

		nameField.setBounds(150,100,150, 25);
		dobField.setBounds(150,140,150, 25);
		emailIdField.setBounds(150,180,150, 25);
		phoNoField.setBounds(150,220,150, 25);
		subField.setBounds(150,260,150, 25);
        
	
		add(name);
		add(dob);
		add(emailId);
		add(phoNo);
		add(sub);

		add(nameField);
		add(dobField);
		add(emailIdField);
		add(phoNoField);
		add(subField);
	
		resultButton = new JButton("Submit");
		resultButton.setBounds(100,300,75,45);
		resultButton.setBackground(Color.yellow);
		resultButton.setForeground(Color.black);
		
		exitButton = new JButton("Exit");
		exitButton.setBounds(200,300,65,45);
		exitButton.setBackground(Color.black);
		exitButton.setForeground(Color.white);
				
	
		add(resultButton);
		add(exitButton);

		ExitAction ea = new ExitAction();
        exitButton.addActionListener(ea);
    }
}

class ExitAction implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
            System.exit(0);
    }
}