import java.text.DecimalFormat;
class FloattingPointUsingDecimalFormat{
	public static void main(String args[]){
		double a= 1.0395;
		DecimalFormat d= new DecimalFormat("#.00");
		System.out.println(d.format(a));
	}
}