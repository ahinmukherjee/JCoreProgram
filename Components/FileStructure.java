import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class FileStructure{
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
		setSize(600,500);
		setLocation(w/6, h/5);
		setResizable(false);
		setTitle("Counter");
		FramePanel fp = new FramePanel();
        		add(fp);
	}
}

class FramePanel extends JPanel{
	public void paintComponent(Graphics g){
        		super.paintComponent(g);
          		setBackground(new Color(255, 144, 255));
          	}
	
	FramePanel(){
		setLayout(null);
		DefaultMutableTreeNode course=new DefaultMutableTreeNode("Course");
		DefaultMutableTreeNode theory=new DefaultMutableTreeNode("Theory");
		DefaultMutableTreeNode practical=new DefaultMutableTreeNode("Practical");
		DefaultMutableTreeNode java=new DefaultMutableTreeNode("Java");
		DefaultMutableTreeNode coreJava=new DefaultMutableTreeNode("Core Java");
		DefaultMutableTreeNode advancedJava=new DefaultMutableTreeNode("Advanced Java");
		DefaultMutableTreeNode coreJavaTheory=new DefaultMutableTreeNode("Core Java Theory");
		DefaultMutableTreeNode advancedJavaPra=new DefaultMutableTreeNode("Advanced Java Practical");
		
		course.add(theory);
		course.add(practical);

		theory.add(java);
		theory.add(coreJava);
		theory.add(advancedJava);
	
		practical.add(coreJavaTheory);
		practical.add(advancedJavaPra);

		JTree tree=new JTree(course);
		tree.setBounds(10,15,300,300);
		add(tree);
	}   
}