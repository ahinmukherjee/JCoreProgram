import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;

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

		l=new JLabel("");
		l.setBounds(20,20,20,20);
		add(l);

		if (type.equals("Select")) {
    			l.setText("Please select aney one.");
			return;
			}
		if(type.equals("Admin")){
			new AdminClass();
			
			}
		if(type.equals("User")){
			new UserClass();
			}
	}
}

class AdminClass extends JFrame{
	public AdminClass(){
		setSize(600, 450);
		//setLocation(w/5, h/8);
		setLocationRelativeTo(null);
		setTitle("Bankinga");
		setResizable(false);
		AdminClassFramePanels afp=new AdminClassFramePanels();
		afp.setVisible(true);
		dispose();
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
		//setLocation(w/5, h/8);
		setLocationRelativeTo(null);
		setTitle("Bankingu");
		setResizable(false);
		UserClassFramePanels ufp=new UserClassFramePanels();
		ufp.setVisible(true);
		dispose();
	}
}

class UserClassFramePanels extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		setBackground(Color.YELLOW);
	}
}
