
public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ary[]= {1,3,7,4,6,9};
		for(int i=0;i<ary.length;i++) {
			for(int j=0;j<ary.length-1;j++) {
				if(ary[j]>ary[j+1]) {
					int temp=ary[i];
					ary[j]=ary[j+1];
					ary[j+1]=temp;
				}
			}
		}
	        for (int i=0; i<ary.length; ++i) {
	            System.out.print(ary[i] + " "); 
	        System.out.println(); 
	    } 
}
}