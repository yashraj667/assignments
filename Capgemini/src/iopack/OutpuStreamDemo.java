package iopack;

import java.io.FileOutputStream;

public class OutpuStreamDemo {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("test1.txt",true);
			fos.write(82);
			fos.write(65600);
			fos.write('B');
			fos.write(120);
			
		}finally {
			if(fos!=null)
			fos.close();
		}
		System.out.println("Write doone");
		
	}

}
