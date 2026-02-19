import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginPageWithJOptionPane{
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
		setLocation(w/6, h/5);
		setResizable(false);
		setTitle("Login Page");
		FramePanel fp = new FramePanel();
        	add(fp);
	}
}

class FramePanel extends JPanel implements ActionListener{
	public void paintComponent(Graphics g){
        	super.paintComponent(g);
          	setBackground(Color.white);
          	Font f1 = new Font("serif",Font.BOLD+Font.ITALIC,29);
          	setFont(f1);
          	g.drawString("Plz enter the Login button for authentication",20,50);
          	g.setColor(Color.blue);
	}
	
	JLabel userName, password;
	JTextField userField;
	JPasswordField passwordField;
	JButton loginButton, exitButton;
	JLabel message;
	FramePanel(){
		setLayout(null);
		userName= new JLabel("Enter Username:");
		password= new JLabel("Enter Password:");
		
		userName.setBounds(50,100,120, 25);
		password.setBounds(50,140,120, 25);

		userField= new JTextField();
		passwordField= new JPasswordField();

		userField.setBounds(150,100,150, 25);
		passwordField.setBounds(160,140,150, 25);
	
		add(userName);
		add(password);
		add(userField);
		add(passwordField);


		/*add(new JLabel("Enter username"));
		*add(new JLabel("Enter password"));
		*add(new JLabel("Enter password"));*/

		
		loginButton = new JButton("Login");
		loginButton.setBounds(100,200,65,45);
		loginButton.setBackground(Color.yellow);
		loginButton.setForeground(Color.black);
		
		exitButton = new JButton("Exit");
		exitButton.setBounds(200,200,65,45);
		exitButton.setBackground(Color.black);
		exitButton.setForeground(Color.white);
				
	
		add(loginButton);
		add(exitButton);

		/*message= new JLabel("");
		*message.setBounds(50,210,50,25);
		*add(message);*/
		
		loginButton.addActionListener(this);
        	ExitAction ea = new ExitAction();
        	exitButton.addActionListener(ea);
   	 }

	
    public void actionPerformed(ActionEvent ae) {
	String userNames = userField.getText();
	String password = new String(passwordField.getPassword());
	
		if(userNames.isEmpty() && password.isEmpty()){
			JOptionPane.showMessageDialog(null,"Plz enter your Username and Password","Login",JOptionPane.WARNING_MESSAGE);
		}
		else if(userNames.equals("Ahin") && password.equals("Mukherjee")){
			JOptionPane.showMessageDialog(null, "Succesfully Login.","Login",JOptionPane.PLAIN_MESSAGE);
		}
		else if(!userNames.equals("Ahin") && !password.equals("Mukherjee")){
			JOptionPane.showMessageDialog(null,"Plz enter your valid Username and Password","Login", JOptionPane.WARNING_MESSAGE);
		}
		else if(!userNames.equals("Ahin") || password.equals("Mukherjee")){
			JOptionPane.showMessageDialog(null,"Plz enter your valids Username","Login", JOptionPane.WARNING_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(null,"Doesn't match your Username and Password","Login",JOptionPane.WARNING_MESSAGE);
		}
    }
}

class ExitAction implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
            System.exit(0);
    }
}


