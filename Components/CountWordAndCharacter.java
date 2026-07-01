import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CountWordAndCharacter {
	public static void main(String args[]){
		FrameTest ft= new FrameTest();
		ft.setVisible(true);
		ft.setDefaultCloseOperation(3);   	
	} 
}   
    
class FrameTest extends JFrame{
	public FrameTest(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension scrsize = kit.getScreenSize();
		int w = scrsize.width;
		int h = scrsize.height;
		setSize(500,500);
		setLocation(w/6, h/6);
		setTitle("Game");
		setResizable(false);
		FramePanels fp = new FramePanels();
		add(fp);
	}
} 
    
class FramePanels extends JPanel implements ActionListener{
	JLabel label1, label2;
	JTextArea area;
	JButton n1, n2, exit;
	FramePanels(){
		setLayout(null);
		label1=new JLabel("Label1");
		label2=new JLabel("Label2");

		label1.setBounds(20,30,180,25);
		label2.setBounds(20,50,250,25);

		add(label1);
		add(label2);

		area= new JTextArea();
		area.setBounds(20,90,450,300);
		add(area);

		n1= new JButton("Word count");
		n1.setBounds(30,400,100,50);
		add(n1);
		
		n2= new JButton("Character count");
		n2.setBounds(180,400,150,50);
		add(n2);
		
		exit= new JButton("Exit");
		exit.setBounds(380,400,90,50);
		add(exit);

		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent av){
				System.exit(0);
			}
		});
		
		n1.addActionListener(this);
		n2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent av){
		String s=area.getText();
		String words[]=s.split("\\s");

		if(area.equals("")){
			label1.setText("Plz enter text");
			label2.setText("Plz enter text");
			}
		
		if(av.getSource()==n1){
			label1.setText("The number of words is: "+words.length);
			}
		if(av.getSource()==n2){
			label2.setText("The number of characters is: "+s.length());
			}
	}
}
