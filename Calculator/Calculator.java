import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator{
	public static void main(String args[]){
		SampleFrame s = new SampleFrame();
		s.setVisible(true);
		s.setDefaultCloseOperation(3);
	}
}

class SampleFrame extends JFrame{
	SampleFrame(){
		Toolkit kit =  Toolkit.getDefaultToolkit();
		Dimension srcSize= kit.getScreenSize();
		int w= srcSize.width;
		int h= srcSize.height;
		setSize(w/4, h/2);
		setLocation(w/5, h/6);
		//setVisible(true);
		setTitle("Calculator");
		setResizable(false);
		FramePanel fp = new FramePanel();
		add(fp);
	}
}

class FramePanel extends JPanel implements ActionListener{
	public void paintComponent(Graphics g){
        		super.paintComponent(g);
          		setBackground(Color.black);
	}	

	Font f= new Font("Arial", Font.BOLD,20);
	JTextField display;
	JButton clearButton, modButton, backspaceButton, divisionButton,
		sevenButton, eightButton, nineButton, multiplyButton, 
		foureButton, fiveButton, sixButton, subtractButton,
		oneButton, twoButton, threeButton, addButton,
		dobbleZeroButton, zeroButton, dotButton, equalButton;

	FramePanel(){	
		setLayout(null);

		display = new JTextField();
		clearButton= new JButton("c");
		modButton = new JButton("%");
		backspaceButton= new JButton("del");
		divisionButton= new JButton("/");

		sevenButton = new JButton("7");
		eightButton = new JButton("8");
		nineButton= new JButton("9");
		multiplyButton= new JButton("*");

		foureButton= new JButton("4");
		fiveButton= new JButton("5");
		sixButton= new JButton("6");
		subtractButton= new JButton("-");

		oneButton= new JButton("1");
		twoButton= new JButton("2");
		threeButton= new JButton("3");
		addButton= new JButton("+");

		dobbleZeroButton= new JButton("00");
		zeroButton= new JButton("0");
		dotButton= new JButton(".");
		equalButton= new JButton("=");

		display.setBounds(40,25,235, 45);
		clearButton.setBounds(40,75,55, 50);
		modButton.setBounds(100,75,55,50);
		backspaceButton.setBounds(160,75,55, 50);
		divisionButton.setBounds(220,75,55,50);

		sevenButton.setBounds(40,130,55, 50);
		eightButton.setBounds(100,130,55, 50);
		nineButton.setBounds(160,130,55, 50);
		multiplyButton.setBounds(220,130,55, 50);

		foureButton.setBounds(40,185,55, 50);
		fiveButton.setBounds(100,185,55, 50);
		sixButton.setBounds(160,185,55, 50);
		subtractButton.setBounds(220,185,55, 50);

		oneButton.setBounds(40,240,55, 50);
		twoButton.setBounds(100,240,55, 50);
		threeButton.setBounds(160,240,55, 50);
		addButton.setBounds(220,240,55, 50);

		dobbleZeroButton.setBounds(40,295,55, 50);
		zeroButton.setBounds(100,295,55, 50);
		dotButton.setBounds(160,295,55, 50);
		equalButton.setBounds(220,295,55, 50);


		divisionButton.setBackground(Color.orange);
		multiplyButton.setBackground(Color.orange);
		subtractButton.setBackground(Color.orange);
		addButton.setBackground(Color.orange);	
		equalButton.setBackground(Color.orange);

		//divisionButton.setForeground(Color.black);

		divisionButton.setFont(f);
		multiplyButton.setFont(f);
		subtractButton.setFont(f);
		addButton.setFont(f);
		equalButton.setFont(f);


		add(display);
		add(clearButton);
		add(modButton);
		add(backspaceButton);
		add(divisionButton);
		add(sevenButton);
		add(eightButton);
		add(nineButton);
		add(multiplyButton);
		add(foureButton);
		add(fiveButton);
		add(sixButton);
		add(subtractButton);
		add(oneButton);
		add(twoButton);
		add(threeButton);
		add(addButton);
		add(dobbleZeroButton);
		add(zeroButton);
		add(dotButton);
		add(equalButton);
	}
	
	public void actionPerformed(ActionEvent ae) {
	}
}