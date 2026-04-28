import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.regex.*;

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

class FramePanel extends JPanel implements ActionListener{
	public void paintComponent(Graphics g){
        		super.paintComponent(g);
          		setBackground(new Color(215, 154, 155));
          		Font f1 = new Font("serif",Font.BOLD+Font.ITALIC,32);
          		setFont(f1);
		setForeground(Color.white);
          		g.drawString("Plz enter the Click me! button for result",20,50);
          		g.setColor(Color.blue);
		}

	JLabel name, dob, emailId, phoNo, sub;
	JTextField nameField, dobField, emailIdField, phoNoField;
	String courses[]={"Select","Java","C","C++","Python"};	
	JComboBox<String> comboBox= new JComboBox<>(courses);
	JButton resultButton, exitButton;
	FramePanel(){
		setLayout(null);

		Font labelFont= new Font("Segoe UI",Font.BOLD,14);
		Font textFont= new Font("Calibri",Font.PLAIN,14);

		name= new JLabel("Enter name :: ");
		dob= new JLabel("Enter date of birth :: ");
		emailId= new JLabel("Enter email Id :: ");
		phoNo= new JLabel("Enter phone no :: ");
		sub=new JLabel("Enter Subject :: ");

		name.setBounds(30,100,120, 25);
		dob.setBounds(30,140,120, 25);
		emailId.setBounds(30,180,120, 25);
		phoNo.setBounds(30,220,120,25);
		sub.setBounds(30,260,120,25);


		nameField= new JTextField();
		dobField= new JTextField();
		emailIdField= new JTextField();
		phoNoField= new JTextField();


		nameField.setBounds(150,100,150, 25);
		dobField.setBounds(150,140,150, 25);
		emailIdField.setBounds(150,180,150, 25);
		phoNoField.setBounds(150,220,150, 25);
		comboBox.setBounds(150,260,150, 25);
        
		name.setFont(labelFont);
		dob.setFont(labelFont);
		emailId.setFont(labelFont);
		phoNo.setFont(labelFont);
		sub.setFont(labelFont);

		add(name);
		add(dob);
		add(emailId);
		add(phoNo);
		add(sub);

		nameField.setFont(textFont);
		dobField.setFont(textFont);
		emailIdField.setFont(textFont);
		phoNoField.setFont(textFont);
		comboBox.setFont(textFont);

		add(nameField);
		add(dobField);
		add(emailIdField);
		add(phoNoField);
		add(comboBox);
	
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

		resultButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		String name=nameField.getText();
		String date=dobField.getText();
		String email=emailIdField.getText();
		String phone=phoNoField.getText();
		String course = (String)comboBox.getSelectedItem();

		name=name.trim();
		date=date.trim();
		email=email.trim();
		phone=phone.trim();
		
		if(name.isEmpty()){
			JOptionPane.showMessageDialog(null,"Name field can't be empty.");
			return;
			}
		if(date.isEmpty()){
			JOptionPane.showMessageDialog(null,"Date of birth field can't be empty.");
			return;
			}
		if(email.isEmpty()){
			JOptionPane.showMessageDialog(null,"Email id field can't be empty.");
			return;
			}
		if(phone.isEmpty()){
			JOptionPane.showMessageDialog(null,"Phone no field can't be empty.");
			return;
			}
		if (course.equals("Select")) {
    			JOptionPane.showMessageDialog(null, "Please select a course.");
			return;
			}
		
		Pattern p=Pattern.compile("[^a-zA-Z]");
		Matcher m=p.matcher(name);

		if(m.find()){
			JOptionPane.showMessageDialog(null,"Name must be contain with letter. Plz enter again");
			return;
			}

		try{
			int dob=Integer.parseInt(date);
			if(dob<=0){
				JOptionPane.showMessageDialog(null,"Age must be greater than Zero. Plz enter again");
				return;
				}
		}
		catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null,""+nfe);
			return;
			}

		if((!email.toLowerCase().endsWith("@gmail.com"))&&(!email.toLowerCase().endsWith("@yahoo.com"))&&
			(!email.toLowerCase().endsWith("@hotmail.com")) && (!email.toLowerCase().endsWith("@outlook.com"))){
				JOptionPane.showMessageDialog(null," Email id doesn't valid. Plz enter again ");
				return;
			}

		if(phone.length()!=10){
			JOptionPane.showMessageDialog(null,"Phone Number must be contain exactly 10 digits.");
			return;
			}
		
		Pattern p1=Pattern.compile("[^0-9]");
		Matcher m1=p1.matcher(phone);
		
		if(m1.find()){
			JOptionPane.showMessageDialog(null,"Phone Number must be contain only digits.");
			return;
		}

		Pattern p2=Pattern.compile("^[6-9]");
		Matcher m2=p2.matcher(phone);
		
		if(!m2.find()){
			JOptionPane.showMessageDialog(null,"Phone number start with only 6-9 digits.");
			return;
		}

		int count=1, zero=0;

		char prev=phone.charAt(0);
		for(int i=1; i<phone.length(); i++){
			char c=phone.charAt(i);
			if(c==prev){
				count++;
				}
			else{
				prev=c;
				count=1;
				}
		
			if(count>6){
				JOptionPane.showMessageDialog(null," "+prev+" repitation "+count+" times");
				return;
				}
		}

		for(int i=0; i<phone.length(); i++){
			char c=phone.charAt(i);
			if(phone.charAt(i)=='0'){
				zero++;
				}
			else{
				zero=0;
				}
			if(zero>3){
				JOptionPane.showMessageDialog(null,"Zero repitation more than 3 times. Plz valid number enter.");
				return;
				}
		}
		
		new ResultFrame(name, date, email, phone, course);
	}
}

class ExitAction implements ActionListener {
    public void actionPerformed(ActionEvent ae) {
            System.exit(0);
    }
}

class ResultFrame extends JFrame {

    ResultFrame(String name, String age, String email, String phone, String course) {

        setTitle("Result");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5,1));

        add(new JLabel("Name: " + name));
        add(new JLabel("Age: " + age));
        add(new JLabel("Email: " + email));
        add(new JLabel("Phone: " + phone));
        add(new JLabel("Course: " + course));

        setVisible(true);
    }
}