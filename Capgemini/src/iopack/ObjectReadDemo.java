package iopack;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectReadDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("emp.txt");
		//Object o=ois.readObject();
		ObjectInputStream ois=new ObjectInputStream(fis);					//typecast (deserilisation)
		Employee o=(Employee)ois.readObject();
		///Employee e=(Employee)o;											//another way to typecast the obj
		System.out.println(o.getEmpid());
		System.out.println(o.getEmpName());
		
	}

}
