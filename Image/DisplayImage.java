import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class DisplayImage{
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
		setSize(1000, 500); // width , height
		setLocation(w/5, h/8);
		setTitle("Display Image");
		setResizable(false);
		FramePanels fp=new FramePanels();
		add(fp);
	}
}

class FramePanels extends JPanel{
	
	FramePanels(){
		setLayout(null);
		//ImageIcon i=new ImageIcon(getClass().getResource("Ben-Hall_birds-in-flight.jpg"));
		ImageIcon i=new ImageIcon("d:\\photo\\Ben-Hall_birds-in-flight.jpg");
		JLabel label=new JLabel(i);
		label.setBounds(0,0,i.getIconWidth(),i.getIconHeight());
		add(label);
	}
}

