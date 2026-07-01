import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class MoreThanImagesShowPerfectSize{
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
		setSize(800, 500);
		setLocation(w/5, h/8);
		setTitle("Display Image");
		setResizable(false);
		FramePanels fp=new FramePanels();
		add(fp);
	}
}

class FramePanels extends JPanel{
	Image images[];
	public void paintComponent(Graphics g){
		int imageHeight=250;
		int imageWidth=350;
		int gap=40;
		super.paintComponent(g);
		for(int i=0;i<images.length;i++){
			int x=20+i*(imageWidth+gap);
			int y=100;
			g.drawImage(images[i],x,y,imageWidth,imageHeight,this);
		}
	}
	FramePanels(){
		images= new Image[]{
			new ImageIcon("c:\\memory\\Ben-Hall_birds-in-flight.jpg").getImage(),
			new ImageIcon("c:\\memory\\Ted-Gore-30-is-the-new-20.jpg").getImage()
		};
	}
}

