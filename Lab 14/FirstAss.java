package lamdaPack;
//import java.lang.Math;

public class FirstAss 
{
	public static void main(String[] args) {
		
	Power p= (x,y) -> 
	{
		double result=Math.pow(x, y);
		return result;
		
	};
	System.out.println(p.xPowery(2, 4));


}
}


@FunctionalInterface
interface Power
{
	double xPowery(int x,int y);
	
}
