
public class Arrayeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ary = {1,2,3,1};
		
		for(int i=0;i<ary.length;i++) {
			System.out.println(ary[i]);
		}
		System.out.println("*******");
		
		for(int value:ary) {
			System.out.println(value);
		}
	}

}
