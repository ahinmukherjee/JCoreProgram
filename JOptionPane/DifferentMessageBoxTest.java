import javax.swing.JOptionPane;

public class DifferentMessageBoxTest {
    public static void main(String args[]){
		    JOptionPane.showMessageDialog(null,"Hello", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hello", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hello", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hello", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Hello", "title", JOptionPane.ERROR_MESSAGE);	
        JOptionPane.showConfirmDialog(null,"Don't do this", " Yes", JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showConfirmDialog(null,"Click me!", " Yes", JOptionPane.YES_NO_OPTION);

	}
}
