import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.event.*;

public class Clock{
	public static void main(String args[]){
		SampleFrame sf = new SampleFrame();
		sf.setVisible(true);
		sf.setDefaultCloseOperation(3);
	}
}

class SampleFrame extends JFrame{
	public SampleFrame(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension scrsize = kit.getScreenSize();
		int w= scrsize.width;
 		int h= scrsize.height;
		setSize(600, 450);
		setLocationRelativeTo(null);
		setTitle("Banking");
		setResizable(false);
		FramePanels fp=new FramePanels();
		add(fp);
	}
}

class FramePanels extends JPanel{
	Image bg;
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(new Color(255,255,255,250));
		g.drawImage(bg,0,0,getWidth(),getHeight(),this);
	}
	
	JLabel l;
	FramePanels(){
		setLayout(null);
		ImageIcon i=new ImageIcon("c:\\memory\\Ted-Gore-30-is-the-new-20.jpg");
		bg=i.getImage();

		String type[]={"Select","Admin","User"};
		JComboBox<String> comboBox=new JComboBox<>(type);
		comboBox.setBounds(30,50,150,25);
		add(comboBox);
	
		Font f= new Font("Calibri",Font.PLAIN,14);
		l=new JLabel("");
		l.setBounds(150,100,250,30);
		l.setFont(f);
		add(l);
	
		comboBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				String types= (String)comboBox.getSelectedItem();
				if (types.equals("Select")) {
    					l.setText("Please select aney one.");
					}
				if(types.equals("Admin")){
					new AdminClass();
					}
				if(types.equals("User")){
					new UserClass();
					}
			}
		});
	}
}

class AdminClass extends JFrame{
	public AdminClass(){
		setSize(600, 450);
		//setLocation(w/5, h/8);
		setLocationRelativeTo(null);
		setTitle("Bankinga");
		setResizable(false);
		add(new AdminClassFramePanels());
		setVisible(true);
	}
}

class AdminClassFramePanels extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.blue);
	}
}

class UserClass extends JFrame{
	public UserClass(){
		setSize(600, 450);
		setLocationRelativeTo(null);
		setTitle("User");
		setResizable(false);
		add(new UserClassFramePanels());
		setVisible(true);
	}
}

class UserClassFramePanels extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.GRAY);
	}

	JMenubar menubar;
	JMenu fd,rd;
	UserClassFramePanels(){
		menubar=new JMenubar();
		fd=new JMenu("FD");
		rd=new JMenu("RD");

		add.setJMenubar(menubar);
		add(menubar);
		menubar.add(fd);
		menubar.add(rd);
	}
}
