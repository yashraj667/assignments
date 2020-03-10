package lamdapack;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Predicate;


import com.capgemini.customer.Customer;

public class LamdaExp {

	public static void main(String[] args) {
		//BiFunction
		BiFunction<Integer,Integer,Integer> mf=(x,y)->x>y?x:y;
		System.out.println(mf.apply(34, 21));
		
		//consumer
		Consumer<String> c=s->{System.out.println(s);
								System.out.println("Display");
		};
		c.accept("home");
		
		//Predicate
		Predicate<Integer> p=(a)->{ if(a%2==0)
										return true;
									else
										return false;	
		};
		System.out.println(p.test(22));
		
		//Supplier
		IntSupplier s=()->1+2;
		System.out.println(s.getAsInt());
		
		//Using object
		Customer cus=new Customer();
		cus.setName("Reema");
		cus.setGender("F");
		
		Consumer<Customer> cs=(ct)->System.out.println(ct.getName());
		cs.accept(cus);
		
		Function<Customer,String> f=(t)->t.getGender();
		System.out.println("gender:"+f.apply(cus));
		
		Function<Customer,String> f2=Customer::getName;
		System.out.println(f2.apply(cus));
	}

}
