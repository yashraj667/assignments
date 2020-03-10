package junit;

public class OddOrEven {
	public String oddOrEven(int a) {
		if(a==0)
			throw new RuntimeException("zero not accepted");
		if(a%2==0)
			return "Even";
		else
			return "Odd";
	}
	public static void main(String[] args) {
		OddOrEven o=new OddOrEven();
		System.out.println(o.oddOrEven(45));
	}
}
