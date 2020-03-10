package lamdapack;

public class LamdaDemo {
	public static void main(String[] args) {
		/* MaxFinderImp m=new MaxFinderImp();
		System.out.println(m.findMax(4, 5));
		*/
		
		/*
		MaxFinder f=(a,b)->a>b?a:b;		
		System.out.println(f.findMax(4, 5));			//lamda expression
		*/
		
		Display dis=s->{  System.out.println(s);					//single argument on left side so not necessary to put () it is optional 
						  System.out.println("welcome");			//when multiple lines are there in body put {};
		};														
		dis.disp("hell");
	}
}

/*
@FunctionalInterface
interface MaxFinder{
	int findMax(int a,int b);
}
*/

interface Display{
	void disp(String s);
}

/*
class MaxFinderImp implements MaxFinder{
	
	@Override
	public int findMax(int a,int b) {
		return a>b?a:b;
	}
	*/

