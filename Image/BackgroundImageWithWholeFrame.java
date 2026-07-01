import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class BackgroundImageWithWholeFrame{
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
		setSize(600, 500);
		setLocation(w/5, h/8);
		setTitle("Display Image");
		setResizable(false);
		FramePanels fp=new FramePanels();
		add(fp);
	}
}

class FramePanels extends JPanel{
	Image bg;
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(bg,0,0,getWidth(),getHeight(),this);
	}
	FramePanels(){
		ImageIcon i=new ImageIcon("d:\\photo\\Ben-Hall_birds-in-flight.jpg");
		bg=i.getImage();
	}
}

