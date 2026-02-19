import java.math.BigDecimal;
import java.math.RoundingMode;

class FloattingPointUsingBigDecimal{
	public static void main(String args[]){
		double a= 1.0395;
		BigDecimal b= new BigDecimal(a);
		b=b.setScale(2,RoundingMode.HALF_UP);
		System.out.println(b);
	}
}