package iopack;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriteDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("emp.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Employee e1=new Employee();
		e1.setEmpid(12);
		e1.setEmpName("Trisha");
		oos.writeObject(e1);
		oos.close();
		fos.close();
		
	}

}
