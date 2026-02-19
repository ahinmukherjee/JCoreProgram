import javax.swing.JOptionPane;

public class FactorialUsingDifferentDialogBox{
	public static void main(String[] args){
	int n;
	String input=JOptionPane.showInputDialog(null,"Enter a number");
	if(input.equals("")){
		JOptionPane.showMessageDialog(null,"Field can not be empty", null, JOptionPane.WARNING_MESSAGE);
	}
	else{
		try{
			n=Integer.parseInt(input);
			FactorialTest f= new FactorialTest();
			f.fact(n);
        }
		catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null,"Plz give valid input:"+nfe, null, JOptionPane.WARNING_MESSAGE);
	}	}
    }
}

class FactorialTest{
	void fact(int n){
		int result=1;
		if(n<0){
			JOptionPane.showMessageDialog(null,"Negative nuber not possible in factorial", null, JOptionPane.ERROR_MESSAGE);
			return;
		}
		else if(n==0){	
			JOptionPane.showMessageDialog(null,"Factorial of 0 is: 1");
		}
		else{
			for(int i=1; i<=n; i++){
				result=result*i;
			}
			JOptionPane.showMessageDialog(null,"Factorial is:"+result , null, JOptionPane.PLAIN_MESSAGE);
		}
	}
}